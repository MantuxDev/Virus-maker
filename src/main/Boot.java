package main;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mantu
 */
public class Boot extends javax.swing.JFrame {

    /**
     * Creates new form Boot
     */
    public Boot() {
        initComponents();
        
        setLocationRelativeTo(null);
        // Icon
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon.png")));
        
        ProgressBar();
 
    }
    
public void ProgressBar() {
    // Controllo se ci sono tutti i file
    File temp;
    
    try {
        temp = new File("src/TXTfiles/lingua.txt");
        if (temp.exists()) {
            ProgressBar.setValue(10);
        } else {
            throw new FileNotFoundException("File lingua.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file lingua.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        temp = new File("src/TXTfiles/Boot/ingleseTasti.txt");
        if (temp.exists()) {
            ProgressBar.setValue(20);
        } else {
            throw new FileNotFoundException("File ingleseTasti.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file ingleseTasti.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        temp = new File("src/TXTfiles/Boot/ingleseTermini.txt");
        if (temp.exists()) {
            ProgressBar.setValue(30);
        } else {
            throw new FileNotFoundException("File ingleseTasti.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file ingleseTermini.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        temp = new File("src/TXTfiles/Boot/italianoTasti.txt");
        if (temp.exists()) {
            ProgressBar.setValue(40);
        } else {
            throw new FileNotFoundException("File ingleseTasti.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file italianoTasti.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        temp = new File("src/TXTfiles/Boot/italianoTermini.txt");
        if (temp.exists()) {
            ProgressBar.setValue(50);
        } else {
            throw new FileNotFoundException("File ingleseTasti.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file italianoTermini.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        temp = new File("src/TXTfiles/Principale/Termini.txt");
        if (temp.exists()) {
            ProgressBar.setValue(60);
        } else {
            throw new FileNotFoundException("File ingleseTasti.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file Termini.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        temp = new File("src/TXTfiles/Principale/ingleseTasti.txt");
        if (temp.exists()) {
            ProgressBar.setValue(70);
        } else {
            throw new FileNotFoundException("File ingleseTasti.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file ingleseTasti.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        temp = new File("src/TXTfiles/Principale/italianoTasti.txt");
        if (temp.exists()) {
            ProgressBar.setValue(80);
        } else {
            throw new FileNotFoundException("File ingleseTasti.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file italianoTasti.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        temp = new File("src/JSON/virusData.json");
        if (temp.exists()) {
            ProgressBar.setValue(90);
        } else {
            throw new FileNotFoundException("File ingleseTasti.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file virusData.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }
    
        try {
        temp = new File("src/JSON/virusDescrizione.json");
        if (temp.exists()) {
            ProgressBar.setValue(100);
        } else {
            throw new FileNotFoundException("File ingleseTasti.txt non trovato.");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Errore nell'apertura del file virusData.txt", "Errore",JOptionPane.ERROR_MESSAGE);
        return;
    }

try {
    FileReader temp1 = new FileReader("src/TXTfiles/Principale/Termini.txt");
    char c = (char) temp1.read();
    temp1.close();

    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            if (c == '0') {
                Termini t = new Termini();
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            } else if (c == '1') {
                Principale p = new Principale();
                p.setLocationRelativeTo(null);
                p.setVisible(true);
            }
            // Chiudo la finestra di boot
            Boot.this.setVisible(false);
            Boot.this.dispose();
        }
    });

} catch (IOException ex) {
    Logger.getLogger(Termini.class.getName()).log(Level.SEVERE, null, ex);
}






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
        ProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virus Maker");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(19, 19, 19));

        ProgressBar.setForeground(new java.awt.Color(196, 0, 22));
        ProgressBar.setStringPainted(true);

        jPanel2.setBackground(new java.awt.Color(19, 19, 19));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label.setForeground(new java.awt.Color(196, 0, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label)
                .addGap(25, 25, 25))
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
            java.util.logging.Logger.getLogger(Boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatDarkLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
