package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
    private String nombre;
    private List<Email> emails = new ArrayList<>();



    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean agregarEmail(Email email){
        this.emails.add(email);
        return true;
    }


    public void mover(Email email, Carpeta destino) {
        if(emails.contains(email)){
            destino.agregarEmail(email);
            this.emails.remove(email);
        }
    }

    public Email buscarEmail( String texto){
        for (Email email : emails){
          if(email.contiene(texto)) return email;
        }
        return null;
    }

    public int espacioOcupado(){
        int suma = 0;
        for (Email email : emails){
            suma += email.espacioOcupado();
        }
        return suma;
    }


}
