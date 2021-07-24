package ru.geekbrains.mynotes.ui.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.mynotes.R;
import ru.geekbrains.mynotes.domain.Note;

public class AdapterListNote extends RecyclerView.Adapter<AdapterListNote.NotesViewHolder> {

    private ArrayList<Note> data = new ArrayList<>();

    private Fragment fragment;

    public AdapterListNote(Fragment fragment) {
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note,
                parent, false);
        return new NotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        Note note = data.get(position);
        holder.title.setText(note.getTitle());
        holder.content.setText(note.getContent());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void addData(List<Note> notes) {
        data.clear();
        data.addAll(notes);
    }

    static class NotesViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView content;

        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            content = itemView.findViewById(R.id.content);
        }
    }
}
