package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        //clases y objetos
        // Clase identificador = new Clase();
        //crear un objeto utilizando el constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        //crear un objeto utilizando el constructor con parametros
        Motor motorGti = new Motor("GTI",190,59.0,6);
        Vehiculo fordMondeo = new Vehiculo("Ford","Mondeo",2.1,2010,false,0,motorGti);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);

        //herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "kawasaki";

        System.out.println("fin del programa");

        //polimorfismo
        Vehiculo vehiculo;
        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        //4 clases abstractas: no se pueden instanciar solo instancian las clases hijas

    }
}
