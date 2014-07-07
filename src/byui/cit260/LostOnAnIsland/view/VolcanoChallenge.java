
package byui.cit260.LostOnAnIsland.view;


  // @author olinhuffman
 
public class VolcanoChallenge extends View {
    public VolcanoChallenge() {

    }
    
    
     public void run(){

        super.run();
        
    }

    @Override
    public void display() {
        System.out.println("You have just inhaled a lot of ash! In order to "
                +  " \nfind a remedy you have to know what makes up ash. Choose"
                +  " \nthe ingredient that does not belong in ash."
                +  "\n"
                +  "\n"
                + "A) Jagged pieces of rock\n"
                + "B) Wood\n"
                + "C) Plastic\n"
                + "D) Volcanic rock\n");
    }


    public void doAction(String value) {
        char choice = value.toUpperCase().charAt(0);
       
        while (choice != 'A' && choice != 'B' && choice != 'C'&& choice != 'D'){
             System.out.println("Invalid selection");
             choice = getInput().toUpperCase().charAt(0);
        }
 
 
        if (choice == 'C'){
            System.out.println("Congratulations, that is the correct answer!");
        }
        
        else{
         System.out.println("Sorry, that is the wrong answer.");   
        }
     
    }

}
