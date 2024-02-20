package test;

import java.util.Set;
import java.util.HashSet;

public class Auto {
	 static int cantidadCreados = 0;
	    String modelo;
	    double precio;
	    Asiento[] asientos;
	    String marca;
	    Motor motor;
	    int registro;

	    Auto() {
	    }

	    Auto(String modelo, double precio, Asiento[] asientos, String marca, Motor motor, int registro) {
	        this.modelo = modelo;
	        this.precio = precio;
	        this.asientos = asientos;
	        this.marca = marca;
	        this.motor = motor;
	        this.registro = registro;
	        cantidadCreados++;
	    }

	    int cantidadAsientos() {
	        int count = 0;
	        for (Asiento asiento : asientos) {
	            if (asiento != null) {
	                count++;
	            }
	        }
	        return count;
	    }

	    String verificarIntegridad() {
	        Set<Integer> registros = new HashSet<>();
	        registros.add(this.registro);
	        registros.add(this.motor.registro);
	        for (Asiento asiento : asientos) {
	            if (asiento != null) {
	                registros.add(asiento.registro);
	            }
	        }
	        return registros.size() == 1 ? "Auto original" : "Las piezas no son originales";
	    }
	
}