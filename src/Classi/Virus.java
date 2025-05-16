/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classi;

/**
 *
 * @author mantu
 */

        
public class Virus { 
    // Attributi
    private String nome;
    private String Categoria;
    boolean attivo;
    private int pericolo;
    private Descrizione descrizione;
    
    // Metodi 
    
    public Virus(String nome,String Categoria,boolean attivo, int pericolo, Descrizione descrizione){
        this.nome=nome;
        this.Categoria=Categoria;
        this.attivo=attivo;
        this.pericolo=pericolo;
        this.descrizione=descrizione;
    }
    
    public String info(char lingua){
        String info="";
        
        if(lingua=='0'){ // Italiano
            info="Nome: "+getNome()+"\nCategoria: "+getCategoria()+"\nStato: "+getAttivo()+"\nPericolo: "+getPericolo()+"\nDescrizione: "+descrizione.getIt();
        }
        else if(lingua=='1'){
            info="Name: "+getNome()+"\nCategory: "+getCategoria()+"\nState: "+getAttivo()+"\nDanger: "+getPericolo()+"\nDescription: "+descrizione.getEn();
        }
        
        return info;
    }
    
    // Get
    
    public String getNome(){
        return nome;
    }
        
    public String getCategoria(){
        return Categoria;
    }
    
    public int getPericolo(){
        return pericolo;
    }
    
    public boolean getAttivo(){
        return attivo;
    }
}
