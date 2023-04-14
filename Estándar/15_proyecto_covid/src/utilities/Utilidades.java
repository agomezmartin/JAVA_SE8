package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.Medida;

public class Utilidades {
	public static Medida convertirTextoMedida(String linea) {
		//String[] datos=linea.split("[|]");
		String[] datos=linea.split(",");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		try {
			//replaceAll para sustituir la coma por el punto
			return new Medida(datos[0],sdf.parse(datos[1]),Double.parseDouble(datos[5].replaceAll(",", ".")));
		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
