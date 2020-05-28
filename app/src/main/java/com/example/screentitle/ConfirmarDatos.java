package com.example.screentitle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ConfirmarDatos extends AppCompatActivity {

        static TextView Nombre;
        static TextView Fecha;
        static TextView Telefono;
        static TextView Email;
        static TextView Descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Nombre = (TextView)findViewById(R.id.tvNombre);
        Fecha = (TextView)findViewById(R.id.tvFechaNacimiento);
        Telefono = (TextView)findViewById(R.id.tvTelefono);
        Email = (TextView)findViewById(R.id.tvEmail);
        Descripcion = (TextView)findViewById(R.id.tvDescripcion);

        Bundle parametros = this.getIntent().getExtras();
        if (parametros == null){
            String sNombre = parametros.getString("Nombre");
            String sFecha = parametros.getString("Fecha");
            String sTelefono = parametros.getString("Telefono");
            String sEmail = parametros.getString("Email");
            String sDescripcion = parametros.getString("Descripcion");

            Nombre.setText(sNombre);
            Fecha.setText(sFecha);
            Telefono.setText(sTelefono);
            Email.setText(sEmail);
            Descripcion.setText(sDescripcion);
        }

    }
}
