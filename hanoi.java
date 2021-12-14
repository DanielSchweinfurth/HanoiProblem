package Turm;
import java.util.*;

public class hanoi {
	public static void main(String[] args){
        HanoiLöser(3,'A','C','B');
    }
	
	
	public static void HanoiLöser(int anzahl, char von, char zu, char übrig) {
		if(anzahl == 1) {
			System.out.println("Scheibe 1 von " + von + " bewegen zu " + zu);
		}else {
			HanoiLöser(anzahl -1, von, übrig, zu );
			System.out.println("Scheibe "+ anzahl + " von " + von + " bewegen zu " + zu);
			HanoiLöser(anzahl -1, übrig, zu , von );
		}
	}

}
