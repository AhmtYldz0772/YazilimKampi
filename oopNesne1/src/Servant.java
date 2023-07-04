public class Servant extends Worker {
    private  String departmen;
    private String shift;
    public Servant (String nameSurname, String phone, String e_posta,String departmen, String shift)
    {
        super(nameSurname, phone,e_posta);
        this.departmen = departmen;
        this.shift =shift;
    }
    public String getDepartmen()
    {
        return departmen = departmen;
    }
    public void setDepartmen( String departmen)
    {
        this.departmen = departmen;
    }
    public String getShift()
    {
        return shift = shift;
    }
    public void setShift(String shift)
    {
        this.shift = shift;
    }
    public void work()
    {
        System.out.println(this.getNameSurname() + "has a work to departman");
    }
}
