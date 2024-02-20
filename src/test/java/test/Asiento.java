package test;

public class Asiento {
	String color;
    int precio;
    int registro;

    // Constructor
    public Asiento() {
        this.color = "";
        this.precio = 0;
        this.registro = 0;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
}

    
