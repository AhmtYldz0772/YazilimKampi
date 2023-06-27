public class Courses {
    private  String courseName;
    private String code;


    public Courses(String courseName, String code){
        this.courseName = courseName;
        this.code = code;
    }

    public String getCourseName(){
        return this.courseName = courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCode(){
        return this.code = code;
    }
    public void setCode(String code){
        this.courseName = code;
    }

    // bağımlı bir sınıf yapısı var uses a mantık şu olsun eğerki bağımlılık artarsa kod o kadar daha kapsamlı olur oda işin daha kopklesk olmasına sağlar örneğin burada notu Studen_2 sınıfından alıyor eğerki o sınıfta bu değişiken kaldırılırsa bu sınıftaki metod patlamış olur miktarınca kullan :-)

    public double clcAvager (Student_2[] students){
        double avg = 0.0;
        for(int i  =0; i <students.length;i++){
            avg += students[i].getNote();
        }

        return avg / students.length;
    }
}
