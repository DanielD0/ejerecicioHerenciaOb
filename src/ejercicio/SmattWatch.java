package ejercicio;

public class SmattWatch extends SmartDevice{
    String tamaño;
    String color;

    public SmattWatch(String procesador, boolean bluethot, boolean wifi, String middleware, String marca, String modelo, String tamaño, String color) {
        super(procesador, bluethot, wifi, middleware, marca, modelo);
        this.tamaño = tamaño;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmattWatch{" +
                "tamaño='" + tamaño + '\'' +
                ", color='" + color + '\'' +
                ", procesador='" + procesador + '\'' +
                ", bluethot=" + bluethot +
                ", wifi=" + wifi +
                ", middleware='" + middleware + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
