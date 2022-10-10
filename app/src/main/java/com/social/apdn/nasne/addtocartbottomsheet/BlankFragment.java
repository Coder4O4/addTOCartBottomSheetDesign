package com.social.apdn.nasne.addtocartbottomsheet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.social.apdn.nasne.addtocartbottomsheet.databinding.FragmentBlankBinding;


public class BlankFragment extends BottomSheetDialogFragment {

    FragmentBlankBinding blankBinding;
    String  brandName,  price ,  freeDV;
    int available;
    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        blankBinding = FragmentBlankBinding.inflate(inflater , container , false);

        brandName = this.getArguments().getString("BrandName");
        price = this.getArguments().getString("price");
        freeDV = this.getArguments().getString("freeDV");

        available = this.getArguments().getInt("available");

        if (brandName.equals("Adidas Lite"))
        {

            Glide.with(blankBinding.brandImage.getContext())
                    .load(R.drawable.shooe1)
                    .placeholder(R.drawable.shooe1)
                    .into(blankBinding.brandImage);
        }
        else  if (brandName.equals("LG Monitor"))
        {
            Glide.with(blankBinding.brandImage.getContext())
                    .load(R.drawable.monitor1)
                    .placeholder(R.drawable.monitor1)
                    .into(blankBinding.brandImage);

        }
        else  if (brandName.equals("Redme 7"))
        {
            Glide.with(blankBinding.brandImage.getContext())
                    .load(R.drawable.redmy_mob)
                    .placeholder(R.drawable.redmy_mob)
                    .into(blankBinding.brandImage);

        }
        else  if (brandName.equals("Asian"))
        {
            Glide.with(blankBinding.brandImage.getContext())
                    .load(R.drawable.shooe2)
                    .placeholder(R.drawable.shooe2)
                    .into(blankBinding.brandImage);

        }
        else  if (brandName.equals("Realme s1"))
        {
            Glide.with(blankBinding.brandImage.getContext())
                    .load(R.drawable.tab1)
                    .placeholder(R.drawable.tab1)
                    .into(blankBinding.brandImage);

        }

        blankBinding.brandName.setText(brandName);

        if (freeDV.equals("y"))
        {
            blankBinding.freeDEV.setText("Free delivery is available.");
        }
        else
        {
            blankBinding.freeDEV.setText("Free delivery is not available.");
        }

        blankBinding.availablePieces.setText(available + "+");


        blankBinding.cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment.super.dismiss();
            }
        });

        blankBinding.addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment.super.dismiss();
            }
        });

        return blankBinding.getRoot();
    }
}