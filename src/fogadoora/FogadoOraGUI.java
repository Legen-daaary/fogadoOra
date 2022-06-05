/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fogadoora;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import javax.swing.DefaultListModel;

/**
 *
 * @author Legen-daaary
 */
public class FogadoOraGUI extends javax.swing.JFrame {

    /**
     * Creates new form FogadoOraGUI
     */
    DefaultListModel tanarNevekModell = new DefaultListModel<>();
    List<Tanar> tanarok = new ArrayList<>();
    TreeSet<LocalTime> idopontokSet = new TreeSet<>();
    DefaultListModel idopontokModell = new DefaultListModel();
    DefaultListModel foglalasok = new DefaultListModel();

    public FogadoOraGUI() {
        initComponents();
        myInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fulesPanel = new javax.swing.JTabbedPane();
        idopontok = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tanarokMegjelenitese = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        idopontokMegjelenitese = new javax.swing.JList<>();
        foglalt = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        foglalasokMegjelenitese = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tanarokEsMikor = new javax.swing.JList<>();
        kilepes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fulesPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fulesPanelStateChanged(evt);
            }
        });

        tanarokMegjelenitese.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tanarokMegjeleniteseValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tanarokMegjelenitese);

        jScrollPane2.setViewportView(idopontokMegjelenitese);

        javax.swing.GroupLayout idopontokLayout = new javax.swing.GroupLayout(idopontok);
        idopontok.setLayout(idopontokLayout);
        idopontokLayout.setHorizontalGroup(
            idopontokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idopontokLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        idopontokLayout.setVerticalGroup(
            idopontokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idopontokLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(idopontokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        fulesPanel.addTab("Idopontok", idopontok);

        foglalasokMegjelenitese.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                foglalasokMegjeleniteseValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(foglalasokMegjelenitese);

        jScrollPane4.setViewportView(tanarokEsMikor);

        javax.swing.GroupLayout foglaltLayout = new javax.swing.GroupLayout(foglalt);
        foglalt.setLayout(foglaltLayout);
        foglaltLayout.setHorizontalGroup(
            foglaltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foglaltLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        foglaltLayout.setVerticalGroup(
            foglaltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foglaltLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(foglaltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        fulesPanel.addTab("Foglalt", foglalt);

        kilepes.setText("Kilépés");
        kilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilepesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fulesPanel, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kilepes)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fulesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(kilepes)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilepesActionPerformed
        System.exit(0);
    }//GEN-LAST:event_kilepesActionPerformed

    private void tanarokMegjeleniteseValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tanarokMegjeleniteseValueChanged
        String tanarNeve = tanarokMegjelenitese.getSelectedValue();
        Tanar teszt = new Tanar(0, tanarNeve);
        idopontokModell.clear();

        List<LocalTime> tanarIdopontjai = new ArrayList<>();

        for (Tanar tanar : tanarok) {
            if (teszt.equals(tanar)) {
                tanarIdopontjai.add(tanar.getIdopont());
            }
        }

        for (LocalTime idopont : idopontokSet) {
            if (tanarIdopontjai.contains(idopont)) {
                idopontokModell.addElement(idopont + " foglalt");
            } else {
                idopontokModell.addElement(idopont + " nem foglalt");
            }
        }
    }//GEN-LAST:event_tanarokMegjeleniteseValueChanged

    private void fulesPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fulesPanelStateChanged
        idopontokModell.clear();
        if (fulesPanel.getSelectedComponent().equals(foglalt)) {
            for (LocalTime idopont : idopontokSet) {
                idopontokModell.addElement(idopont);
            }
        }
    }//GEN-LAST:event_fulesPanelStateChanged

    private void foglalasokMegjeleniteseValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_foglalasokMegjeleniteseValueChanged
        int kivalasztottIndex = foglalasokMegjelenitese.getSelectedIndex();
        LocalTime kivalasztottIdopont = (LocalTime)  idopontokModell.get(kivalasztottIndex);
        foglalasok.clear();
        for (Tanar tanar : tanarok) {
            if (tanar.getIdopont().equals(kivalasztottIdopont)) {
                foglalasok.addElement(tanar.getTanarNeve() + " " + tanar.getMikorFoglaltak());
            }
        }
    }//GEN-LAST:event_foglalasokMegjeleniteseValueChanged

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
            java.util.logging.Logger.getLogger(FogadoOraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FogadoOraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FogadoOraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FogadoOraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FogadoOraGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> foglalasokMegjelenitese;
    private javax.swing.JPanel foglalt;
    private javax.swing.JTabbedPane fulesPanel;
    private javax.swing.JPanel idopontok;
    private javax.swing.JList<String> idopontokMegjelenitese;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton kilepes;
    private javax.swing.JList<String> tanarokEsMikor;
    private javax.swing.JList<String> tanarokMegjelenitese;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        feltolt("fogado.txt");
        tanarokatMegjelenit();
        idopontokMegjelenitese.setModel(idopontokModell);
        foglalasokMegjelenitese.setModel(idopontokModell);
        tanarokEsMikor.setModel(foglalasok);
    }

    private void feltolt(String fileURL) {
        try {
            RandomAccessFile bemenet = new RandomAccessFile(fileURL, "r");
            while (bemenet.getFilePointer() < bemenet.length()) {
                String sor = bemenet.readLine();
                tanarok.add(new Tanar(sor));
                idopontokSet.add(LocalTime.parse(sor.split(" ")[2]));
            }
        } catch (IOException ex) {
            System.out.println("Hiba: " + ex.getMessage());
        }
    }

    private void tanarokatMegjelenit() {
        TreeSet<String> tanarNevek = new TreeSet<>();

        for (Tanar tanar : tanarok) {
            tanarNevek.add(tanar.getTanarNeve());
        }

        tanarNevekModell.addAll(tanarNevek);

        tanarokMegjelenitese.setModel(tanarNevekModell);
    }
}