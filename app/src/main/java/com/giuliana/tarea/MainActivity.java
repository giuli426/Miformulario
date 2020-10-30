package com.giuliana.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellidos, fecha_de_nacimiento, telefono, correo, descripcion;
    Button aceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre    = (EditText) findViewById(R.id.editNombre);
        apellidos = (EditText) findViewById(R.id.editApellidos);
        fecha_de_nacimiento = (EditText) findViewById(R.id.editFecha_de_nacimiento);
        telefono  = (EditText) findViewById(R.id.editTelefono);
        correo    = (EditText) findViewById(R.id.editCorreo);
        descripcion = (EditText) findViewById(R.id.editDescripcion);
        aceptar   = (Button) findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nombre.getText().toString();
                String ape = apellidos.getText().toString();
                String fecha = fecha_de_nacimiento.getText().toString();
                String tel = telefono.getText().toString();
                String mail = correo.getText().toString();
                String desc = descripcion.getText().toString();

                Intent i = new Intent(MainActivity.this, MostrarDatos.class);

                i.putExtra("name" , name);
                i.putExtra("ape" , ape);
                i.putExtra("fecha" , fecha);
                i.putExtra("tel" , tel);
                i.putExtra("mail" , mail);
                i.putExtra("desc" , desc);

                startActivity(i);
            }
        });

    }
}