package java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEg {

	public static void main(String[] args) {
		LocalDateTime l = LocalDateTime.now();
		System.out.println("date & time : " +l);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy  hh:mm:ss");
		
		String formatda = l.format(f);
		System.out.println("date & time : " + formatda);

	}

}
