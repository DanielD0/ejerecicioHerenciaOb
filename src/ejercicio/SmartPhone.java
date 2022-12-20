package ejercicio;

public class SmartPhone extends SmartDevice{
    String pantalla;

    String red;

    public SmartPhone(){

    }

    public SmartPhone(String procesador, boolean bluethot, boolean wifi, String middleware, String marca, String modelo, String pantalla, String red) {
        super(procesador, bluethot, wifi, middleware, marca, modelo);
        this.pantalla = pantalla;
        this.red = red;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pantalla='" + pantalla + '\'' +
                ", red='" + red + '\'' +
                ", procesador='" + procesador + '\'' +
                ", bluethot=" + bluethot +
                ", wifi=" + wifi +
                ", middleware='" + middleware + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
