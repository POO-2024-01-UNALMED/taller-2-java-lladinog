package test;

public class Motor {

    int numeroCilindros;
    String tipo;
    int registro;

    Motor() {
    }

    Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    void asignarTipo(String tipo) {
        String[] tiposPermitidos = {"electrico", "gasolina"};
        for (String tipoPermitido : tiposPermitidos) {
            if (tipo.equalsIgnoreCase(tipoPermitido)) {
                this.tipo = tipo;
                return;
            }
        }
        System.out.println("Tipo no permitido.");
    }

}