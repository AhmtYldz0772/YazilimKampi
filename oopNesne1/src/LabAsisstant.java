public class LabAsisstant extends Asisstant{
    public LabAsisstant(String nameSurname, String phone, String e_posta, String section,String degree, String ofisTime)
    {
        super(nameSurname,phone,e_posta,section,degree,ofisTime);

    }
    public void labIn()
    {
        System.out.println(this.getNameSurname() + "in lab lesson");
    }
    public void labClose()
    {
        System.out.println(this.getNameSurname() + "close lab lesson");
    }

}
