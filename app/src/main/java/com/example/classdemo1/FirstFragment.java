package com.example.classdemo1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.classdemo1.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private int count = 0; // Default count

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Find views
        // Use view.findViewById() for Fragments
        TextView textViewCount = view.findViewById(R.id.textView_count);
        Button buttonCount = view.findViewById(R.id.button_count);

        binding.toastButton.setOnClickListener(v ->
                Toast.makeText(requireContext(), "Hello Toast", Toast.LENGTH_SHORT).show()
        );
        // Button click event to increase count
        buttonCount.setOnClickListener(v -> {
            count++; // Increase count
            textViewCount.setText(String.valueOf(count)); // Update TextView
        });


    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}