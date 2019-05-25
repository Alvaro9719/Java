import java.util.Scanner;
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 24.05.2019
 * @author 
 */
import java.util.Scanner;

public class Menuecases {
  // Anfang Attribute
  KontrollstrukturenMethoden km = new KontrollstrukturenMethoden();
  Scanner sc = new Scanner(System.in);
  // Ende Attribute
  
  
  //Case1
  // Anfang Methoden
  public void rufecase1(){
    km.durchAlleZiffernTeilbar();
  }
  
  
  //Case 2
  public void rufecase2() {
    System.out.println("\n Geben Sie bitte eine Zahl ein");
    int zahl = sc.nextInt();
    
    System.out.print("\n| ");
    for (int i = 0;i < km.getDigitsfromInteger(zahl).length;i++ ) {
      System.out.print(km.getDigitsfromInteger(zahl)[i] + " | " );
    } // end of for
    
    System.out.println("\nIhre Zahl hat " + km.getDigitsfromInteger(zahl).length + " Ziffern");
  }
  //Case 3
  public void rufecase3() {
    System.out.println("\n Geben Sie bitte eine Zahl ein");
    int zahl = sc.nextInt();
    System.out.print("[");
    km.anzahlTermeRekursiv(zahl);
  }
  
  
  //Case 4
  public void rufecase4() {
    Funktionen p1 ; 
  
  }
  // Ende Methoden
  
} // end of class Menuecases

