package mulshankar13.microfocus;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * MultiThreaded execution of Birthday's sorted by DOB
 * @author dipakkumarrai
 *
 */
public class TwoThreads {

	static Object lock = new Object();

	private static Map<String, Date> birthdayMap = new HashMap<String, Date>(); //keep a static reference of birthday map

	public static void main(String[] args) {

		File file = new File("/home/mulshankar13/input.txt");//replace this with the actual file location on the server or a file system
		try {
			Scanner scanner = new Scanner(file);
			String id = "";
			String dd = "";
			String mm = "";
			String yyyy = "";
			while (scanner.hasNext()) {
				String curLine = scanner.nextLine();//read each line
				String[] splitted = curLine.split("\t");//split on tabs
				id = splitted[0].trim();//first is ID
				dd = splitted[1].trim();//second is day
				mm = splitted[2].trim();//third is month
				yyyy = splitted[3].trim();// final is year: as per input file so no need to worry to optimize further
				prepareBirthDayMap(id, dd, mm, yyyy);// prepare the birthday map with key:ID,value:DOB 
			}
			scanner.close();
			System.out.println("Thread ID"+"\t"+ "Person ID " +"\t"+"Month"+"\t"+ "Day"+"\t"+"Year");
			Thread thread1 = new Thread(() -> { //lambda execution of thread
				synchronized (lock) {
					try {
						lock.wait();// wait for some other thread to notify
						Map<String, Date> sortedMap = sortBirthDayMap(birthdayMap);// sort the prepared map
						printOutput("Thread2", sortedMap);// print the sorted map
						lock.notify(); // release the lock once done
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			});

			Thread thread2 = new Thread(() -> {
				synchronized (lock) {
					try {
						lock.notify();
						Map<String, Date> sortedMap = sortBirthDayMap(birthdayMap);
						printOutput("Thread1", sortedMap);
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			thread1.start();
			thread2.start();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Prints the output as :ThreadID ID DD MM YYYY:Sorted by DOB
	 * @param thread
	 * @param sortedMap
	 */
	public static void printOutput(String thread, Map<String, Date> sortedMap) {
		Date date = null;
		LocalDate localDate = null;
		int dd = 0;
		int mm = 0;
		int yyyy = 0;

		for (Entry<String, Date> entry : sortedMap.entrySet()) {
			date = entry.getValue();
			localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			dd = localDate.getDayOfMonth();
			mm = localDate.getMonthValue();
			yyyy = localDate.getYear();
			System.out.println(thread + "\t\t" + entry.getKey() + "\t\t" + dd + "\t" + mm + "\t" + yyyy);
		}
	}

	/**
	 * Prepares a birthday map for the inputs.
	 * Populates the static map birthdayMap with key as ID, value as DOB in SimpleDateFormat
	 * @param id
	 * @param dd
	 * @param mm
	 * @param yyyy
	 */
	public static void prepareBirthDayMap(String id, String dd, String mm, String yyyy) {
		String fileDateInput = dd + "/" + mm + "/" + yyyy;
//		System.out.println(fileDateInput);
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(fileDateInput);
			birthdayMap.put(id, date);
		} catch (ParseException e) {
			e.getLocalizedMessage();
		}
	}

	/**
	 * Sorts the static member birthdayMap based on DOB with the help of a 
	 * CustomDateComparator 
	 * @param birthdayMap
	 * @return sortedBirthdayMap:LinkedHashMap
	 * 
	 */
	public static Map<String, Date> sortBirthDayMap(Map<String, Date> birthdayMap) {

		Set<Entry<String, Date>> birthdaySet = birthdayMap.entrySet();
		List<Entry<String, Date>> birthdayList = new ArrayList<Entry<String, Date>>(birthdaySet);
		Collections.sort(birthdayList, new CustomDateComparator());// sorted birthdayList
		// put the list back into the map
		LinkedHashMap<String, Date> sortedBirthdayMap = new LinkedHashMap<String, Date>();
		for (Entry<String, Date> entry : birthdayList) {
			sortedBirthdayMap.put(entry.getKey(), entry.getValue());
		}
		return sortedBirthdayMap;
	}

}

/**
 * Compares two dates of java.util.Date format
 * @author dipakkumarrai
 *
 */
class CustomDateComparator implements Comparator<Entry<String, Date>> {

	@Override
	public int compare(Entry<String, Date> o1, Entry<String, Date> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}

}