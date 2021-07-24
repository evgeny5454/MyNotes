package ru.geekbrains.mynotes.ui.list;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ru.geekbrains.mynotes.R;
import ru.geekbrains.mynotes.domain.Note;
import ru.geekbrains.mynotes.domain.MockNotesRepository;


public class NotesFragment extends Fragment {

    private NotesListViewModel viewModel;
    private AdapterListNote adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(this).get(NotesListViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new NotesListViewModel();
        adapter = new AdapterListNote(this);
        RecyclerView notesList = view.findViewById(R.id.notes_list);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(requireContext(),
                LinearLayoutManager.VERTICAL,false);
        notesList.setLayoutManager(lm);
        notesList.setAdapter(adapter);

        if (savedInstanceState == null) {
            viewModel.requestNotes();
        }

        viewModel.getNotesLiveData().observe(getViewLifecycleOwner(), new Observer<List<Note>>() {
            @Override
            public void onChanged(List<Note> notes) {
                adapter.addData(notes);
            }
        });
        adapter.notifyDataSetChanged();

    }
}