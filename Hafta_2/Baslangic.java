public class Baslangic {
    public static void main(String[] args) {
        Sinif sinif = new Sinif();
        Sinif audi = new Sinif();
        audi.speed = 10;
        System.out.println("Audi Hızı : " + audi.speed);

        Sinif bmw = new Sinif();
        bmw.speed = 25;
        System.out.println("Bmw Hızı : " + bmw.speed);

        Sinif mercedes = new Sinif();
        mercedes.speed = 30;
        System.out.println("Mercedes Hızı : " + mercedes.speed);
    }
}
