package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private String direccion;
    private String nombreDescriptivo;
    private double precioPorNoche;
    private List<Reserva> reservas = new ArrayList<>();


    public Propiedad(String direccion, String nombreDescriptivo, double precioPorNoche, List<Reserva> reservas) {
        this.direccion = direccion;
        this.nombreDescriptivo = nombreDescriptivo;
        this.precioPorNoche = precioPorNoche;
        this.reservas = reservas;
    }

    public boolean estaDisponible(LocalDate desde, LocalDate hasta) {
        for (Reserva r : reservas) {
            if (!r.noSeSuperpone(desde, hasta)) {
                return false;
            }
        }
        return true;
    }

    public boolean crearReserva(LocalDate desde, LocalDate hasta) {
        if (estaDisponible(desde, hasta)) {
            Reserva nueva = new Reserva(desde, hasta);
            reservas.add(nueva);
            return  true;
        } else {
            return  false;
        }
    }

    public double calcularIngresoTotal() {
        double total = 0;
        for (Reserva r : reservas) {
            total += r.calcularPrecio(precioPorNoche);
        }
        return total;
    }

    public void cancelarReserva(Reserva reserva) {
        if (reserva.yaComenzo()) {
            System.out.println("No se puede cancelar una reserva que ya comenzó.");
        } else if (reservas.contains(reserva)) {
            reservas.remove(reserva);
            System.out.println("Reserva cancelada correctamente.");
        } else {
            System.out.println("La reserva no existe en esta propiedad.");
        }
    }

    public double calcularIngresoEnPeriodo(DateLapse periodo) {
        double total = 0.0;

        for (Reserva r : reservas) {
            if (r.estaDentroDePeriodo(periodo)) {
                total += r.calcularPrecio(precioPorNoche);
            }
        }
        return total;
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }

}
