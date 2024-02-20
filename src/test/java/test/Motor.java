package test;

public class Motor {
	int numeroCilindros;
    String tipo;
    int registro;

    // Constructor
    public Motor() {
        this.numeroCilindros = 0;
        this.tipo = "";
        this.registro = 0;
    }

    // Getters y Setters
    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    public void setNumeroCilindros(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
}
