package ru.geekbrains.mynotes.domain;

import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.mynotes.R;

public class NotesRepository {

    public List<Note> getNotes() {
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note("Коты и Собаки","6 котов и 5 собак", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","это не пустая заметка", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Купить в магазине","По возможности всё", R.drawable.ic_baseline_add_24));
        notes.add(new Note("А почему нет","Хотелось сделать Нокию, которой действительно можно колоть орехи", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Планы на лето","Отдохнуть", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Шок контент","Илон Маск заявил, что при покорении Марса немного людей погибнет, но это будет отличным приключением", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Баг новой системы РЖД","На нескольких станциях, не оборудованных турникетами, РЖД поставили терминалы, на которых можно активировать билет на электричку, приобретённый через их приложение.\n" +
                "\n" +
                "Обнаружил баг - жук, сидящий по ту сторону стекла, загораживает прицельный квадрат, и код не распознается :)", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        notes.add(new Note("Новая заметка","ddfdf", R.drawable.ic_baseline_add_24));
        return notes;
    }
}
