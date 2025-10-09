package org.example;

import java.util.List;

public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> archivos;

    public String getTitulo(){
        return this.titulo;
    }
    public String getCuerpo(){
        return this.cuerpo;
    }
    public List<Archivo> adjuntos(){
        return  this.archivos;
    }
}
