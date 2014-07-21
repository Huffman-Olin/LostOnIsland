/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Frames;

/**
 *
 * @author bethanytaylor
 */
public class StorylineFrame extends javax.swing.JFrame {

    /**
     * Creates new form StorylineFrame
     */
    public StorylineFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeDesc = new javax.swing.JTextArea();
        map = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        treeDesc.setEditable(false);
        treeDesc.setColumns(20);
        treeDesc.setRows(5);
        treeDesc.setText("\\n************************************************************************************\"\n                + \"\\n You are an experienced pilot who was traveling to your cabin several hundred \"\n                + \"        \\n miles from home. Unfortunately, you experienced plane troubles and had to make\"\n                + \"        \\n an emergency landing on a remote island. With only a small knife and a limited \"\n                + \"        \\n supply of food and water, you must find 10 pieces of wood to create a signal \"\n                + \"        \\n fire and get rescued.\"\n                + \"\\n You have 12 hours before the sun goes down and all is lost! Explore the island\"\n                + \"         \\n to find the wood. Be careful, wild beasts lurk all around the island, and it \"\n                + \"         \\n is not often that a delicious, “free” meal wanders their way.\"\n                + \"\\n As you travel around to different locations to gather wood, time will be\"\n                + \"\\n added as “payment” for the wood. There are several places to gather wood\"\n                + \"\\n from, and once wood has been gathered from a location, there no longer is\"\n                + \"\\n there. If your time reaches 12 hours and you do not have enough wood, the game\"\n                + \"\\n ends and you lose.\"\n                + \"\\n\"\n                + \"\\n\"\n                + \"\\n In the beginning of the game, you will start out with 3 lives.\\n\"\n                + \"\\n At each location to collect wood, in order to pick up the wood, you must correctly\"\n                + \"         \\n answer a question. If you incorrectly answer a question, you loose a life and do not\"\n                + \"         \\n pick up the wood.\\n\"\n                + \"\\n\"\n                + \"\\n The game is over when one of the following occurs :\"\n                + \"\\n\"\n                + \"\\n \\tYou are able to collect enough wood in the allotted time (You win)\"\n                + \"\\n \\tYou are attacked and killed by a wild animal (You lose)\"\n                + \"\\n \\tYour timer exceeds 12 hours (You lose)\"\n                + \"\\n \\tYou are poisoned by wild berries\"\n                + \"\\n \\tYou run out of lives\"\n                + \"\\n**************************************************************************************\"");
        jScrollPane1.setViewportView(treeDesc);

        map.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 18)); // NOI18N
        map.setText("Main Menu");
        map.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(map)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(map)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapActionPerformed
        this.dispose();
        MainMenuFrame mmf = new MainMenuFrame();
        mmf.setVisible(true);
    }//GEN-LAST:event_mapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StorylineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StorylineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StorylineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StorylineFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StorylineFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton map;
    public javax.swing.JTextArea treeDesc;
    // End of variables declaration//GEN-END:variables
}