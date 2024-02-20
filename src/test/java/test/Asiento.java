package test;


class Asiento {

    String color;
    int precio;
    int registro;

    Asiento() {
    }

    Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    void cambiarColor(String color) {
        String[] coloresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
        for (String colores_permitido : coloresPermitidos) {
            if (color.equalsIgnoreCase(colores_permitido)) {
                this.color = color;
                return;
            }
        }
        System.out.println("Color no permitido.");
    }

}
