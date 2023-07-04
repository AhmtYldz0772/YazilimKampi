public class Academician extends Worker{
    private String section;
    private String degree;
    public Academician(String nameSurname, String phone, String e_posta, String section,String degree){
        super(nameSurname, phone, e_posta);
        this.section = section;
        this.degree = degree;
    }
    public String getSection(){
        return section;
    }
    public void setSection(String section){
        this.section = section;
    }
    public String getDegree(){
        return degree;
    }
    public void setDegree(String degree){
        this.degree = degree;
    }
    public void lesson(){
        System.out.println( this.getNameSurname() + "is in lesson");
    }

}
