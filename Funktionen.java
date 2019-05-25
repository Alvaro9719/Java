/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 24.05.2019
 * @author 
 */

public class Funktionen {
  
  //Atributten
  private double x;
  private double y;
  private double [] basis = new double [4];
  private String funktion;
  
  private double koefizienten;
  private double polynome;
  private double driskiminante;
  // Ende Attribute
  
  //Konstruktor
  public Funktionen(){
    
  }
  // Anfang Methoden
  
  //Klassenmethode
  
  //Objektmethoden
  public void erstellePunkt() {
    
  } 
  
  //RechneHorneshesschema
  public double [] rechneHorner(double ...werte){
    double [] xWerte = new double[ermittelAnzahl(werte)];        //X-werte werden in ein Array gespeichert
    
    
    return xWerte;
  }
  
//  public int[] bestimmebasis(String fuktion){
//    char [] funktionChar = new char[funktion.length()];    
//    funktionChar = funktion.toCharArray();
//
//  }
// 
    
  //Hilfsmethoden
  public int ermittelAnzahl(double ...werte){
    int xWerteAnzahl = 0; 
    
    for(double x:werte){
      xWerteAnzahl++;
    }
    return xWerteAnzahl;
  }
  
  //Get/settermethoden
  public double getX() {
    return x;
  }

  public void setX(double xNeu) {
    x = xNeu;
  }

  public void setY(double yNeu) {
    y = yNeu;
  }

  public double getY() {
    return y;
  }

  public String getFunktion() {
    return funktion;
  }

  public void setFunktion(String funktionNeu) {
    funktion = funktionNeu;
  }

  public void setKoefizienten(double koefizientenNeu) {
    koefizienten = koefizientenNeu;
  }

  public double getKoefizienten() {
    return koefizienten;
  }

  public double getPolynome() {
    return polynome;
  }

  public void setPolynome(double polynomeNeu) {
    polynome = polynomeNeu;
  }

  public void setDriskiminante(double driskiminanteNeu) {
    driskiminante = driskiminanteNeu;
  }

  public double getDriskiminante() {
    return driskiminante;
  }

  // Ende Methoden
} // end of class Funktionen

