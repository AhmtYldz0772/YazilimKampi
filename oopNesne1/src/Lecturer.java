public class Lecturer extends  Academician{
    private String doorNumber;
    public Lecturer(String nameSurname, String phone, String e_posta, String section,String degree,String doorNumber){
        super(nameSurname,phone,e_posta,section,degree);
        this.doorNumber = doorNumber;
    }
    public String getDoorNumber()
    {
        return doorNumber;
    }
    public void setDoorNumber(String doorNumber)
    {
        this.doorNumber = doorNumber;
    }
    public void meeting()
    {
        System.out.println(this.getNameSurname() + "has a meeting in today! okey");
    }
    public void exam()
    {
        System.out.println(this.getNameSurname() + "and"+ this.getDoorNumber()+ " has a exam! pleas");
    }
}
