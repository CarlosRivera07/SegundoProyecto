package com.example.screentitle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class MainActivity extends AppCompatActivity {

    EditText etNombre;
    DatePicker etFecha;
    EditText etTelefono;
    EditText etEmail;
    EditText etDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.tiNombre);
        etFecha = (DatePicker)findViewById(R.id.dpFecha);
        etTelefono = (EditText)findViewById(R.id.tiTelefono);
        etEmail = (EditText)findViewById(R.id.tiEmail);
        etDescripcion = (EditText)findViewById(R.id.tiDescripcion);

        final String sNombre = etNombre.getText().toString();
        final String sFecha = etFecha.getDayOfMonth() + "/" + etFecha.getMonth() + "/" + etFecha.getYear();
        final String sTelefono = etTelefono.getText().toString();
        final String sEmail = etEmail.getText().toString();
        final String sDescripcion = etDescripcion.getText().toString();

        Button btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
                intent.putExtra("Nombre", sNombre);
                intent.putExtra("Fecha", sFecha);
                intent.putExtra("Telefono", sTelefono);
                intent.putExtra("Email", sEmail);
                intent.putExtra("Descripcion", sDescripcion);


                startActivity(intent);
            }
        });




    }

}
