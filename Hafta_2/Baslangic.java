public class Baslangic {
    public static void main(String[] args) {
        Sinif audi = new Sinif("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        Sinif bmw = new Sinif("Sports" , "BMW" , "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        Sinif mercedes = new Sinif("Corporate" , "Mercedes" , "black");
        mercedes.speed = 20;
        mercedes.printInfo();
    }
}
