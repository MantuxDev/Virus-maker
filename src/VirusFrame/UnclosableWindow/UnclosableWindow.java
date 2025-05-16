package VirusFrame.UnclosableWindow;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mantu
 */

import Classi.RoundedPanel;
import com.formdev.flatlaf.FlatDarkLaf;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class UnclosableWindow extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    
    private static ArrayList<Evento> eventi=new ArrayList<>();
    DefaultTableModel eventiModel;
    char c;
    
    
    public UnclosableWindow() {
        initComponents();
        
        setLocationRelativeTo(null);
        // Icon
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon.png")));
        
        try {
            // Leggi Lingua
            FileReader lingua= new FileReader("src/TXTfiles/lingua.txt");
            c=(char)lingua.read();
            lingua.close();
            cambioLingua(c);
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Errore nell'apertura del file lingua.txt", "Errore",JOptionPane.ERROR_MESSAGE);
            return;
        }    
        
    }
    
    
    private void cambioLingua(char c){
        
        String [] colonne= new String[3];
        
        if(c=='0'){
            labelNome.setText("Nome:");
            labelCategoria.setText("Categoria:");
            labelEvento.setText("Aggiungi azione:");
            labelPericolo.setText("Pericolo:");
            btnEsci.setText("Esci");
            btnSalva.setText("Salva");
            btnElimina.setText("Elimina");
            this.setTitle("Personalizza il virus");
            colonne[0]="Tipo";
            colonne[1]="Titolo";
            colonne[2]="Messaggio";
            
        }
        else if(c=='1'){
            labelNome.setText("Name:");
            labelCategoria.setText("Category:");
            labelEvento.setText("Add action:");
            labelPericolo.setText("Danger:");
            btnEsci.setText("Exit");
            btnSalva.setText("Save");
            btnElimina.setText("Delete");
            this.setTitle("Customize the virus");
            colonne[0]="Type";
            colonne[1]="Title";
            colonne[2]="Message";
            
        }
        
        eventiModel=new DefaultTableModel(colonne,0){
            public boolean isCellEditable(int row, int column) {
                return false;
            }  
        };
        
        pulisciArray();
        aggiornaModel();
        
       tabellaEventi.setModel(eventiModel);
       
    }
    
    private void pulisciArray(){
        
        for(int i=0;i<eventi.size();i++){
            
            if(eventi.get(i).getRadio()==-1){
                eventi.remove(i);
            }
        }
    }
    
    public void aggiornaModel(){
        
        eventiModel.setRowCount(0);
        
        for(int i=0;i<eventi.size();i++){
            
            int temp=eventi.get(i).getRadio();
            
            String tipo="";
            String titolo="";
            String contenuto="";
            
            if(c=='0'){
                if(temp==0){
                
                switch(eventi.get(i).getAzione()){
                    case 0:
                        tipo="Errore";
                        break;
                    case 1:
                        tipo="Avviso";
                        break;
                    case 2:
                        tipo="Informazione";
                        break;
                }
                
                titolo=eventi.get(i).getTitolo();
                contenuto=eventi.get(i).getContenuto();
                
                eventiModel.addRow(new Object[]{tipo,titolo,contenuto});
                }
                else if(temp==1){
            
                    switch(eventi.get(i).getAzione()){
                        case 0:
                            tipo="Spegni pc";
                            break;
                        case 1:
                            tipo="Riavvia pc";
                            break;
                        case 2:
                            tipo="Disconetti utente";
                            break;
                        case 3:
                            tipo="Blocca il pc";
                            break;
                    }
                
                    eventiModel.addRow(new Object[]{tipo,titolo,contenuto});
                }
            }
            else if(c=='1'){
                if(temp==0){
                
                switch(eventi.get(i).getAzione()){
                    case 0:
                        tipo="Error";
                        break;
                    case 1:
                        tipo="Attention";
                        break;
                    case 2:
                        tipo="Information";
                        break;
                }
                
                titolo=eventi.get(i).getTitolo();
                contenuto=eventi.get(i).getContenuto();
                
                eventiModel.addRow(new Object[]{tipo,titolo,contenuto});
                }
                else if(temp==1){
            
                    switch(eventi.get(i).getAzione()){
                        case 0:
                            tipo="Turn off the pc";
                            break;
                        case 1:
                            tipo="Restart pc";
                            break;
                        case 2:
                            tipo="User logout";
                            break;
                        case 3:
                            tipo="Lock pc";
                            break;
                    }
                
                    eventiModel.addRow(new Object[]{tipo,titolo,contenuto});
                }
            }

        }
        
        tabellaEventi.setModel(eventiModel);
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
        jPanel2 = new RoundedPanel(30, 30);
        jLabel5 = new javax.swing.JLabel();
        btnAggiungi = new javax.swing.JButton();
        btnSalva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaEventi = new javax.swing.JTable();
        labelEvento = new javax.swing.JLabel();
        btnEsci = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelPericolo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnElimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personalizza il virus");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(19, 19, 19));

        jPanel2.setBackground(new java.awt.Color(35, 35, 35));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file/cpp.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAggiungi.setForeground(new java.awt.Color(196, 0, 22));
        btnAggiungi.setText("+");
        btnAggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiungiActionPerformed(evt);
            }
        });

        btnSalva.setText("Salva");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        tabellaEventi.setForeground(new java.awt.Color(255, 255, 255));
        tabellaEventi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Titolo", "Messaggio"
            }
        ));
        jScrollPane1.setViewportView(tabellaEventi);

        labelEvento.setForeground(new java.awt.Color(255, 255, 255));
        labelEvento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEvento.setText("Aggiungi azione: ");

        btnEsci.setText("Esci");
        btnEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsciActionPerformed(evt);
            }
        });

        labelNome.setForeground(new java.awt.Color(196, 0, 22));
        labelNome.setText("Nome: ");

        labelCategoria.setForeground(new java.awt.Color(196, 0, 22));
        labelCategoria.setText("Categoria:");

        labelPericolo.setForeground(new java.awt.Color(196, 0, 22));
        labelPericolo.setText("Pericolo:");

        jLabel6.setText("UnclosableWindow");

        jLabel7.setText("Virus");

        jLabel8.setText("30");

        btnElimina.setText("Elimina");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEsci)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalva))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnElimina)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelPericolo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelCategoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))))))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCategoria)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPericolo)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelEvento)
                        .addComponent(btnAggiungi))
                    .addComponent(btnElimina))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalva)
                    .addComponent(btnEsci))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiungiActionPerformed
        // TODO add your handling code here:
        int size=eventi.size();
        eventi.add(new Evento(-1,0,"",""));
        SelezionaEvento frame= new SelezionaEvento(eventi.get(size));
        frame.show();
        frame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_btnAggiungiActionPerformed

    private void btnEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsciActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnEsciActionPerformed

    private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaActionPerformed
        // TODO add your handling code here:
        
        if(eventi.isEmpty()){
            if(c=='0'){
                JOptionPane.showMessageDialog(null, "Inserisci almeno un azione", "Errore", JOptionPane.ERROR_MESSAGE);
            }
            else if(c=='1'){
                JOptionPane.showMessageDialog(null, "Enter at least one action", "Error", JOptionPane.ERROR_MESSAGE);
            }
            return;
        }
        
        String percorsoFolder="C:\\Users\\"+System.getProperty("user.name")+"\\Desktop\\UnclosableWindow";
        File folder= new File(percorsoFolder);
        
        if(!folder.exists()){
            if(folder.mkdir()){
                System.out.print("Folder creata");
            }
            else{
                System.out.print("Folder non creata");
            }
        }
        
        File code = new File(folder,"code.cpp");
        
        try(FileWriter write = new FileWriter(code,false)){
            
            write.write("// Code generated with Virus Maker\n");
            
            write.write("\n#include <windows.h>\n");
            
            write.write("\nint main(){\n");
                write.write("    while(true){\n");
                    for(int i=0;i<eventi.size();i++){
                        write.write("        "+eventi.get(i).lineCode()+"\n");
                    }
                write.write("    }\n");
            write.write("    return 0;\n");
            write.write("}\n");
        } catch (IOException ex) {
            Logger.getLogger(UnclosableWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sourceFileName = c == '0' ? "Leggimi.txt" : "ReadMe.txt";
        File sourceFile = new File("src/VirusFrame/UnclosableWindow/ReadMe", sourceFileName); 
        File destinationFile = new File(folder, sourceFileName);

        try{
            Files.copy(sourceFile.toPath(),destinationFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
            System.out.println(sourceFileName + " copiato con successo.");
            
            if(c=='0'){
                JOptionPane.showMessageDialog(null, "Il file 'code.cpp' si trova nella cartella `UnclosableWindow' sul desktop, insieme al file `Leggimi.txt'", "File creato con sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(c=='1'){
                JOptionPane.showMessageDialog(null, "The file 'code.cpp' is located in the `UnclosableWindow' folder on the desktop, along with the file `Readme.txt'", "File created successfully", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
                
        this.dispose();
    }//GEN-LAST:event_btnSalvaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        // TODO add your handling code here:
        
        int index=tabellaEventi.getSelectedRow();
        
        if(index==-1){
            if(c=='0'){
                JOptionPane.showMessageDialog(null, "Seleziona una riga", "Errore", JOptionPane.ERROR_MESSAGE);
            }
            else if(c=='1'){
                JOptionPane.showMessageDialog(null, "Select a row", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            eventi.remove(index);
            aggiornaModel();
        }
    }//GEN-LAST:event_btnEliminaActionPerformed

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
            java.util.logging.Logger.getLogger(UnclosableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnclosableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnclosableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnclosableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatDarkLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnclosableWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggiungi;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnEsci;
    private javax.swing.JButton btnSalva;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelEvento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPericolo;
    private javax.swing.JTable tabellaEventi;
    // End of variables declaration//GEN-END:variables
}
