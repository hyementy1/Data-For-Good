import java.util.Scanner;

public class UserStory {



  /* 
This is a 1D array
*/
  private dino[] Dinos;

public dino[] getDinos() {
    return Dinos;
}
  
  public UserStory(String namesFile, String weightFile, String intelligenceFile, String geologicalFile) {
      this.Dinos = createDinos(namesFile, weightFile, intelligenceFile, geologicalFile);
  }
/* 
This method reads information from text files 
*/

  public dino[] createDinos(String namesFile, String weightFile, String intelligenceFile, String geologicalFile) {
      String[] names = FileReader.toStringArray(namesFile);
      double[] weight = FileReader.toDoubleArray(weightFile);
      String[] intelligence = FileReader.toStringArray(intelligenceFile);
      String[] geological = FileReader.toStringArray(geologicalFile);

      dino[] DinosArray = new dino[names.length];
      for (int i = 0; i < names.length; i++) {
          DinosArray[i] = new dino(names[i], weight[i], intelligence[i], geological[i]);
      }
      return DinosArray;
  }
  /* 
This is the toString method
*/
  public String toString() {
      String result = "Dinosaur:\n";
      for (dino Dino : Dinos) {
        result += Dino + "\n";
      }
      return result;
  }
  /* 
This method gets information about the different geological periods
*/
  public String firstGeologicalPeriod() {
      if (Dinos == null || Dinos.length == 0) {
          return "None";
      }

      String firstPeriod = Dinos[0].getGeologicalPeriod();
      for (int i = 1; i < Dinos.length; i++) {
          if (Dinos[i].getGeologicalPeriod().compareTo(firstPeriod) < 0) {
              firstPeriod = Dinos[i].getGeologicalPeriod();
          }
      }
      return firstPeriod;
  }
  /* 
This method gets information about the heaviest dinosaur
*/
  public double findMaxWeight() {
      if (Dinos == null || Dinos.length == 0) {
          return 0.0;    }
      double max = Dinos[0].getWeight();
      for (int i = 1; i < Dinos.length; i++) {
          if (Dinos[i].getWeight() > max) {
              max = Dinos[i].getWeight();
     }
    }
      return max;
  }
  /* 
This method gets information about the smartest dinosaur
*/
    public String findMaxIntelligence() {
      if (Dinos == null || Dinos.length == 0) {
          return "None";
      }

      String MaxIntelligence = Dinos[0].getIntelligence();
      for (int i = 1; i < Dinos.length; i++) {
          if (Dinos[i].getIntelligence().compareTo(MaxIntelligence) < 0) {
              MaxIntelligence = Dinos[i].getIntelligence();
          }
      }
      return MaxIntelligence;
    }
}