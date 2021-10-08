//German program that calculates the average of the exams and gives information about passing or failing the class
import java.util.Scanner;

public class Main {
 public static void main(String[] args){
  int mathe, physik, chemie, turkisch, geschichte, musik;
  Scanner inp = new Scanner(System.in);
  
  System.out.print("Gib deine Mathenote ein: ");
  mathe = inp.nextInt();
  System.out.print("Gib deine Physiknote ein: ");
  physik = inp.nextInt();
  System.out.print("Gib deine Chemienote ein: ");
  chemie = inp.nextInt();
  System.out.print("Gib deine Turkischnote ein: ");
  turkisch = inp.nextInt();
  System.out.print("Gib deine Geschichtenote ein: ");
  geschichte = inp.nextInt();
  System.out.print("Gib deine Musiknote ein: ");
  musik = inp.nextInt();
  
  int gesamt = (mathe+physik+chemie+turkisch+geschichte+musik);
  double durchschnitt = gesamt/6;
  String ergebnis =(durchschnitt>60)? "bestanden" : "nicht bestanden";
  System.out.println("Durchschnittsnote: "+durchschnitt+"\t"+ergebnis);
 }
}
