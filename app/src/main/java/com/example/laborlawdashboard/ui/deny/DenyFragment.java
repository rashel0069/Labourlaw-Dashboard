package com.example.laborlawdashboard.ui.deny;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.laborlawdashboard.R;

public class DenyFragment extends Fragment {

    private DenyViewModel denyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        denyViewModel = ViewModelProviders.of(this).get(DenyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_deny, container, false);
        //final TextView textView = root.findViewById(R.id.text_dashboard);
        denyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toast.makeText(getContext(), "Deny Fragment", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}
