package app.auaf.todolist.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import app.auaf.todolist.R;
import app.auaf.todolist.model.Note;


public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.MyViewHolder> {
 
    private Context context;
    private List<Note> notesList;
 
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView note;
        public TextView noteTitle;

        public MyViewHolder(View view) {
            super(view);
            note = view.findViewById(R.id.note);
            noteTitle = view.findViewById(R.id.idTitleNote);

        }
    }
 
 
    public NotesAdapter(Context context, List<Note> notesList) {
        this.context = context;
        this.notesList = notesList;
    }
 
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_list_item, parent, false);
 
        return new MyViewHolder(itemView);
    }
 
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Note note = notesList.get(position);

        holder.note.setText(note.getNote());
                holder.noteTitle.setText(note.getTitle());

    }
 
    @Override
    public int getItemCount() {
        return notesList.size();
    }

}