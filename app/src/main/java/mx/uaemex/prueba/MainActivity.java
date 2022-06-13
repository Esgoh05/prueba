package mx.uaemex.prueba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.ChanceColor);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Mi Marranito");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.btn_salir){
            finish(); //no se elimina la actividad solo cierra la ultima actividad
        }
        if (id == R.id.btn_config) {
            Intent intent = new Intent(this, ConfiguracionActivity.class);
            startActivity(intent);
        }
        if (id == R.id.btn_resumen) {
            Intent intent = new Intent(this, ResumenActivity.class);
            startActivity(intent);
        }
        if (id == R.id.btn_hist) {
            Intent intent = new Intent(this, HistorialActivity.class);
            startActivity(intent);
        }
        if (id == R.id.btn_acde) {
            Intent intent = new Intent(this, RecomendacionesActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}