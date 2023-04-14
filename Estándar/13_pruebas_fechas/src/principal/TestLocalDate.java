package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestLocalDate {

	public static void main(String[] args) {
		
		LocalDate fecha1=LocalDate.of(2020, 8, 23);
		System.out.println(fecha1);

		//Fecha a partir de un String
		String f1="20/09/2021";
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha2=LocalDate.parse(f1, dtf);
		
		//formatear fechas
		System.out.println(fecha1.format(dtf));
	}

}
