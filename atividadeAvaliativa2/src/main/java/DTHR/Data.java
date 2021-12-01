package DTHR;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	
	private static Date data = new Date();  ///// data

	
	public static String horaAtual() {
		SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  //converter formato de data
		return formata.format(data);
	}
 }
