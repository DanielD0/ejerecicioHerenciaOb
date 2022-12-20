package ejercicio;

public class MainEjercicio {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone("Quantom 1",true,true,"Android","Motorola","AJ5","3.5 pulgadas","4G");
        String datasmarthPhone = smartPhone1.toString();
        System.out.println(datasmarthPhone);
        smartPhone1.conectarWifi(true);
        SmattWatch smartWatch1 = new SmattWatch("Watch2",true,false,"IOS","Iphone","Smartwatch Iphone","2 pulgadas","verde");
        String dataWatch = smartWatch1.toString();
        System.out.println(dataWatch);
    }
}
