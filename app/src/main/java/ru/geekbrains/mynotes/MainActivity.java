package ru.geekbrains.mynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.geekbrains.mynotes.router.AppRouter;
import ru.geekbrains.mynotes.router.RouterHolder;

public class MainActivity extends AppCompatActivity implements RouterHolder {

    private AppRouter router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        router = new AppRouter(getSupportFragmentManager());

        if (savedInstanceState == null) {
            router.showNotesList();
        }

    }

    @Override
    public AppRouter getRouter() {
        return router;
    }
}