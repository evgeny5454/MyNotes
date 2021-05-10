package ru.geekbrains.mynotes.ui.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.mynotes.R;

public class AdapterListNote extends RecyclerView.Adapter<AdapterListNote.ListNoteViewHolder> {

    private final ArrayList<String> data = new ArrayList<>();

    public void addData (List<String> toAdd) {
        data.addAll(toAdd);
    }


    @NonNull
    @Override
    public ListNoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_list,parent,false);

        return new ListNoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListNoteViewHolder holder, int position) {
        holder.title.setText (data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ListNoteViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        public ListNoteViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
        }
    }
}
