package sv.edu.udb.ml161665.primerdesafiopractico_ml161665_rf181492;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void abrirEjercicio1(View v)
    {
        Intent llamar = new Intent(this, ejercicio1.class);
        startActivity(llamar);
    }

    public void abrirEjercicio2(View v)
    {
        Intent llamar = new Intent(this, Ejercicio2.class);
        startActivity(llamar);
    }

    public void abrirEjercicio3(View v)
    {
        Intent llamar = new Intent(this, ejercicio3.class);
        startActivity(llamar);
    }
}