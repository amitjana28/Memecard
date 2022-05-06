package com.example.android.memecard;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.android.memecard.databinding.ActivityMainBinding;
import com.example.android.memecard.fragments.AddPostFragment;
import com.example.android.memecard.fragments.HomeFragment;
import com.example.android.memecard.fragments.NotificationFragment;
import com.example.android.memecard.fragments.Profile2Fragment;
import com.example.android.memecard.fragments.SearchFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.iammert.library.readablebottombar.ReadableBottomBar;


public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    FirebaseAuth auth  = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Hide Toolbar manually
        //getSupportActionBar().hide();

        setSupportActionBar(binding.toolbar);
        MainActivity.this.setTitle("My Profile");

        //Transparent Action Bar
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }*/


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        binding.toolbar.setVisibility(View.GONE);
        transaction.replace(R.id.content, new HomeFragment());
        transaction.commit();


        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (i) {
                    case 0:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.content, new HomeFragment());
                        break;
                    case 1:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.content, new NotificationFragment());
                        break;
                    case 2:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.content, new AddPostFragment());
                        break;
                    case 3:
                        transaction.replace(R.id.content, new SearchFragment());
                        binding.toolbar.setVisibility(View.GONE);
                        break;
                    case 4:
                        transaction.replace(R.id.content, new Profile2Fragment());
                        binding.toolbar.setVisibility(View.VISIBLE);
                        break;

                }
                transaction.commit();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
                auth.signOut();
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}