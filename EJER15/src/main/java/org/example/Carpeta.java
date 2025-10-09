package org.example;

import java.util.List;

public class Carpeta {
    private String nombre;
    private List<Email> emails;

    public String getNombre(){
        return this.nombre;
    }

    public boolean agregarEmail(Email email){
        this.emails.add(email);
        return true;
    }


    public void mover(Email email, Carpeta destino) {
    }

}
