package ru.geekbrains.mynotes.domain;

import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.mynotes.R;

public class NotesRepository {

    public List<Note> getNotes() {
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.plus));
        return notes;
    }
}
