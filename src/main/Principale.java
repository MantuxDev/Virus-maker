package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mantu
 */

import VirusFrame.UnclosableWindow.UnclosableWindow;
import com.formdev.flatlaf.FlatDarkLaf;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// Classi
import Classi.Virus;
import Classi.Descrizione;
import VirusFrame.RouletteRussa.RouletteRussa;



public class Principale extends javax.swing.JFrame {

    /**
     * Creates new form Principale
     */
    
    
    // ArrayList
    ArrayList<Virus> virus= new ArrayList<>();
    ArrayList<Virus> worm= new ArrayList<>();
    ArrayList<Virus> trojan= new ArrayList<>();
    ArrayList<Virus> ransomware= new ArrayList<>();
    ArrayList<Virus> spyware= new ArrayList<>();
    ArrayList<Virus> adware= new ArrayList<>();
    ArrayList<Virus> rootkit= new ArrayList<>();
    ArrayList<Virus> game= new ArrayList<>();
    
    // Modelli liste
    DefaultListModel virusModel=new DefaultListModel<>();
    DefaultListModel wormModel=new DefaultListModel<>();
    DefaultListModel trojanModel=new DefaultListModel<>();
    DefaultListModel ransomModel=new DefaultListModel<>();
    DefaultListModel spyModel=new DefaultListModel<>();
    DefaultListModel adModel=new DefaultListModel<>();
    DefaultListModel rootModel=new DefaultListModel<>();
    DefaultListModel gameModel=new DefaultListModel<>();
    DefaultListModel clearModel=new DefaultListModel<>();
    
    // Descrizioni categorie Virus
    Descrizione virusDesc;
    Descrizione wormDesc;
    Descrizione trojanDesc;
    Descrizione ransomDesc;
    Descrizione spyDesc;
    Descrizione adDesc;
    Descrizione rootDesc;
    Descrizione gameDesc;
    
