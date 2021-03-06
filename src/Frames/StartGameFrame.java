/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Frames;

import byui.cit260.LostOnAnIsland.control.GameControl;
import byui.cit260.LostOnAnIsland.view.MainMenu;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author bethanytaylor
 */
public class StartGameFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuFrame2
     */
    public StartGameFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlimage = new javax.swing.JLabel();
        jlEnterName = new javax.swing.JLabel();
        tfPlayerName = new javax.swing.JTextField();
        jbQuit = new javax.swing.JButton();
        jbStart = new javax.swing.JButton();
        jlTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jspGameDesc = new javax.swing.JScrollPane();
        jtaGameDesc = new javax.swing.JTextArea();

        jLayeredPane1.setBackground(new java.awt.Color(0, 102, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jlimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/byui/cit260/LostOnAnIsland/images/LostIslands.JPG"))); // NOI18N

        jlEnterName.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        jlEnterName.setForeground(new java.awt.Color(255, 255, 255));
        jlEnterName.setText("Please Enter Your Name:");

        tfPlayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPlayerNameActionPerformed(evt);
            }
        });

        jbQuit.setBackground(new java.awt.Color(204, 0, 0));
        jbQuit.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 18)); // NOI18N
        jbQuit.setText("Quit");
        jbQuit.setToolTipText("Click here to quit the program");
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });

        jbStart.setBackground(new java.awt.Color(0, 153, 51));
        jbStart.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 18)); // NOI18N
        jbStart.setText("Start");
        jbStart.setToolTipText("Click here to start a new game");
        jbStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartActionPerformed(evt);
            }
        });

        jlTitle.setFont(new java.awt.Font("Alpha Echo", 0, 48)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlTitle.setText("Lost on an Island");

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jspGameDesc.setBackground(new java.awt.Color(0, 153, 255));
        jspGameDesc.setForeground(new java.awt.Color(255, 255, 255));

        jtaGameDesc.setEditable(false);
        jtaGameDesc.setBackground(new java.awt.Color(0, 153, 204));
        jtaGameDesc.setColumns(20);
        jtaGameDesc.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtaGameDesc.setForeground(new java.awt.Color(255, 255, 255));
        jtaGameDesc.setRows(5);
        jtaGameDesc.setText("You were flying to your remote \ncabin when you had to make an \nemergencylanding on an island. \nYour plane was destroyed in the \nprocess. Search the island for logs\nto make a signal fire and notify \nrescuers of your location.\nHurry up, you only have 12 hours!");
        jtaGameDesc.setAutoscrolls(false);
        jtaGameDesc.setBorder(null);
        jtaGameDesc.setCaretColor(new java.awt.Color(255, 255, 255));
        jspGameDesc.setViewportView(jtaGameDesc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlimage)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlEnterName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlayerName)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jspGameDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jbStart)
                        .addGap(14, 14, 14)
                        .addComponent(jbQuit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEnterName)
                            .addComponent(tfPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jspGameDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbStart)
                    .addComponent(jbQuit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbQuitActionPerformed

    private void jbStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartActionPerformed
        //get name of player entered
        String playerName = this.tfPlayerName.getText();
        //trim off excess blanks
        playerName = playerName.trim();
        //check if their naem is less than 1
        if (playerName.length() < 1) {
            JOptionPane.showMessageDialog(this, "The name entered needs to be at least one character long",
                "Invalid Player Name", JOptionPane.ERROR_MESSAGE);
            return;

          
        }

        //create the player
        GameControl.createNewPlayer(playerName);
        
        MainMenu mm = new MainMenu();
        mm.displayMainMenuFrame(playerName);
        
        this.dispose();
    }//GEN-LAST:event_jbStartActionPerformed

    private void tfPlayerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlayerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlayerNameActionPerformed

    /**
     * @param args the command line arguments
     */
   
    
    
        public JTextArea getJtaGameDesc() {
        return jtaGameDesc;
    }

    public void setJtaGameDesc(JTextArea jtaGameDesc) {
        this.jtaGameDesc = jtaGameDesc;
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbQuit;
    private javax.swing.JButton jbStart;
    private javax.swing.JLabel jlEnterName;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JLabel jlimage;
    private javax.swing.JScrollPane jspGameDesc;
    private javax.swing.JTextArea jtaGameDesc;
    private javax.swing.JTextField tfPlayerName;
    // End of variables declaration//GEN-END:variables

 
}
