/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Frames;

import byui.cit260.LostOnAnIsland.view.MainMenu;
import byui.cit260.LostOnAnIsland.view.MapMenu;
import byui.cit260.LostOnAnIsland.view.View;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author bethanytaylor
 */
public class MainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuFrame
     */
    public MainMenuFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jlMainMenu = new javax.swing.JLabel();
        jbMap = new javax.swing.JButton();
        i = new javax.swing.JButton();
        storyline = new javax.swing.JButton();
        jbHelp = new javax.swing.JButton();
        jbQuit = new javax.swing.JButton();
        jlWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jlMainMenu.setBackground(new java.awt.Color(255, 255, 255));
        jlMainMenu.setFont(new java.awt.Font("Marlett", 0, 36)); // NOI18N
        jlMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        jlMainMenu.setText("Main Menu");

        jbMap.setText("Map");
        jbMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMapActionPerformed(evt);
            }
        });

        i.setText("Instructions");
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        storyline.setText("Storyline");
        storyline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storylineActionPerformed(evt);
            }
        });

        jbHelp.setText("Help");
        jbHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHelpActionPerformed(evt);
            }
        });

        jbQuit.setText("Quit");
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });

        jlWelcome.setBackground(new java.awt.Color(255, 255, 255));
        jlWelcome.setFont(new java.awt.Font("Marlett", 0, 18)); // NOI18N
        jlWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jlWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlWelcome.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(storyline, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbMap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(i))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jbQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlMainMenu)
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMap)
                    .addComponent(i))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storyline)
                    .addComponent(jbHelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbQuit)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        this.dispose();
        InstructionsFrame inf = new InstructionsFrame();
        inf.setVisible(true);
    }//GEN-LAST:event_iActionPerformed

    private void jbMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMapActionPerformed
        this.dispose();
        MapMenu mm = new MapMenu();
        mm.run();
        
        
    }//GEN-LAST:event_jbMapActionPerformed

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitActionPerformed
        this.dispose();        
    }//GEN-LAST:event_jbQuitActionPerformed

    private void storylineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storylineActionPerformed
        this.dispose();
        StorylineFrame sf = new StorylineFrame();
        sf.setVisible(true);
    }//GEN-LAST:event_storylineActionPerformed

    private void jbHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHelpActionPerformed
        this.dispose();
        HelpFrame hf = new HelpFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_jbHelpActionPerformed

    /**
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenuFrame().setVisible(true);
//            }
//        
//     });
//    }

    public JLabel getJlWelcome() {
        return jlWelcome;
    }

    public void setJlWelcome(JLabel jlWelcome) {
        this.jlWelcome = jlWelcome;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton i;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbHelp;
    private javax.swing.JButton jbMap;
    private javax.swing.JButton jbQuit;
    private javax.swing.JLabel jlMainMenu;
    private javax.swing.JLabel jlWelcome;
    private javax.swing.JButton storyline;
    // End of variables declaration//GEN-END:variables
}
