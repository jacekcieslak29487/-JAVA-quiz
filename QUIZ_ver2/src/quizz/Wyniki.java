/**
 * 
 */
package quizz;

/**
 * @author Jacek Cie�lak | 29487
 * Klasa zajmuj�ca si� podliczaniem wynik�w po sko�czonym te�cie 
 */
public class Wyniki {
	
	public static void wyniki(int i, int pts, int mistake) {
		
		i=i-1;
		int proc = (100*pts)/i;
		
		System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.println("              !!! KONIEC QUIZ'u !!!          ");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("      Odpowiedzia�e�/a� na " +i+ " pyta�.");
        System.out.println("-----------------------------------------------------");
        System.out.println("   Udzieli�e�/a� " +pts+ " poprawnych odpowiedzi.");
        System.out.println("    Co stanowi " +proc+ "% wszystkich odpowiedzi.");
        System.out.println("-----------------------------------------------------");
        System.out.println("   Udzieli�e�/a� " +mistake+ " b��dnych odpowiedzi.");
        System.out.println("-----------------------------------------------------");
        System.out.println();
		
        
		if (proc==100) System.out.println("Jeste� genialny/a! Masz pot�n� wiedz�!");
	    if (proc>=(90) && proc<100) System.out.println("Jeste� prawie bezb��dny/a.");
	    if (proc>=(80) && proc<(90)) System.out.println("Ca�kiem nie�le Ci posz�o.");
	    if (proc>=(70) && proc<(80)) System.out.println("Nie�le, nie�le.");
	    if (proc>=(60) && proc<(70)) System.out.println("Nooo... Co� tam wiesz...");
	    if (proc>=(50) && proc<(60)) System.out.println("Jeste� powy�ej przeci�tnej.");
	    if (proc>=(40) && proc<(50)) System.out.println("Jeste� poni�ej przeci�tnej.");
	    if (proc>=(30) && proc<(40)) System.out.println("Zawsze mo�e by� lepiej, potrenuj.");
	    if (proc>=(20) && proc<(30)) System.out.println("Nie wiesz co zrobic? Po�� si�! Z tak� wiedz� niewiele osi�gniesz.");
	    if (proc>=(10) && proc<(20)) System.out.println("Troch� kiepsko, lepiej nie pomna�aj swojego gatunku!");
	    if (proc<(10)) System.out.println("Jeste� totalne dno!!! Lepiej si� poucz. Masz tylko 1 zw�j w m�zgu wi�cej od kury!");
	    
	    System.out.println();
        System.out.println("---------------------------------------------------");
	}
	

}
