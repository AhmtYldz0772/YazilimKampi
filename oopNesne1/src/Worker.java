public class Worker {
    private String nameSurname;
    private String phone;
    private  String e_posta;

    public Worker(String nameSurname, String phone, String e_posta){
        this.nameSurname = nameSurname;
        this.phone = phone;
        this.e_posta = e_posta;
    }
    public String getNameSurname(){
        return nameSurname;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getE_posta(){
        return e_posta;
    }
    public void setE_posta(String e_posta){
        this.e_posta = e_posta;
    }
    public void giris(){
        System.out.println(nameSurname + "is in üniversty");
    }
    public void cikis(){
        System.out.println(nameSurname + "is close üniversty");
    }
    public void eatHome(){
        System.out.println(nameSurname + "is in eatHome");
    }
}
