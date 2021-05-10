package ru.geekbrains.mynotes.router;

import androidx.fragment.app.FragmentManager;

import ru.geekbrains.mynotes.R;
import ru.geekbrains.mynotes.ui.list.NotesFragment;

public class AppRouter {

    private FragmentManager fragmentManager;

    public AppRouter(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public void showNotesList() {
        fragmentManager.beginTransaction().replace(R.id.container, new NotesFragment()).commit();
    }
}
