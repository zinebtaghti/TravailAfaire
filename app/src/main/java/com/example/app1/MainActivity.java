package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText nom;
    private Button envoyer;
    private Spinner villes;

    private EditText email;
    private EditText phone;
    private EditText adresse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.email1);
        envoyer = findViewById(R.id.envoyer);
        villes  =  findViewById(R.id.villes);
        email  =  findViewById(R.id.email);
        phone  =  findViewById(R.id.phone);
        adresse  = findViewById(R.id.adresse);

        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nom", nom.getText().toString());
                intent.putExtra("ville", villes.getSelectedItem().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("adresse", adresse.getText().toString());



                startActivity(intent);

            }

        });

    }
}