package test;

public class Auto {
	private String modelo;
    private int precio;
    private Asiento[] asientos;
    private String marca;
    private Motor motor;
    private int registro;
    private static int cantidadCreados = 0;

    public Auto(String modelo, int precio, String marca, Motor motor, int registro, int cantidadAsientos) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        this.asientos = new Asiento[cantidadAsientos];
        cantidadCreados++;
    }

    public int cantidadAsientos() {
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public String verificarIntegridad() {
        if (motor.getRegistro() != registro) {
            return "Las piezas no son originales";
        }

        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.getRegistro() != registro) {
                return "Las piezas no son originales";
            }
        }

        return "Auto original";
    }

    public static int getCantidadCreados() {
        return cantidadCreados;
    }

}
	