package DTHR;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	
	private static Date data = new Date();

	
	public static String horaAtual() {
		SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formata.format(data);
	}
 }
