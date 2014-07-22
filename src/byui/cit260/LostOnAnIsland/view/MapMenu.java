package byui.cit260.LostOnAnIsland.view;

  // @author olinhuffm
import Frames.MapFrame;
import byui.cit260.LostOnAnIsland.Lost.GameRun;
import byui.cit260.LostOnAnIsland.control.ChallengeControl;



public class MapMenu extends View {

    private int time[];
    
    
    public MapMenu() {
        time = new int[]{1, 3, 4, 3, 2, 1, 6, 2};
        
    }

    public int[] getTime() {
        return time;
    }

    public void setTime(int[] time) {
        this.time = time;
    }

    public void run() {
       super.run();
    }

    @Override
    public void display() {
        
        MapFrame MF = new MapFrame();
        MF.setVisible(true);
        
        MF.getTime1().setText(Integer.toString(GameRun.getGame().getCurrentTime()));
        MF.getLogs().setText(Integer.toString(GameRun.getGame().getLogs()));

        
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
                    
                    ShoreView sv = new ShoreView();
                    sv.run();
                    ChallengeControl.calcTimeRemaining(time[0]);
                    break;
                case 'V':
                    ChallengeControl.calcTimeRemaining(time[1]);
                    VolcanoChallenge vc = new VolcanoChallenge();
                    vc.run();
                    break;
                case 'F':
                    
                    ForrestChallenge fc = new ForrestChallenge();
                    fc.run();
                    ChallengeControl.calcTimeRemaining(time[2]);
                    break;
                case 'R':
                    
                    RiverChallenge rc = new RiverChallenge();
                    rc.run();
                    ChallengeControl.calcTimeRemaining(time[3]);
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
                    
                    ValleyChallenge lc = new ValleyChallenge();
                    lc.run();
                    ChallengeControl.calcTimeRemaining(time[6]);
                    break;
                case 'T':
                    
                    TreehouseChallenge tc = new TreehouseChallenge();
                    tc.run(); 
                    ChallengeControl.calcTimeRemaining(time[7]);
                    break;
                case 'M':
                    return;
                default:
                     //String message = "Invalid selection. Try again or go away!";
                     //mm.getMessage().setText(message);               
            }
            //display();
            //choice = getInput().toUpperCase().charAt(0);
        } while (false);
    }
}
