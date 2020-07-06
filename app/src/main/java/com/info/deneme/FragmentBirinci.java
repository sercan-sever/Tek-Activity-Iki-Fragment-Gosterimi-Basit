package com.info.deneme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class FragmentBirinci extends Fragment {


    private ImageView imageView;
    private TextView textViewResimAd;
    private Button buttonGeri,buttonIleri;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_birinci_layout,container,false);

        imageView = v.findViewById(R.id.imageView);
        textViewResimAd = v.findViewById(R.id.textViewResimAd);
        buttonIleri = v.findViewById(R.id.buttonIleri);
        buttonGeri = v.findViewById(R.id.buttonGeri);

        buttonIleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.inception);
                textViewResimAd.setText("Inception");
            }
        });

        buttonGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.setImageResource(R.drawable.django);
                textViewResimAd.setText("Djonga");
            }
        });




        return v;
    }
}
