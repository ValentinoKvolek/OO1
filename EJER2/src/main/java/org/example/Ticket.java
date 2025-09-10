package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Ticket {

    private LocalDate fecha;
    private Integer cantidadDeProductos;
    private Double pesoTotal;
    private Double precioTotal;

    public double impuesto(){
        return this.precioTotal * 0.21;
    }; //impuesto es un 21% del precioTotal


    public LocalDate getFecha() {
        return fecha;
    }

    public Integer getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public Double getPesoTotal() {
        return pesoTotal;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCantidadDeProductos(Integer cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    public void setPesoTotal(Double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
