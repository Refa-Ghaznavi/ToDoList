package app.auaf.todolist.model;

public class Note {


    private int id;
    private String note;
    private String title,place;




    public Note() {
    }


    public Note(int id, String note, String title, String place) {
        this.id = id;
        this.note = note;
        this.title = title;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
