package byui.cit260.LostOnAnIsland.view;

  // @author olinhuffma


public class MapMenu extends View {

    public MapMenu() {

    }

    public void run() {
       super.run();
    }

    @Override
    public void display() {
        System.out.println("\n"
                + "\tMap Locations"
                + "\n"
                + "\n\tS-Shore \t3 hours"
                + "\n\tV-Volcano \t5 hours"
                + "\n\tF-Forest \t.5 hours"
                + "\n\tR-River \t4 hours"
                + "\n\tC-Cave          2 hours");
    }

    @Override
    public char getInput() {

        char choice = super.getInput();

        return choice;
       

    }

    @Override
    public void doAction(char choice) {
        do {
            switch (choice) {
                case 'S':
                    ChallengeDisplay.displayShoreChallenge();
                    break;
                case 'V':
                    ChallengeDisplay.displayVolcanoChallenge();
                    break;
                case 'F':
                    ForrestChallenge fc = new ForrestChallenge();
                    fc.run();
                    break;
                case 'R':
                    RiverChallenge rc = new RiverChallenge();
                    rc.run();
                    break;
                case 'C':
                    CaveChallenge cc = new CaveChallenge();
                    cc.run();
                    break;
                case 'M':
                    return;
                default:
                    System.out.println("Invalid selection. Try again or go away!");
            }

            display();

            choice = getInput();

        } while (true);
    }
}
