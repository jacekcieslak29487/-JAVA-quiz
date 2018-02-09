/**
 * 
 */
package quizz;

/**
 * @author Jacek Cieœlak | 29487
 * Klasa zajmuj¹ca siê podliczaniem wyników po skoñczonym teœcie 
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
        System.out.println("      Odpowiedzia³eœ/aœ na " +i+ " pytañ.");
        System.out.println("-----------------------------------------------------");
        System.out.println("   Udzieli³eœ/aœ " +pts+ " poprawnych odpowiedzi.");
        System.out.println("    Co stanowi " +proc+ "% wszystkich odpowiedzi.");
        System.out.println("-----------------------------------------------------");
        System.out.println("   Udzieli³eœ/aœ " +mistake+ " b³êdnych odpowiedzi.");
        System.out.println("-----------------------------------------------------");
        System.out.println();
		
        
		if (proc==100) System.out.println("Jesteœ genialny/a! Masz potê¿n¹ wiedzê!");
	    if (proc>=(90) && proc<100) System.out.println("Jesteœ prawie bezb³êdny/a.");
	    if (proc>=(80) && proc<(90)) System.out.println("Ca³kiem nieŸle Ci posz³o.");
	    if (proc>=(70) && proc<(80)) System.out.println("Nie¿le, nie¿le.");
	    if (proc>=(60) && proc<(70)) System.out.println("Nooo... Coœ tam wiesz...");
	    if (proc>=(50) && proc<(60)) System.out.println("Jesteœ powy¿ej przeciêtnej.");
	    if (proc>=(40) && proc<(50)) System.out.println("Jesteœ poni¿ej przeciêtnej.");
	    if (proc>=(30) && proc<(40)) System.out.println("Zawsze mo¿e byæ lepiej, potrenuj.");
	    if (proc>=(20) && proc<(30)) System.out.println("Nie wiesz co zrobic? Po³ó¿ siê! Z tak¹ wiedz¹ niewiele osi¹gniesz.");
	    if (proc>=(10) && proc<(20)) System.out.println("Trochê kiepsko, lepiej nie pomna¿aj swojego gatunku!");
	    if (proc<(10)) System.out.println("Jesteœ totalne dno!!! Lepiej siê poucz. Masz tylko 1 zwój w mózgu wiêcej od kury!");
	    
	    System.out.println();
        System.out.println("---------------------------------------------------");
	}
	

}
