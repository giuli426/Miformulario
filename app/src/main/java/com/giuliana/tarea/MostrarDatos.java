package com.giuliana.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView tvnombre, tvapellidos, tvfecha_de_nacimiento, tvtelefono, tvcorreo, tvdescripcion;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        tvnombre = (TextView) findViewById(R.id.tvNombre);
        tvapellidos = (TextView) findViewById(R.id.tvApellidos);
        tvfecha_de_nacimiento = (TextView) findViewById(R.id.tvFecha_de_Nacimiento);
        tvtelefono = (TextView) findViewById(R.id.tvTelefono);
        tvcorreo = (TextView) findViewById(R.id.tvCorreo);
        tvdescripcion = (TextView) findViewById(R.id.tvDescripcion);
        btnOk = (Button)findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MostrarDatos.this, MainActivity.class);
                startActivity(intent);
            }
        });


        mostrarDato (); 
    }

    private void mostrarDato() {
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString( "name");
        String apellidos = datos.getString( "ape");
        String fecha_de_nacimiento = datos.getString( "fecha");
        String telefono = datos.getString( "tel");
        String correo = datos.getString( "mail");
        String descripcion = datos.getString( "desc");

        tvnombre.setText(nombre);
        tvapellidos.setText(apellidos);
        tvfecha_de_nacimiento.setText(fecha_de_nacimiento);
        tvtelefono.setText(telefono);
        tvcorreo.setText(correo);
        tvdescripcion.setText(descripcion);

    }
}