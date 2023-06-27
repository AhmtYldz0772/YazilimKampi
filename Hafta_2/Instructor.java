public class Instructor {
   private  String name;
   private  String surnaName;
   private  String departmen;

   public Instructor(String name, String surnaName, String departmen)
   {
       this.name = name;
       this.surnaName = surnaName;
       this.departmen  =departmen;

   }
    public String getName(){
        return this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurnaName(){
        return this.surnaName = surnaName;
    }
    public void setSurnaName(String surnaName){
        this.surnaName = surnaName;
    }

    public String getDepartmen(){
        return this.departmen = departmen;
    }
    public void setDepartmen(String departmen){
        this.departmen = departmen;
    }

}
