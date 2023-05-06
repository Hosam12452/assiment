package assaf.hosam.firstapp.model;

public class Book {
    private String title;
    private String type;
    private int page;

    public Book(String title,String type,int page) {
        this.type=type;
        this.page=page;

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getPage() {
        return page;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
