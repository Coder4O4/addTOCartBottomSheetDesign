package com.social.apdn.nasne.addtocartbottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.social.apdn.nasne.addtocartbottomsheet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.allCarts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "All Cart will be here.", Toast.LENGTH_SHORT).show();
            }
        });




        binding.cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String brandName = "Adidas Lite";
                String Price = "₹9 999";
                int available = 5;
                String freeDV = "y";
                processToSendData( brandName , Price , available , freeDV);
            }
        });


        binding.cart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String brandName = "LG Monitor";
                String Price = "₹24,599";
                int available = 10;
                String freeDV = "y";
                processToSendData(brandName, Price, available, freeDV);
            }
        });

        binding.cart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String brandName = "Redme 7";
                String Price = "₹15 999";
                int available = 0;
                String freeDV = "y";
                processToSendData(brandName, Price, available, freeDV);
            }
        });

        binding.cart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String brandName = "Asian";
                String Price = "₹1,200";
                int available = 3;
                String freeDV = "n";
                processToSendData(brandName, Price, available, freeDV);
            }
        });

        binding.cart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String brandName = "Realme s1";
                String Price = "₹10 999";
                int available = 0;
                String freeDV = "y";
                processToSendData(brandName, Price, available, freeDV);
            }
        });
    }

    private void processToSendData(String brandName, String price, int available, String freeDV)
    {
        BlankFragment blankFragment = new BlankFragment();
        blankFragment.show(getSupportFragmentManager() , blankFragment.getTag());


        Bundle bundle = new Bundle();
        bundle.putString("BrandName" , brandName );
        bundle.putString("price" , price );
        bundle.putInt("available" , available );
        bundle.putString("freeDV" , freeDV );
        blankFragment.setArguments(bundle);
    }


}