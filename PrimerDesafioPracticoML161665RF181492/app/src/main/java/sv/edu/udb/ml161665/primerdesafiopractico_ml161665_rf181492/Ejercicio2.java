package sv.edu.udb.ml161665.primerdesafiopractico_ml161665_rf181492;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Arrays;


public class Ejercicio2 extends AppCompatActivity {

    private EditText edVotos;
    private TextView tTotal, tResultado;
    int totalVotos=0;
    String cadena = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        edVotos = findViewById(R.id.edtiTextValores);
        tTotal = findViewById(R.id.tvTotal);
        tResultado = findViewById(R.id.tvResultado);
    }

    public void calcular (View v){
        String[] votosCadenaTexto = edVotos.getText().toString().split("[,]");
        int[] numArray = new int[votosCadenaTexto.length];


        int contador = 0;
        int aux = numArray[0];

        for (int i=0; i<numArray.length; i++)
        {
            numArray[i]= Integer.parseInt(votosCadenaTexto[i]);
            Arrays.sort(numArray);
            if(aux == numArray[i]){
                contador++;
            } else{
                totalVotos=numArray.length;
                double porcentaje = (contador * 100)/ totalVotos;
                cadena += "El numero " + numArray[i] + "\n tuvo la cantidad de votos: " + contador + "\n El porcentaje: " +porcentaje+"%\n";



            }
        }

        tTotal.setText(totalVotos);
        tResultado.setText(cadena);

    }
}