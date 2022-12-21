package ejercicioInterfaz;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Este es el metodo para guardar un coche");
    }

    @Override
    public void findAll() {
        System.out.println("Este es el metodo para mostrar todos lo coches");
    }

    @Override
    public void delete() {
        System.out.println("Este es el metodo para eliminar un coche");
    }
}
