package com.office.testfab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
   private BottomNavigationView bottomNavigationView;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      bottomNavigationView = findViewById(R.id.bottomNavigationView);

      bottomNavigationView.setBackgroundResource(android.R.color.transparent);
      bottomNavigationView.getMenu().getItem(2).setEnabled(false);
   }
}