package mx.uaemex.prueba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class HistorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.ChanceColor);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        //setContentView(R.layout.activity_historial2);
        setTitle("Historial");

        ActionBar actionBar = getSupportActionBar();
        ((ActionBar) actionBar).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_historial, menu);
        return super.onCreateOptionsMenu(menu);
    }

}