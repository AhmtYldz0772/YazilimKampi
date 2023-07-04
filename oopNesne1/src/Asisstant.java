public class Asisstant extends Academician{
    private String ofisTime;
    public Asisstant(String nameSurname, String phone, String e_posta, String section,String degree, String ofisTime)
    {
        super(nameSurname,phone,e_posta,section,degree);
        this.ofisTime = ofisTime;
    }
    public String getOfisTime()
    {
        return ofisTime;
    }
    public void setOfisTime(String ofisTime)
    {
        this.ofisTime = ofisTime;
    }
    public void quizDo()
    {
        System.out.println(this.getNameSurname() + "  and  "+ this.ofisTime + " has a quiz");
    }
}
