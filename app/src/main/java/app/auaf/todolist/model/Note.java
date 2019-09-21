package app.auaf.todolist.model;

public class Note {


    private int id;
    private String note;
    private String title;




    public Note() {
    }


    public Note(int id, String note, String title) {
        this.id = id;
        this.note = note;
        this.title = title;
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


}
