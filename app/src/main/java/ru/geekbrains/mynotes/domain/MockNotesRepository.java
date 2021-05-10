package ru.geekbrains.mynotes.domain;

import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.mynotes.R;

public class MockNotesRepository implements NotesRepository {

    private ArrayList<Note> notes = new ArrayList<>();

    @Override
    public List<Note> getNotes() {

        notes.add(new Note("Заметка 1","Содержимое заметки 1"));
        notes.add(new Note("Заметка 2","Содержимое заметки 2"));
        notes.add(new Note("Заметка 3","Содержимое заметки 3"));
        notes.add(new Note("Заметка 4","Содержимое заметки 4"));
        notes.add(new Note("Заметка 5","Содержимое заметки 5"));
        notes.add(new Note("Заметка 6","Содержимое заметки 6"));
        notes.add(new Note("Заметка 7","Содержимое заметки 7"));
        notes.add(new Note("Заметка 8","Содержимое заметки 8"));
        notes.add(new Note("Заметка 9","Содержимое заметки 9"));
        notes.add(new Note("Заметка 10","Содержимое заметки 10"));
        notes.add(new Note("Заметка 11","Содержимое заметки 11"));
        notes.add(new Note("Заметка 12","Содержимое заметки 12"));
        notes.add(new Note("Заметка 13","Содержимое заметки 13"));
        notes.add(new Note("Заметка 14","Содержимое заметки 14"));

        return notes;
    }
}
