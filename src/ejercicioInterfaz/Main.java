package ejercicioInterfaz;

public class Main {
    static CocheCRUD cochecrud = new CocheCRUDImpl();
    public static void main(String[] args) {
        cochecrud.save();
        cochecrud.findAll();
        cochecrud.delete();
    }
}
