package mx.uaemex.prueba;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class ConfiguracionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.ChanceColor);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        setTitle("Ingresos");

        ActionBar actionBar = getSupportActionBar();
        ((ActionBar) actionBar).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_configuracion, menu);
        return super.onCreateOptionsMenu(menu);
    }
}