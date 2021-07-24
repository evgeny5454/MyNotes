package ru.geekbrains.mynotes.ui.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import ru.geekbrains.mynotes.domain.MockNotesRepository;
import ru.geekbrains.mynotes.domain.Note;
import ru.geekbrains.mynotes.domain.NotesRepository;

public class NotesListViewModel extends ViewModel {

    private MutableLiveData<List<Note>> notesLiveData = new MutableLiveData<>();
    private NotesRepository repository = new MockNotesRepository();

    public LiveData<List<Note>> getNotesLiveData() {
        return notesLiveData;
    }

    public void requestNotes() {
        List<Note> notes = repository.getNotes();
        notesLiveData.setValue(notes);
    }
}
