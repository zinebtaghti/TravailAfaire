package com.example.app1;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView name, email1,phonenumber,adresse1 , ville1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email1 = findViewById(R.id.email1);
        adresse1 = findViewById(R.id.adresse1);
        ville1 = findViewById(R.id.ville1);
        name = findViewById(R.id.name);
        phonenumber = findViewById(R.id.phonenumber);


        name.setText("Nom et prenom: "+this.getIntent().getStringExtra("nom"));
        adresse1.setText("Adresse: "+this.getIntent().getStringExtra("adresse"));
        email1.setText("Email: "+this.getIntent().getStringExtra("email"));
        phonenumber.setText("Phone: "+this.getIntent().getStringExtra("phone"));
        ville1.setText("Ville: "+this.getIntent().getStringExtra("ville"));
    }
}