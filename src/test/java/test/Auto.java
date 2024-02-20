package test;

import java.util.ArrayList;

public class Auto {
	String modelo;
    int precio;
    ArrayList<Asiento> asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public Auto() {
    }

    public Auto(String modelo, int precio, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        this.asientos = new ArrayList<>();
        cantidadCreados++;
    }

    public int cantidadAsientos() {
        int count = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                count++;
            }
        }
        return count;
    }

    public String verificarIntegridad() {
        if (this.registro != this.motor.registro)
            return "Las piezas no son originales";
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != this.registro)
                return "Las piezas no son originales";
        }
        return "Auto original";
    }
}
