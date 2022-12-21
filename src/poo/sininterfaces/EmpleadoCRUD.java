package poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    //Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    //Create - guardar un empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    //

    public List<Empleado> findAll (){
        return empleados;
    }


}
