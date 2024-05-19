package ch.zhaw.iwi.devops.demo;

public class Task {

    private int id;
    private String title;
    private String description;
    private String keywords;

    public Task() {
    }
    
    public Task(int id, String title, String description, String keywords) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.keywords = keywords;
    }

    public int getId() {
        return id;
    }    

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getKeywords() {
        return keywords;
    }   
    
}
