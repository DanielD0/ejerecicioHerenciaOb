package poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        Empleado juanito = new Empleado("Juanito",30,40000d,true);
        Empleado patricia = new Empleado("Patricia",30,40000d,true);
        Empleado roberto = new Empleado("Roberto",30,40000d,true);
        //guardar empleados
        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(patricia);
        empleadoCRUD.guardar(roberto);
        //consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
