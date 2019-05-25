/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.05.2019
 * @author 
 */
import java.util.Scanner;

public class KontrollstrukturenMethoden {  
  
  
  //Zeigt alle drei STellige Zahlen die durch alle Ihre Ziffern teilbar sind
  public void durchAlleZiffernTeilbar(){   
    int x = 111;
    int m = 0;
    int i = 0;
    boolean pruefer = false;
    int [] divisordigit = new int[3];   //array
    
    do {      
      divisordigit = getDigitsfromInteger(x);
      
      do {       
        for (int y = 0; y < 3 ; y++ ) {          
          if ((divisordigit[i]!=0) && (x%divisordigit[i] == 0)) {
            pruefer = true;
          } else {
            pruefer = false;
          } // end of if-else          
        } // end of if  
        i++; 
      }while(i <= 2 && pruefer == true);
      
      i =0;
      
      if (pruefer == true) {
        System.out.println(x + " teilbar !!");
        m++;
      } // end of if
      x++;                        
    } while(x < 1000);    
    System.out.println("\nInsgesamt " + m + " Zahlen");
  }
    
  
  //Gibt ein Array mit einzelnen Ziffern einer Zahl zurück  
  public int [] getDigitsfromInteger(int x){
    int zahl1 = x; 
    int n, m;
    int a = 0;    
    m = zahl1;
    
    while (m > 0) {   
      m = m/10;
      a++;        // a = ++; a = a+1; 
    } // end of while
    
    int [] digits = new int[a];
    
    m = zahl1;
    n = zahl1;
    
    while (a>0) { 
      digits[a-1]= m%10;
      m = m/10;
      a--;
    } // end of while    
    return digits;    
  }
  
  
  //Erstellt eine Zahlenfolge 
  public void rechneZahlenfolge(int x){
    int n = x;
    System.out.print("[" + n);
    while (n != 1) {
      System.out.print(" ,"); 
      if (n%2 > 0) {
        n = n *3 + 1;
        System.out.print(n);
      } // end of if
      else {
        n = n/2;
        System.out.print(n);
      } // end of if-else
    } // end of while
    System.out.println(" ]");
  }
  
  //stellt eine Zahlenfolge (rekrsiv)
  public int anzahlTermeRekursiv(int x) {
    int n = x;
    if (n != 1){
      System.out.print(n + ", ");
      if (n%2 > 0) {
        return anzahlTermeRekursiv((n * 3) +1) ;
      } else {
        return anzahlTermeRekursiv(n/2);
      } // end of if-else      
    } else {
      System.out.print(n+ "]");
      return n;
    } // end of if-else
  } 
  
  public int celsiuszuFahrenheit(){
    
    }
  public void set         
} // end of class KontrollstrukturenMethoden

