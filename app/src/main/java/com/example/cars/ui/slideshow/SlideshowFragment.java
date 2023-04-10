package com.example.cars.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cars.R;
import com.example.cars.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {
    Button ExitButton;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // final TextView textView = binding.textSlideshow;
        //   slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;




    }

}