package ru.geekbrains.mynotes.domain;

import java.util.List;

public interface NotesRepository {

    List<Note> getNotes();
}