    char c;

    
    public Principale() {
        initComponents();
        
        // Icon
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon.png")));
        btnAvanti.setEnabled(false);
        
        try {
            // Leggi Lingua
            FileReader lingua= new FileReader("src/TXTfiles/lingua.txt");
            c=(char)lingua.read();
            ComboBoxLingua.setSelectedIndex(Character.getNumericValue(c));
            lingua.close();
        } catch (IOException ex) {
            Logger.getLogger(Termini.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            caricaJSONdata();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        caricaModel();
        
        rbtnVirus.setSelected(true);
        
        if(c=='0'){
            TextAreaInfo.setText(virusDesc.getIt());
        }
        else if(c=='1'){
            TextAreaInfo.setText(virusDesc.getEn());
        }
        
        ListaVirus.setModel(virusModel);
        
        
        ListaVirus.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
            
                int index=ListaVirus.getSelectedIndex();
                
                if(rbtnVirus.isSelected() && !ListaVirus.isSelectionEmpty()){
                    TextAreaInfo.setText(virus.get(index).info(c));
                    
                    if(virus.get(index).getAttivo()==true){
                        btnAvanti.setEnabled(true);
                    }else{
                        btnAvanti.setEnabled(false);
                    }
                }
                else if(rbtnWorm.isSelected() && !ListaVirus.isSelectionEmpty()){
                    TextAreaInfo.setText(worm.get(index).info(c));
                    
                    if(worm.get(index).getAttivo()==true){
                        btnAvanti.setEnabled(true);
                    }else{
                        btnAvanti.setEnabled(false);
                    }
                }
                else if(rbtnTrojan.isSelected() && !ListaVirus.isSelectionEmpty()){
                    TextAreaInfo.setText(trojan.get(index).info(c));
                    
                    if(trojan.get(index).getAttivo()==true){
                        btnAvanti.setEnabled(true);
                    }else{
                        btnAvanti.setEnabled(false);
                    }
                }
                else if(rbtnSpyware.isSelected() && !ListaVirus.isSelectionEmpty()){
                    TextAreaInfo.setText(spyware.get(index).info(c));
                    
                    if(spyware.get(index).getAttivo()==true){
                        btnAvanti.setEnabled(true);
                    }else{
                        btnAvanti.setEnabled(false);
                    }
                }
                else if(rbtnAdware.isSelected() && !ListaVirus.isSelectionEmpty()){
                    TextAreaInfo.setText(adware.get(index).info(c));
                    
                    if(adware.get(index).getAttivo()==true){
                        btnAvanti.setEnabled(true);
                    }else{
                        btnAvanti.setEnabled(false);
                    }
                }
                else if(rbtnRootkit.isSelected() && !ListaVirus.isSelectionEmpty()){
                    TextAreaInfo.setText(rootkit.get(index).info(c));
                    
                    if(rootkit.get(index).getAttivo()==true){
                        btnAvanti.setEnabled(true);
                    }else{
                        btnAvanti.setEnabled(false);
                    }
                }
                else if(rbtnGame.isSelected() && !ListaVirus.isSelectionEmpty()){
                    TextAreaInfo.setText(game.get(index).info(c));
                    
                    if(game.get(index).getAttivo()==true){
                        btnAvanti.setEnabled(true);
                    }else{
                        btnAvanti.setEnabled(false);
                    }
                }
                else{
                    TextAreaInfo.setText("");
                }

            TextAreaInfo.setCaretPosition(0);
        }
    });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SceltaVirus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtnVirus = new javax.swing.JRadioButton();
        rbtnWorm = new javax.swing.JRadioButton();
        rbtnTrojan = new javax.swing.JRadioButton();
        rbtnRansomware = new javax.swing.JRadioButton();
        LabelScegliTipo = new javax.swing.JLabel();
        rbtnSpyware = new javax.swing.JRadioButton();
        rbtnAdware = new javax.swing.JRadioButton();
        rbtnRootkit = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaVirus = new javax.swing.JList<>();
        LabelScegliVirus = new javax.swing.JLabel();
        btnAvanti = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaInfo = new javax.swing.JTextArea();
        LabelInformazioni = new javax.swing.JLabel();
        LabelLingua = new javax.swing.JLabel();
        ComboBoxLingua = new javax.swing.JComboBox<>();
        rbtnGame = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virus Maker");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(19, 19, 19));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        SceltaVirus.add(rbtnVirus);
        rbtnVirus.setForeground(new java.awt.Color(255, 255, 255));
        rbtnVirus.setText("Virus");
        rbtnVirus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnVirusActionPerformed(evt);
            }
        });

        SceltaVirus.add(rbtnWorm);
        rbtnWorm.setForeground(new java.awt.Color(255, 255, 255));
        rbtnWorm.setText("Worm");
        rbtnWorm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnWormActionPerformed(evt);
            }
        });

        SceltaVirus.add(rbtnTrojan);
        rbtnTrojan.setForeground(new java.awt.Color(255, 255, 255));
        rbtnTrojan.setText("Trojan");
        rbtnTrojan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTrojanActionPerformed(evt);
            }
        });

        SceltaVirus.add(rbtnRansomware);
        rbtnRansomware.setForeground(new java.awt.Color(255, 255, 255));
        rbtnRansomware.setText("Ransomware");
        rbtnRansomware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRansomwareActionPerformed(evt);
            }
        });

        LabelScegliTipo.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        LabelScegliTipo.setForeground(new java.awt.Color(255, 255, 255));
        LabelScegliTipo.setText("Scegli la tipologia di virus:");

        SceltaVirus.add(rbtnSpyware);
        rbtnSpyware.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSpyware.setText("Spyware");
        rbtnSpyware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSpywareActionPerformed(evt);
            }
        });

        SceltaVirus.add(rbtnAdware);
        rbtnAdware.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAdware.setText("Adware");
        rbtnAdware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAdwareActionPerformed(evt);
            }
        });

        SceltaVirus.add(rbtnRootkit);
        rbtnRootkit.setForeground(new java.awt.Color(255, 255, 255));
        rbtnRootkit.setText("Rootkit");
        rbtnRootkit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRootkitActionPerformed(evt);
            }
        });

        ListaVirus.setBorder(null);
        ListaVirus.setForeground(new java.awt.Color(255, 255, 255));
        ListaVirus.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListaVirus);

        LabelScegliVirus.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        LabelScegliVirus.setForeground(new java.awt.Color(255, 255, 255));
        LabelScegliVirus.setText("Scegli il virus:");

        btnAvanti.setText("Avanti");
        btnAvanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvantiActionPerformed(evt);
            }
        });

        TextAreaInfo.setEditable(false);
        TextAreaInfo.setColumns(20);
        TextAreaInfo.setLineWrap(true);
        TextAreaInfo.setRows(5);
        TextAreaInfo.setTabSize(5);
        TextAreaInfo.setWrapStyleWord(true);
        TextAreaInfo.setFocusable(false);
        jScrollPane2.setViewportView(TextAreaInfo);

        LabelInformazioni.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        LabelInformazioni.setForeground(new java.awt.Color(255, 255, 255));
        LabelInformazioni.setText("Informazioni:");

        LabelLingua.setForeground(new java.awt.Color(255, 255, 255));
        LabelLingua.setText("Seleziona lingua:");

        ComboBoxLingua.setBackground(new java.awt.Color(51, 51, 51));
        ComboBoxLingua.setForeground(new java.awt.Color(255, 255, 255));
        ComboBoxLingua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Italiano", "English" }));
        ComboBoxLingua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxLinguaActionPerformed(evt);
            }
        });

        SceltaVirus.add(rbtnGame);
        rbtnGame.setForeground(new java.awt.Color(255, 255, 255));
        rbtnGame.setText("Game");
        rbtnGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnTrojan)
                    .addComponent(rbtnWorm)
                    .addComponent(rbtnSpyware)
                    .addComponent(rbtnAdware)
                    .addComponent(rbtnRootkit)
                    .addComponent(LabelScegliTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnVirus)
                    .addComponent(rbtnRansomware)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelLingua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxLingua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbtnGame))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelScegliVirus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(LabelInformazioni, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvanti, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelScegliTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelScegliVirus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelInformazioni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvanti))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnVirus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnWorm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnTrojan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnRansomware)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnSpyware)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnAdware, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnRootkit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnGame)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelLingua)
                            .addComponent(ComboBoxLingua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void caricaJSONdata() throws FileNotFoundException{
        
        try{
            // Creazione oggetto Gson
            Gson gson= new Gson();
        
            // Lettura file JSON
            FileReader reader= new FileReader("src/JSON/virusData.json");
        
            // lettura di dati dal file JSON
            Virus[] AllVirus = gson.fromJson(reader, Virus[].class);
        
            for(Virus temp: AllVirus){
            
                switch(temp.getCategoria()){
                
                    case "Virus":
                        virus.add(temp);
                        break;
                    case "Worm":
                        worm.add(temp);
                        break;
                    case "Trojan":
                        trojan.add(temp);
                        break;
                    case "Ransomware":
                        ransomware.add(temp);
                        break;
                    case "Spyware":
                        spyware.add(temp);
                        break;
                    case "Adware":
                        adware.add(temp);
                        break;
                    case"Rootkit": 
                        rootkit.add(temp);
                        break;
                    case"Game": 
                        game.add(temp);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Errore durante la lettura del file \"virusData.json\" ", "Errore", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                        break;
                }
            }
            
            reader.close();
            
            FileReader descrizioni= new FileReader("src/JSON/virusDescrizione.json");
            Descrizione[] desc=gson.fromJson(descrizioni, Descrizione[].class);
            
            virusDesc=desc[0];
            wormDesc=desc[1];
            trojanDesc=desc[2];
            ransomDesc=desc[3];
            spyDesc=desc[4];
            adDesc=desc[5];
            rootDesc=desc[6];
            gameDesc=desc[7];

        }catch (Exception e){
            e.printStackTrace();
        }    
    }
    
    private void caricaModel(){
        
        for(Virus temp: virus){
            virusModel.addElement(temp.getNome());
        }
        
        for(Virus temp: worm){
            wormModel.addElement(temp.getNome());
        }
        
        for(Virus temp: trojan){
            trojanModel.addElement(temp.getNome());
        }
        
        for(Virus temp: ransomware){
            ransomModel.addElement(temp.getNome());
        }
        
        for(Virus temp: spyware){
            spyModel.addElement(temp.getNome());
        }
        
        for(Virus temp: adware){
            adModel.addElement(temp.getNome());
        }
        
        for(Virus temp: rootkit){
            rootModel.addElement(temp.getNome());
        }
        
        for(Virus temp: game){
            gameModel.addElement(temp.getNome());
        }
        
        
    }
    
    private void rbtnVirusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnVirusActionPerformed
        // TODO add your handling code here:
        
        if(rbtnVirus.isSelected()){
            ListaVirus.setModel(virusModel);
            if(c=='0'){
                TextAreaInfo.setText(virusDesc.getIt());
            }
            else if(c=='1'){
                TextAreaInfo.setText(virusDesc.getEn());
            }
        }
    }//GEN-LAST:event_rbtnVirusActionPerformed

    private void rbtnTrojanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTrojanActionPerformed
        // TODO add your handling code here:
        
        if(rbtnTrojan.isSelected()){
            ListaVirus.setModel(trojanModel);
            if(c=='0'){
                TextAreaInfo.setText(trojanDesc.getIt());
            }
            else if(c=='1'){
                TextAreaInfo.setText(trojanDesc.getEn());
            }
        }
    }//GEN-LAST:event_rbtnTrojanActionPerformed

    private void rbtnRansomwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRansomwareActionPerformed
        // TODO add your handling code here:
        
        if(rbtnRansomware.isSelected()){
            ListaVirus.setModel(ransomModel);
            if(c=='0'){
                TextAreaInfo.setText(ransomDesc.getIt());
            }
            else if(c=='1'){
                TextAreaInfo.setText(ransomDesc.getEn());
            }
        }
    }//GEN-LAST:event_rbtnRansomwareActionPerformed

    private void rbtnSpywareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSpywareActionPerformed
        // TODO add your handling code here:
        if(rbtnSpyware.isSelected()){
            ListaVirus.setModel(spyModel);
            if(c=='0'){
                TextAreaInfo.setText(spyDesc.getIt());
            }
            else if(c=='1'){
                TextAreaInfo.setText(spyDesc.getEn());
            }
        }
    }//GEN-LAST:event_rbtnSpywareActionPerformed

    private void rbtnAdwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAdwareActionPerformed
        // TODO add your handling code here:
        
        if(rbtnAdware.isSelected()){
            ListaVirus.setModel(adModel);
            if(c=='0'){
                TextAreaInfo.setText(adDesc.getIt());
            }
            else if(c=='1'){
                TextAreaInfo.setText(adDesc.getEn());
            }
        }
    }//GEN-LAST:event_rbtnAdwareActionPerformed

    private void rbtnRootkitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRootkitActionPerformed
        // TODO add your handling code here:
        
        if(rbtnRootkit.isSelected()){
            ListaVirus.setModel(rootModel);
            if(c=='0'){
                TextAreaInfo.setText(rootDesc.getIt());
            }
            else if(c=='1'){
                TextAreaInfo.setText(rootDesc.getEn());
            }
        }
    }//GEN-LAST:event_rbtnRootkitActionPerformed

    private void ComboBoxLinguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxLinguaActionPerformed
        // TODO add your handling code here:

        int index=ComboBoxLingua.getSelectedIndex(); // Lingua selezionata
        String path="";

        if(index==0){
            // Stringhe in lingua italiana
            path="src/TXTfiles/Principale/italianoTasti.txt";
        }
        else if(index==1){
            // Stringhe in lingua inglese
            path="src/TXTfiles/Principale/ingleseTasti.txt";
        }
        
        c=(char)('0'+index);
        TextAreaInfo.setText("");
        ListaVirus.clearSelection();
        ListaVirus.repaint(); //Forza il ridisegno

        
        try {
            FileWriter lingua= new FileWriter("src/TXTfiles/lingua.txt");
            lingua.write(String.valueOf(index));
            lingua.close();
        } catch (IOException ex) {
            Logger.getLogger(Termini.class.getName()).log(Level.SEVERE, null, ex);
        }

        try(BufferedReader reader= new BufferedReader(new FileReader(path))){

            String line;

            for(int i=0;i<5;i++){
                if((line=reader.readLine())!=null){
                    switch(i){
                        case 0:
                        LabelScegliTipo.setText(line);
                        break;
                        case 1:
                            LabelScegliVirus.setText(line);
                            break;
                        case 2:
                            LabelInformazioni.setText(line);
                            break;
                        case 3:
                            btnAvanti.setText(line);
                            break;
                        case 4:
                            LabelLingua.setText(line);
                            break;
                    }
                }
            }

        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Errore durante la lettura del file:\n" + e.getMessage());
            return;
        }
        
        SceltaVirus.clearSelection();
        ListaVirus.setModel(clearModel);

    }//GEN-LAST:event_ComboBoxLinguaActionPerformed

    private void rbtnWormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnWormActionPerformed
        // TODO add your handling code here:
        
        if(rbtnWorm.isSelected()){
            ListaVirus.setModel(wormModel);
            if(c=='0'){
                TextAreaInfo.setText(wormDesc.getIt());
            }
            else if(c=='1'){
                TextAreaInfo.setText(wormDesc.getEn());
            }
        }
    }//GEN-LAST:event_rbtnWormActionPerformed

    private void btnAvantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvantiActionPerformed
        // TODO add your handling code here:
        int index=ListaVirus.getSelectedIndex();
        
        if(rbtnVirus.isSelected()){
            switch(index){
                case 0:
                    btnAvanti.setEnabled(true);
                    UnclosableWindow frame = new UnclosableWindow();
                    frame.show();
                    frame.setLocationRelativeTo(null);
                    break;
                
            }
        }
        else if(rbtnWorm.isSelected()){
            
        }
        else if(rbtnTrojan.isSelected()){
            
        }
        else if(rbtnRansomware.isSelected()){
            
        }
        else if(rbtnSpyware.isSelected()){
            
        }
        else if(rbtnAdware.isSelected()){
            
        }
        else if(rbtnRootkit.isSelected()){
            
        }
        else if(rbtnGame.isSelected()){
            switch(index){
                case 0:
                    btnAvanti.setEnabled(true);
                    RouletteRussa frame = new RouletteRussa();
                    frame.show();
                    frame.setLocationRelativeTo(null);
                    break;
                
            }
        }
        else{
            if(c=='0'){
                JOptionPane.showMessageDialog(null, "Errore durante la scelta del virus", "Errore", JOptionPane.ERROR_MESSAGE);
            }
            else if(c=='1'){
                JOptionPane.showMessageDialog(null, "Error while choosing virus ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAvantiActionPerformed

    private void rbtnGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGameActionPerformed
        // TODO add your handling code here:
        
        if(rbtnGame.isSelected()){
            ListaVirus.setModel(gameModel);
            if(c=='0'){
                TextAreaInfo.setText(gameDesc.getIt());
            }
            else if(c=='1'){
                TextAreaInfo.setText(gameDesc.getEn());
            }
        }
    }//GEN-LAST:event_rbtnGameActionPerformed

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
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxLingua;
    private javax.swing.JLabel LabelInformazioni;
    private javax.swing.JLabel LabelLingua;
    private javax.swing.JLabel LabelScegliTipo;
    private javax.swing.JLabel LabelScegliVirus;
    private javax.swing.JList<String> ListaVirus;
    private javax.swing.ButtonGroup SceltaVirus;
    private javax.swing.JTextArea TextAreaInfo;
    private javax.swing.JButton btnAvanti;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnAdware;
    private javax.swing.JRadioButton rbtnGame;
    private javax.swing.JRadioButton rbtnRansomware;
    private javax.swing.JRadioButton rbtnRootkit;
    private javax.swing.JRadioButton rbtnSpyware;
    private javax.swing.JRadioButton rbtnTrojan;
    private javax.swing.JRadioButton rbtnVirus;
    private javax.swing.JRadioButton rbtnWorm;
    // End of variables declaration//GEN-END:variables
}
