package ejercicio;

public class SmartDevice {
    String procesador;
    boolean bluethot;
    boolean wifi;
    String middleware;
    String marca;
    String modelo;

    public SmartDevice() {
    }

    public SmartDevice(String procesador, boolean bluethot, boolean wifi, String middleware, String marca, String modelo) {
        this.procesador = procesador;
        this.bluethot = bluethot;
        this.wifi = wifi;
        this.middleware = middleware;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void conectarWifi(boolean conexion){
        if (conexion){
            this.wifi = true;
            System.out.println("Tu dispositvo tiene conexion a internet");
        }else{
            System.out.println("no tienes acceso a internet");
        }
    }


}
