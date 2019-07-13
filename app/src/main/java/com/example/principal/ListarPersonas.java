package com.example.principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Persona> persona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);
        tabla = findViewById(R.id.tabla);
        persona = Datos.obtener();
        for(int i = 0; i < persona.size(); i++)
        {
            //Creamos objeto fila para añadir a la fila
            TableRow fila = new TableRow(this);

            //Creamos las columnas de la fila
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(persona.get(i).getCedula());
            c3.setText(persona.get(i).getNombre());
            c4.setText(persona.get(i).getApellido());

            //Añadimos las columnas a la fila
            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            //Añadimos la fila a la tabla
            tabla.addView(fila);
        }
    }
}
