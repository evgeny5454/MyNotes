package ru.geekbrains.mynotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import ru.geekbrains.mynotes.domain.Note;

public class MainActivity extends AppCompatActivity implements ListFragment.onNoteClicked {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar first_toolbar = findViewById(R.id.first_toolbar);
        //Toolbar details_toolbar = findViewById(R.id.details_toolbar);

        boolean islandScape = getResources().getBoolean(R.bool.isLandScape);

        if (!islandScape) {

            FragmentManager fragmentManager = getSupportFragmentManager();

            Fragment fragment = fragmentManager.findFragmentById(R.id.container);

            if (fragment == null) {
                fragmentManager.beginTransaction()
                        .replace(R.id.container,new ListFragment())
                        .commit();
            }
        }
    }

    @Override
    public void onNoteClicked(Note note) {
        boolean islandScape = getResources().getBoolean(R.bool.isLandScape);
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (islandScape) {

            fragmentManager.beginTransaction()
                    .replace(R.id.details_fragment, DetailsFragment.newInstance(note))
                    .commit();
        } else {

            fragmentManager.beginTransaction()
                    .replace(R.id.container, DetailsFragment.newInstance(note))
                    .addToBackStack(null)
                    .commit();
        }
    }
}