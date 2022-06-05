/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fogadoora;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author Legen-daaary
 */
public class Tanar {
    private int foglalasId;
    private String tanarNeve;
    private LocalTime idopont;
    private String mikorFoglaltak;
    private static int foglalasSzamlalo = 0;
    
    //private LocalDateTime mikorFoglaltak;
    //private DateTimeFormatter mikorFoglaltakMinta = DateTimeFormatter.ofPattern("yyyy.MM.dd-HH:mm");

    public Tanar(int foglalasId, String tanarNeve) {
        this.foglalasId = foglalasId;
        this.tanarNeve = tanarNeve;
    }
    
    

    public Tanar(String sor) {
        String[] darabok = sor.split(" ");
        
        this.foglalasId = ++foglalasSzamlalo;
        this.tanarNeve = darabok[0] + " " + darabok[1];
        this.idopont = LocalTime.parse(darabok[2]);
        //2017.11.04-19:54
        this.mikorFoglaltak = darabok[3];
    }

    public int getFoglalasId() {
        return foglalasId;
    }

    public String getTanarNeve() {
        return tanarNeve;
    }

    public LocalTime getIdopont() {
        return idopont;
    }

    public String getMikorFoglaltak() {
        return mikorFoglaltak;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.tanarNeve);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tanar other = (Tanar) obj;
        return Objects.equals(this.tanarNeve, other.tanarNeve);
    }


    

    @Override
    public String toString() {
        return "Tanar{" + "foglalasId=" + foglalasId + ", tanarNeve=" + tanarNeve + ", idopont=" + idopont + ", mikorFoglaltak=" + mikorFoglaltak + '}';
    }
    
}
