public class encapsulation {
    // encapsulation
    // Inheritance
    // Polimorphisn
    // Abstraction
    // bunlar nesne yönemli programlama için temek öğeler bunlar üzerinden bol bol pratik zamanı


    public static void main(String[] args) {

        Book saban = new Book("karal şakir", 555);
        Book kemal = new Book("çöpcüler krali", 556); // burada pageNumber kısmına negatif bir değer girersem bir sıkıntı olmaz kod çalışır ama mantıken httalı değil mi bir kitap sayısı -100 olabilir mi o yüzden bu gibi değerleri direk dokunmamak gerekiyor dolaylı bir erişim gerekli burada encasultion devreye girer.
        System.out.println(saban.getName());




    }


}
