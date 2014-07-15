package byui.cit260.LostOnAnIsland.view;

  // @author olinhuffm
import Frames.MapFrame;
import byui.cit260.LostOnAnIsland.control.ChallengeControl;



public class MapMenu extends View {

    private int time[];
    
    public MapMenu() {
        time = new int[]{1, 3, 1, 3, 2, 1, 4, 2};
    }

    public void run() {
       super.run();
    }

    @Override
    public void display() {
        
        MapFrame MF = new MapFrame();
        MF.setVisible(true);
//        System.out.println("\n"
//                + "\tMap Locations"
//                + "\n"
//                + "\n\tS-Shore \t "+ time[0] +" hour"
//                + "\n\tV-Volcano \t "+ time[1] +" hours"
//                + "\n\tF-Forest \t "+ time[2] +" hour"
//                + "\n\tR-River \t "+ time[3] +" hours"
//                + "\n\tC-Cave           "+ time[4] +" hours"
//                + "\n\tP-Swamp \t "+ time[5] +" hour"
//                + "\n\tL-Valley \t "+ time[6] +" hours"
//                + "\n\tT-Tree House \t "+ time[7] +" hours"
//                + "\n\tM-Main Menu");
//        super.printTime();
    }
    
    

    @Override
    public void doAction(String value) {
        
        char choice = value.toUpperCase().charAt(0);
        do {
            switch (choice) {
                case 'S':
                    ChallengeControl.calcTimeRemaining(time[0]);
                    ShoreView sv = new ShoreView();
                    sv.run();
                    break;
                case 'V':
                    ChallengeControl.calcTimeRemaining(time[1]);
                    VolcanoChallenge vc = new VolcanoChallenge();
                    vc.run();
                    break;
                case 'F':
                    ChallengeControl.calcTimeRemaining(time[2]);
                    ForrestChallenge fc = new ForrestChallenge();
                    fc.run();
                    break;
                case 'R':
                    ChallengeControl.calcTimeRemaining(time[3]);
                    RiverChallenge rc = new RiverChallenge();
                    rc.run();
                    break;
                case 'C':
                    ChallengeControl.calcTimeRemaining(time[4]);
                    CaveChallenge cc = new CaveChallenge();
                    cc.run();
                    break;
                case 'P':
                    ChallengeControl.calcTimeRemaining(time[5]);
                    SwampChallenge pc = new SwampChallenge();
                    pc.run();
                    break;
                case 'L':
                    ChallengeControl.calcTimeRemaining(time[6]);
                    ValleyChallenge lc = new ValleyChallenge();
                    lc.run();
                    break;
                case 'T':
                    ChallengeControl.calcTimeRemaining(time[7]);
                    TreehouseChallenge tc = new TreehouseChallenge();
                    tc.run(); 
                    break;
                case 'M':
                    return;
                default:
                    System.out.println("Invalid selection. Try again or go away!");
            }

            display();

            choice = getInput().toUpperCase().charAt(0);

        } while (true);
    }
}
