package ru.geekbrains.mynotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import ru.geekbrains.mynotes.domain.Note;

public class MainActivity extends AppCompatActivity implements ListFragment.onNoteClicked {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.general_note) {
                    Toast.makeText(MainActivity.this,"На главную",Toast.LENGTH_LONG).show();
                    return true;
                }

                if (item.getItemId() == R.id.trash) {
                    Toast.makeText(MainActivity.this,"Корзина",Toast.LENGTH_LONG).show();
                    return true;
                }
                if (item.getItemId() == R.id.settings) {
                    Toast.makeText(MainActivity.this,"Настройки",Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });

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