package org.example;

public class ClienteDeCorreo {

    private Carpeta inbox;

    public void recibir(Email email){
        if(!this.inbox.agregarEmail(email)){
            System.out.printf("La swap de la ram se lleno y no se puedo agregar a la estructura.");
        }
    }

    public Email buscar(String texto){}

    public int espacioOcupado(){
        return 0;
    }
}
