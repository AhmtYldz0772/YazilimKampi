public class oopEXP {
    public static void main(String[] args) {
     Student_2 str1 = new Student_2("ahmet", "yıldız", "123", "antalya",85);
     Student_2 str2 = new Student_2("selman", "tasan", "124","batman", 85);
     Student_2 str3 = new Student_2("emine", "yildiz","125", "maraş", 85);

     Student_2[] sinif = {str1,str2,str3};
     Courses crs1 = new Courses("Yıldız", "asdf");
     System.out.println(crs1.clcAvager(sinif));
     Instructor tfg = new Instructor("Ahmet", "star","software");
     System.out.println(tfg.getDepartmen());
    }
}
