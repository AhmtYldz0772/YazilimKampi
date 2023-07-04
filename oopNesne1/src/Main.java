public class Main {
    public static void main(String[] args) {
        Worker m1 = new Worker("Ahmet", "55266544565","78hasha@gmail.com");
        System.out.println(m1.getPhone());

        Academician a1 = new Academician("serkan", "564564564654","89.tasana@gtail.com","software","DOC.");
        a1.lesson();

        Servant s1 = new Servant("yakup", "5487986532","789.tasan@gmail.com","teknologi","five time");
        s1.work();
        Lecturer l1  = new Lecturer("yildizstar","45678912323","soft@gmail.com","software","five a clock","72");
        l1.exam();
        LabAsisstant lb1 = new LabAsisstant("timeclock","45678912323","tare@gmail.com","software","five a clock","8");
        lb1.labClose();
    }
}