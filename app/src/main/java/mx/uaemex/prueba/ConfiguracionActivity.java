package mx.uaemex.prueba;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import mx.uaemex.prueba.DB.objectsChanchito.etiquetas;

public class ConfiguracionActivity extends AppCompatActivity {

    private Spinner listaFrecuenciaPago;
    private Spinner listaPeriodoPago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.ChanceColor);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        setTitle("Ingresos");

        ActionBar actionBar = getSupportActionBar();
        ((ActionBar) actionBar).setDisplayHomeAsUpEnabled(true);

        listaFrecuenciaPago = (Spinner) findViewById(R.id.spiner_frecuencia);
        listaPeriodoPago = (Spinner) findViewById(R.id.spiner_periodo);

        //datos cargados estaticos
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.lista_frecuencia_pago, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listaFrecuenciaPago.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.lista_periodo_semanal, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.lista_periodo_quincenal, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.lista_periodo_mensual, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        listaFrecuenciaPago.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), "El Elemento seleccionado es posición número: "+position +" El String es: "+listaFrecuenciaPago.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                if (position == 0) {
                    listaPeriodoPago.setAdapter(adapter1);

                }
                else if (position == 1){
                    listaPeriodoPago.setAdapter(adapter2);
                }
                else {
                    listaPeriodoPago.setAdapter(adapter3);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_configuracion, menu);
        return super.onCreateOptionsMenu(menu);
    }

}