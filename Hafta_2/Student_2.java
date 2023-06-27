public class Student_2 {
    private String name;
    private String surName;
    private  String idNo;
    private String adress;
    private int note;

    public Student_2(String name, String surName, String idNo, String adress, int note){
        this.name = name;
        this.surName = surName;
        this.idNo = idNo;
        this.adress =adress;

        if(0 > note || note > 100){
            note=0;
        }
        this.note = note;
    }





    public int getNote() {

        return this.note;
    }
    public void setNote(int note){
        if(note > 100 || note < 0){
            note=0;
        }
        this.note = note;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurName(){
        return this.surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public String getIdNo(){
        return  this.idNo;
    }
    public void setIdNo(String idNo){
        this.idNo = idNo;
    }
    public String getAdress(){
        return this.adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }


}
