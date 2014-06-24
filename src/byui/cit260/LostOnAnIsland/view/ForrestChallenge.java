package byui.cit260.LostOnAnIsland.view;

  // @author olinhuffman
public class ForrestChallenge extends View {

    public ForrestChallenge() {

    }
    


    public void run(){
        super.run();
       
}


    @Override
    public void display() {
        System.out.println("In your island adventures, you have stumbled across"
                + " a delicious berry bush. Being very hungry, you stuff\n"
                + " your mouth full of them. It is only after you eat\n"
                + " them that you realize that they are poisonous. The\n"
                + " only chance of survival that you have is to dillute\n"
                + " the berries with water. If it takes 5 mouthfuls of\n"
                + " water to dillute the potency of 3 berries, how much\n"
                + " water must you consume if you ate 12 berries?\n"
                + "\n"
                + "\n"
                + "A) 10 mouthfuls of water\n"
                + "B) 20 mouthfuls of water\n"
                + "C) 15 mouthfuls of water\n"
                + "D) 25 mouthfuls of water\n");

    }

    @Override
    public char getInput() {

        char choice = super.getInput();

        return choice;

    }

    public void doAction(char choice) {
       while (choice != 'A' && choice != 'B'&& choice != 'C'&& choice != 'D'){
             System.out.println("Invalid selection");
             choice = getInput();
        }
 
       
        
        if (choice == 'B'){
            System.out.println("Congratulations, that is the correct answer!");
        }
        
        else{
         System.out.println("Sorry, that is the wrong answer.");   
        }

       
        } 
      
    }


