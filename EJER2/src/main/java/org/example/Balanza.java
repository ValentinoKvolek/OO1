package org.example;

import java.time.LocalDate;

public class Balanza {


    private Integer cantProductos=0;
    private double precioTotal= 0;
    private double pesoTotal=0.0;

    public Balanza(Integer cantProductos, Double precio) {}


    public void ponerEnCero(){
        this.precioTotal = 0.0;
        this.pesoTotal = 0.0;
        this.cantProductos=0;
    }


    public void agregarProducto(Producto producto){
        this.cantProductos++;
        this.precioTotal += producto.getPrecio();
        this.pesoTotal += producto.getPeso();
    }

    public Ticket emitirTicket(){

        Ticket ticket = new Ticket();

        ticket.setPesoTotal(this.pesoTotal);
        ticket.setCantidadDeProductos(this.cantProductos);
        ticket.setFecha(LocalDate.now());

        ticket.setPrecioTotal(this.precioTotal);

        ticket.impuesto();

        return ticket;

    }

    public Balanza() {}

    public double getPesoTotal() {
        return pesoTotal;
    }

    public Integer getCantProductos() {
        return cantProductos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }


}
