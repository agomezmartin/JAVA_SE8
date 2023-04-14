package principal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class TestConversion {

	public static void main(String[] args) {
		//conversion de Date a LocalDate
		Date input = new Date();
		System.out.println(input);
		LocalDate date = LocalDate.ofInstant(input.toInstant(), ZoneId.systemDefault());
		System.out.println(date);

		//conversion de LocalDate a Date
		LocalDate ld=LocalDate.of(2007, 7, 7);
		System.out.println(ld);
		Instant instant = ld.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		Date res = Date.from(instant);
		System.out.println(res);
		

	}

}
