/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23.05.2019
 * @author 
 */
import java.util.Scanner;

public class Menue_cmd_fenster {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menuecases mn = new Menuecases();
                      

    //Vaiablen 
    int choice;
    
    
    //Menue
    do {
      System.out.println("\n\n\t\tKlassensammlung \n");
      System.out.println("1 - DurchAlleZiffernTeilbar-3 Stellig");
      System.out.println("2 - Ziffern(Anzahl)");
      System.out.println("3 - ZahlenfolgeBerechnung");
      System.out.println("\n0 - Ende");
      
      choice = sc.nextInt();
      
      //Auswahl
      switch(choice){        
        case 1:
          mn.rufecase1();
          break;
        case 2:
          mn.rufecase2();
          break;                
        case 3:
          mn.rufecase3();
          break;
        case 4:
          mn.rufecase4();
          break;
          case 5:
        break;
        default:                                                  
          System.out.println("Bitte wähle zwischen 0 - 5.");
        case 0: 
      }
    } while (choice != 0); // end of do-while
  } // end of main
  
} // end of class Menue_cmd_fenster

