package com.example.restapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


import com.example.restapp.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private final List<String>  Mensajes= Arrays.asList("holi", "Hello", "¿ Que tal?",
      "¿Como estas?", "Bienvenido", "Buenos Dias", "Buenas Noches");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView = findViewById(R.id.Mensaje);
        mButton = findViewById(R.id.Boton);

        string mensaje = setText(Mensajes.get(1));
        mTextView = setText(Mensajes);





    }
}