package com.wave.databindingexample;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wave.databindingexample.databinding.UserLayoutBinding;


public class MainActivity extends AppCompatActivity {

    UserLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.user_layout);

        UserViewModel userViewModel = ViewModelProviders.of(this).get(UserViewModel.class);

        binding.setUserViewModel(userViewModel);

        binding.setHandler(new EventHandler(this));

        binding.setLifecycleOwner(this);

    }
}