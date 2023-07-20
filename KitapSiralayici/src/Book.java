public class Book implements Comparable<Book>{
    private String name;
    private String author;
    private int pageNo;
    private String releaseDate;

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
    public Book()
    {

    }
    public Book(String name, String author, int pageNo, String releaseDate) {
        this.name = name;
        this.author = author;
        this.pageNo = pageNo;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }


}
