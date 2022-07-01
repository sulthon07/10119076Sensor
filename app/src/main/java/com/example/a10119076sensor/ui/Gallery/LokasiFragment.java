package com.example.myapplication.ui.Lokasi;
//  NIM     : 10119076
//  Nama    : Sulthon Naufal Akmal
//  Kelas   : IF2
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a10119076sensor.databinding.FragmentHomeBinding;
import com.example.a10119076sensor.ui.Gallery.LokasiViewModel;

public class LokasiFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LokasiViewModel homeViewModel =
                new ViewModelProvider(this).get(LokasiViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}