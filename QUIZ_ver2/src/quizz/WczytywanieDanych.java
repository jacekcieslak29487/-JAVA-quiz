/**
 * 
 */
package quizz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jacek Cieœlak | 29487
 * Klasa zajmuj¹ca siê wczytaniem pytañ i odpowiedzi z pliku csv,
 * i ³adowaniem pytañ do klasy Main
 */
public class WczytywanieDanych {
	
	private static String trescPytania;
	private static String odp1;
	private static String odp2;
	private static String odp3;
	private static String odp4;
	private static String odpPraw;
	private static int iloscPytan = 0;
	
	public static int getIloscPytan() {
		return iloscPytan;
	}
	public static void setIloscPytan(int iloscPytan) {
		WczytywanieDanych.iloscPytan = iloscPytan;
	}
	public static String getTrescPytania() {
		return trescPytania;
	}
	public static void setTrescPytania(String trescPytania) {
		WczytywanieDanych.trescPytania = trescPytania;
	}
	public static String getOdp1() {
		return odp1;
	}
	public static void setOdp1(String odp1) {
		WczytywanieDanych.odp1 = odp1;
	}
	public static String getOdp2() {
		return odp2;
	}
	public static void setOdp2(String odp2) {
		WczytywanieDanych.odp2 = odp2;
	}
	public static String getOdp3() {
		return odp3;
	}
	public static void setOdp3(String odp3) {
		WczytywanieDanych.odp3 = odp3;
	}
	public static String getOdp4() {
		return odp4;
	}
	public static void setOdp4(String odp4) {
		WczytywanieDanych.odp4 = odp4;
	}
	public static String getOdpPraw() {
		return odpPraw;
	}
	public static void setOdpPraw(String odpPraw) {
		WczytywanieDanych.odpPraw = odpPraw;
	}
	
	static List<String> w = new ArrayList<>();
	
	public static void czytajPlik(String filePath) throws IOException {				  
			  
			  String wiersz = null;	
		  		  		  
			  try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
				  while ((wiersz = br.readLine()) !=null) { w.add(wiersz); iloscPytan++; }	
				  br.close();
				  iloscPytan /= 6; 
				  
			  }
			  catch (IOException e) { System.out.println("Nie znaleziono pliku"); }
		
	}
	
	public static void ladujPytanie() {
		
		setTrescPytania(w.get(0));
		
		setOdp1(w.get(1));
		setOdp2(w.get(2));
		setOdp3(w.get(3));
		setOdp4(w.get(4));
		
		setOdpPraw(w.get(5));
		
	}
	
	public static void usunPytanie() {
		
		String komorka = null;
		
		for (int i=0;i<6;i++) {
			komorka = w.get(0);
			if (komorka != null) w.remove(0); 
		}
		
	}
}
