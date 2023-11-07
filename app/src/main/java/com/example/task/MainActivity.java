package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import com.example.task.R.id;
import com.example.task.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new Fragment());
        binding.bottomMenu.setBackground(null);

        binding.bottomMenu.setOnItemSelectedListener(this::onNavigationItemSelected);


    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();

    }

    private boolean onNavigationItemSelected(MenuItem item) {

        if (item.getItemId() == id.home) {
            replaceFragment(new HomeFragment());
        } else if (item.getItemId() == id.search) {
            replaceFragment(new SearchFragment());
        } else if (item.getItemId() == id.upload) {
            replaceFragment(new UploadFragment());

        } else if (item.getItemId() == id.reels) {
            replaceFragment(new ReelsFragment());
        } else if (item.getItemId() == id.account) {
            replaceFragment(new AccountFragment());


        }
        return true;
    }
}