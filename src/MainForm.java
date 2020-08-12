
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saber
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        BoardPanel = new javax.swing.JPanel();
        BlackPanel = new javax.swing.JPanel();
        RedPanel = new javax.swing.JPanel();
        GreenPanel = new javax.swing.JPanel();
        BluePanel = new javax.swing.JPanel();
        CyanPanel = new javax.swing.JPanel();
        MagentaPanel = new javax.swing.JPanel();
        YellowPanel = new javax.swing.JPanel();
        ClearPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        BoardPanel.setBackground(new java.awt.Color(255, 255, 255));
        BoardPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BoardPanelMouseDragged(evt);
            }
        });
        BoardPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoardPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BoardPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BoardPanelLayout = new javax.swing.GroupLayout(BoardPanel);
        BoardPanel.setLayout(BoardPanelLayout);
        BoardPanelLayout.setHorizontalGroup(
            BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        BoardPanelLayout.setVerticalGroup(
            BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        BlackPanel.setBackground(new java.awt.Color(0, 0, 0));
        BlackPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 6));
        BlackPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BlackPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BlackPanelLayout = new javax.swing.GroupLayout(BlackPanel);
        BlackPanel.setLayout(BlackPanelLayout);
        BlackPanelLayout.setHorizontalGroup(
            BlackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BlackPanelLayout.setVerticalGroup(
            BlackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        RedPanel.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout RedPanelLayout = new javax.swing.GroupLayout(RedPanel);
        RedPanel.setLayout(RedPanelLayout);
        RedPanelLayout.setHorizontalGroup(
            RedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        RedPanelLayout.setVerticalGroup(
            RedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        GreenPanel.setBackground(new java.awt.Color(0, 255, 51));

        javax.swing.GroupLayout GreenPanelLayout = new javax.swing.GroupLayout(GreenPanel);
        GreenPanel.setLayout(GreenPanelLayout);
        GreenPanelLayout.setHorizontalGroup(
            GreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        GreenPanelLayout.setVerticalGroup(
            GreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        BluePanel.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout BluePanelLayout = new javax.swing.GroupLayout(BluePanel);
        BluePanel.setLayout(BluePanelLayout);
        BluePanelLayout.setHorizontalGroup(
            BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BluePanelLayout.setVerticalGroup(
            BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        CyanPanel.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout CyanPanelLayout = new javax.swing.GroupLayout(CyanPanel);
        CyanPanel.setLayout(CyanPanelLayout);
        CyanPanelLayout.setHorizontalGroup(
            CyanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        CyanPanelLayout.setVerticalGroup(
            CyanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        MagentaPanel.setBackground(new java.awt.Color(255, 0, 255));

        javax.swing.GroupLayout MagentaPanelLayout = new javax.swing.GroupLayout(MagentaPanel);
        MagentaPanel.setLayout(MagentaPanelLayout);
        MagentaPanelLayout.setHorizontalGroup(
            MagentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        MagentaPanelLayout.setVerticalGroup(
            MagentaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        YellowPanel.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout YellowPanelLayout = new javax.swing.GroupLayout(YellowPanel);
        YellowPanel.setLayout(YellowPanelLayout);
        YellowPanelLayout.setHorizontalGroup(
            YellowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        YellowPanelLayout.setVerticalGroup(
            YellowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        ClearPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CLEAR");

        javax.swing.GroupLayout ClearPanelLayout = new javax.swing.GroupLayout(ClearPanel);
        ClearPanel.setLayout(ClearPanelLayout);
        ClearPanelLayout.setHorizontalGroup(
            ClearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClearPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        ClearPanelLayout.setVerticalGroup(
            ClearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClearPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CyanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MagentaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YellowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BlackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CyanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MagentaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YellowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(BoardPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BlackPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlackPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BlackPanelMouseClicked

    private void BoardPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardPanelMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_BoardPanelMouseDragged

    private void BoardPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BoardPanelMouseClicked

    private void BoardPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoardPanelMousePressed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    public JPanel getBlackPanel() {
        return BlackPanel;
    }

    public void setBlackPanel(JPanel BlackPanel) {
        this.BlackPanel = BlackPanel;
    }

    public JPanel getBluePanel() {
        return BluePanel;
    }

    public void setBluePanel(JPanel BluePanel) {
        this.BluePanel = BluePanel;
    }

    public JPanel getClearPanel() {
        return ClearPanel;
    }

    public void setClearPanel(JPanel ClearPanel) {
        this.ClearPanel = ClearPanel;
    }

    public JPanel getCyanPanel() {
        return CyanPanel;
    }

    public void setCyanPanel(JPanel CyanPanel) {
        this.CyanPanel = CyanPanel;
    }

    public JPanel getGreenPanel() {
        return GreenPanel;
    }

    public void setGreenPanel(JPanel GreenPanel) {
        this.GreenPanel = GreenPanel;
    }

    public JPanel getMagentaPanel() {
        return MagentaPanel;
    }

    public void setMagentaPanel(JPanel PinkPanel) {
        this.MagentaPanel = PinkPanel;
    }

    public JPanel getRedPanel() {
        return RedPanel;
    }

    public void setRedPanel(JPanel RedPanel) {
        this.RedPanel = RedPanel;
    }

    public JPanel getYellowPanel() {
        return YellowPanel;
    }

    public void setYellowPanel(JPanel YellowPanel) {
        this.YellowPanel = YellowPanel;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPanel getjPanel1() {
        return BoardPanel;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.BoardPanel = jPanel1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BlackPanel;
    private javax.swing.JPanel BluePanel;
    private javax.swing.JPanel BoardPanel;
    private javax.swing.JPanel ClearPanel;
    private javax.swing.JPanel CyanPanel;
    private javax.swing.JPanel GreenPanel;
    private javax.swing.JPanel MagentaPanel;
    private javax.swing.JPanel RedPanel;
    private javax.swing.JPanel YellowPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}