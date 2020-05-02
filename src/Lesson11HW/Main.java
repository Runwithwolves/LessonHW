package Lesson11HW;


public class Main {
    public static void RunTimeException() {
        throw new TooBigCarException();
    }
    public static void main(String[] args) throws RuntimeException {
        Porsche porsche = new Porsche("Cayenne", "20000USD,", "2 meters,", "1,5 meters,", 250);
        BMW bmw = new BMW("M3", "12000USD,", "1.9 meters,", "1.4 meters,", 250);
        Audi audi = new Audi("Quattro", "15000USD,", "1.8 meters,", "1.4 meters,", 250);
        Lexus lexus = new Lexus("LX 350", "25000USD,", "1.7 meters,", "1.4 meters,", 350);
        Opel opel = new Opel("Wander", "10000USD,", "1.65 meters,", "1.4 meters,", 450);

        SalesShop salesshop = new SalesShop();


try {
    salesshop.addAutoShop(porsche);
    salesshop.addAutoShop(bmw);
    salesshop.addAutoShop(opel);
    salesshop.addAutoShop(audi);
    salesshop.addAutoShop(lexus);
    salesshop.printCars();
} catch (OutOfFreePlaceException e) {
    System.out.println("Car shop is overstacked");
}


    }
}
