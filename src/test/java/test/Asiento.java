package test;


class Asiento {
    String color;
    int precio;
    int registro;

    public Asiento() {
       
    }

    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public void cambiarColor(String color) {
        String[] coloresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
        for (String colorPermitido : coloresPermitidos) {
            if (colorPermitido.equals(color)) {
                this.color = color;
                break;
            }
        }
    }
}
