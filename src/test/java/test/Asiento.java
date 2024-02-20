package test;

import java.util.Arrays;

public class Asiento {
    String color;
    int precio;
    int registro;

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public void cambiarColor(String color) {
        String[] coloresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
        if (Arrays.asList(coloresPermitidos).contains(color)) {
            this.color = color;
        }
    }
    public int getRegistro() {
        return registro;
    }
}

