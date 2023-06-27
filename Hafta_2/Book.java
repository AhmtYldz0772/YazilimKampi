public class Book {
    private String name;
    private int pageNumber;

    public Book(String name, int pageNumber){
        this.name= name;
        this.pageNumber = pageNumber;
    }
    // şimdi burada yapılan metodlar tamamen kulanıcı hattalı bir değer girmesini engeller ve değeri istediğinde değiştirme şansı sunar hattalı bir değer girerse 0 değeri dönecektir

    public int showPageNuber(){
        return this.pageNumber = pageNumber;
    }
    public void changePageNumber(){
        if(pageNumber<0){
            pageNumber =0;
        }
        this.pageNumber=pageNumber;
    }
    public String showName(){
        return this.name;
    }
    public void changeName(){
        this.name=name;
    }
    // bunlar yerine bizim öğrendiğimiz get ve set metodları bulunmaktırdır.


    public int getPageNumber(){
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber){
        if(pageNumber<0){
            pageNumber =0;
        }
        this.pageNumber = pageNumber;
    }


    public String getName(){
        return this.name;
    }

    public String setname(String name){
        return this.name;
    }


}
