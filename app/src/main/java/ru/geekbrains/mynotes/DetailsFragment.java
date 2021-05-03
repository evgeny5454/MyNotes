package ru.geekbrains.mynotes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import ru.geekbrains.mynotes.domain.Note;

import static java.lang.String.valueOf;


public class DetailsFragment extends Fragment {

    private static final String ARG_NOTE = "ARG_NOTE";

    public static DetailsFragment newInstance (Note note) {



        DetailsFragment fragment = new DetailsFragment();

        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_NOTE, note);
        fragment.setArguments(bundle);

        return fragment;
    }

    public DetailsFragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar details_toolbar = view.findViewById(R.id.details_toolbar);

        details_toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.save_note) {
                    Toast.makeText(requireActivity(),"Сохранить заметку",Toast.LENGTH_LONG).show();
                    return true;
                }

                if (item.getItemId() == R.id.dell_note) {
                    Toast.makeText(requireActivity(),"Удалить заметку",Toast.LENGTH_LONG).show();
                    return true;
                }
                if (item.getItemId() == R.id.favorites) {
                    Toast.makeText(requireActivity(),"Добавить в избранное",Toast.LENGTH_LONG).show();
                    return true;
                }
                if (item.getItemId() == R.id.pin_to_home_screen) {
                    Toast.makeText(requireActivity(),"Закрепить на главном экране",Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });

        details_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getParentFragmentManager();
                fragmentManager.popBackStack();
            }
        });



        TextView content = view.findViewById(R.id.content);

        Note note = getArguments().getParcelable(ARG_NOTE);

        details_toolbar.setTitle(note.getTitle());



        //title.setText(note.getTitle());

        content.setText(note.getContent());


    }
}