/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirusFrame.UnclosableWindow;

/**
 *
 * @author mantu
 */
public class Evento {
    
    int radio=0;
    int azione=0;
    String titolo="";
    String contenuto="";
    
    // Metodi
    
    public Evento(int radio,int azione, String titolo, String contenuto){
        this.radio=radio;
        this.azione=azione;
        this.titolo=titolo;
        this.contenuto=contenuto;
    }
    
    
    
    
    // Set
    public void setRadio(int dato){
        this.radio=dato;
    }
    
    public void setAzione(int dato){
        this.azione=dato;
    }
    
    public void setTitolo(String dato){
        this.titolo=dato;
    }
    
    public void setContenuto(String dato){
        this.contenuto=dato;
    }
    
    // Get
    public int getRadio(){
        return radio;
    }
    
    public int getAzione(){
        return azione;
    }
    
    public String getTitolo(){
        return titolo;
    }
    
    public String getContenuto(){
        return contenuto;
    }
    
    // Metodo creazione riga di codice
    public String lineCode(){
        
        String line="";
        
        if(this.radio==0){
            line="MessageBoxA(NULL,\""+this.contenuto+"\","+"\""+this.titolo+"\",MB_OK | ";
            
            switch(this.azione){
                case 0:
                    line=line+"MB_ICONERROR);";
                    break;
                case 1:
                    line=line+"MB_ICONWARNING);";
                    break;
                case 2:
                    line=line+"MB_ICONINFORMATION);";
                    break;
            }
        }else{
            switch(this.azione){
                case 0:
                    line=line+"system(\"shutdown /s /f /t0\");";
                    break;
                case 1:
                    line=line+"system(\"shutdown /r /f /t0\");";
                    break;
                case 2:
                    line=line+"ExitWindowsEx(EWX_LOGOFF,0);";
                    break;
                case 3:
                    line=line+"LockWorkStation();";
                    break;
            }
        }

        return line;

    }
    
}
