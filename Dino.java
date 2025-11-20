import java.util.Scanner;

public class dino {
  /* 
This is the instance variables
*/
private String names;
  private double weight;
  private String intelligence;
  private String geologicalPeriod;
 /* 
This is the no argument constructor
*/
  public dino() {
    this.names = "Unknown";
    this.weight = 0;
    this.intelligence = "Unknown";
    this.geologicalPeriod = "Unknown";
}
   /* 
This is the paramtaerized constructor
*/
   public dino(String names, double weight, String intelligence, String geologicalPeriod ) {
    this.names = names;
    this.weight = weight;
    this.intelligence = intelligence;
    this.geologicalPeriod = geologicalPeriod;
  }
 /* 
These are the getter methods
*/
  public String getName() {
    return names;
  }
  public double getWeight() { 
    return weight;
  }
   public String getIntelligence() {
    return intelligence;
  }
  public String getGeologicalPeriod() { 
    return geologicalPeriod;
  }
 /* 
This is a toString method
*/
  public String toString() {
    return "Name: " + names + " \n weight : " + weight + "intelligence level: " + intelligence + "Geological Period " + geologicalPeriod  ;
  }
  

}





