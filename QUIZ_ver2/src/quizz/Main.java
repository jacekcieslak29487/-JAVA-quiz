/**
 * 
 */
package quizz;

import java.awt.AWTException;
import java.io.*;
import java.util.Scanner;



/**
 * @author JACEK CIEåLAK 29487
 * @version 1.20
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws IOException, AWTException {
				
		int i=1, pts=0, mistake=0, ilePytan;
		String ilePyt;
		String odp, odp1;
		String plik = "H:\\WORKSPACES\\EclipseWorkspace\\QUIZ_ver2\\src\\quizz\\pytania.csv";
		
		WczytywanieDanych.czytajPlik(plik); //wywo≥anie metody wczytujπcej zawartoúÊ ca≥ego pliku z pytaniami
		Scanner scan = new Scanner(System.in);
		
		System.out.println("!!! ZACZYNASZ QUIZ !!!");
        System.out.println("Do kaødego pytania sπ 4 odpowiedzi");
        System.out.println("TYLKO JEDNA ODPOWIEDè JEST POPRAWNA");
        System.out.println("Odpowiadasz wpisujπc A, B, C, lub D i zatwierdzajπc klawiszem ENTER");
        System.out.println("Program nie rozrÛønia duøych i ma≥ych liter");
        System.out.println();
        System.out.println("!!! POWODZENIA !!!");
        System.out.println();
        System.out.println("Czy chcesz teraz rozpoczπÊ quiz? [T/N]");
        
        odp1 = scan.nextLine();
                
        if (odp1.equalsIgnoreCase("T")){
				
		System.out.println("Na ile pytaÒ chcesz odpowiedzieÊ? Max " +WczytywanieDanych.getIloscPytan());					
		ilePyt = scan.nextLine(); ilePytan = Integer.parseInt(ilePyt);		
						
		while (i<=ilePytan) { 
			
			WczytywanieDanych.ladujPytanie(); //wywo≥anie metody ≥πdujπcej pierwsze 6 rekordÛw z ArrayList = w
			
			System.out.println();
			System.out.println("Masz "+pts+" punktÛw i "+mistake+" b≥ÍdÛw.");
			System.out.println();						
			System.out.println("PYTANIE nr "+i);			
			System.out.println(WczytywanieDanych.getTrescPytania());
			System.out.println(WczytywanieDanych.getOdp1());
			System.out.println(WczytywanieDanych.getOdp2());
			System.out.println(WczytywanieDanych.getOdp3());
			System.out.println(WczytywanieDanych.getOdp4());
			System.out.println();
			
			odp = scan.nextLine();
			
			if (odp.equalsIgnoreCase(WczytywanieDanych.getOdpPraw())) { 
				System.out.println("Odpowiedü poprawna"); 
				pts++; 
			}
			else { 
				System.out.println("Odpowiedü b≥Ídna"); 
				mistake++; 
				System.out.println(" Prawid≥owa odpowiedz to " + WczytywanieDanych.getOdpPraw()); 
			}
			
			WczytywanieDanych.usunPytanie();//wywo≥anie metody usuwajπcej pierwsze 6 rekordÛw z ArrayList = w
			i++;
		}
		
		scan.close();
				
		Wyniki.wyniki(i, pts, mistake); //przekazanie wynikÛw do metody podliczajπcej
		
		System.out.println();
        System.out.println();
        System.out.println("Wciúnij ENTER, aby zakoÒczyÊ dzia≥anie programu");
        try { System.in.read(); } catch (IOException ex) { }
        }
               
        else {
            System.exit(1);
        }
	}

}
