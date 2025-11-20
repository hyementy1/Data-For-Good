import java.util.Scanner;
 /* 
This is the prompter class for the scanner
*/
public class Prompter {
    private UserStory story;

    public Prompter(UserStory story) {
        this.story = story;
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
 /* 
These are the console options
*/
        while (isRunning) {
            System.out.println("Choose an option:");
            System.out.println("1. Show all unique geological periods");
            System.out.println("2. Show max weight");
            System.out.println("3. Show max Intelligence");
            System.out.print("> ");
            int choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {
                // print all unique geological periods in one row
                System.out.print("All Unique Geological Periods: \n");
                dino[] dinos = story.getDinos();
                String periodsPrinted = "";

                for (int i = 0; i < dinos.length; i++) {
                    String period = dinos[i].getGeologicalPeriod();
                    if (!periodsPrinted.contains(period)) {
                        if (!periodsPrinted.isEmpty()) {
                            System.out.print("\n");
                        }
                        System.out.print(period);
                        periodsPrinted += period + ","; 
                    }
                }
                System.out.println(); // move to next line
            } else if (choice == 2) {
                // find dino with max weight
                double maxWeight = story.findMaxWeight();
                for (dino d : story.getDinos()) {
                    if (d.getWeight() == maxWeight) {
                        System.out.println("Dino: " + d.getName() + ", Max Weight: " + maxWeight + ", Period: " + d.getGeologicalPeriod());
                        break;
                    }
                }
            } else if (choice == 3) {
                // find dino with max intelligence
                String maxIntelligence = story.findMaxIntelligence();
                for (dino d : story.getDinos()) {
                    if (d.getIntelligence().equals(maxIntelligence)) {
                        System.out.println("Dino: " + d.getName() + ", Intelligence: " + maxIntelligence + ", Period: " + d.getGeologicalPeriod());
                        break;
                    }
                }
            } else {
                System.out.println("Invalid choice.");
            }
 /* 
Boolean for whether the user wants to continue
*/
            System.out.println("Continue? (Y/N)");
            String cont = input.nextLine();
            if (!cont.equalsIgnoreCase("Y")) {
                isRunning = false;
            }
        }
 /* 
This is end of the programming
*/
        System.out.println("Goodbye!");
    }
}