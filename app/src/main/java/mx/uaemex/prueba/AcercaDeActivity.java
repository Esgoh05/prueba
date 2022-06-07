package mx.uaemex.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class AcercaDeActivity extends AppCompatActivity {

    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_pantalla4);
        //setTitle("Pantalla 3");
    //}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_acercade, menu);
        return super.onCreateOptionsMenu(menu);
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setTheme(R.style.ChanceColor);
            //setContentView(R.layout.activity_recomendaciones);
            //setContentView(R.layout.activity_rec);
            setContentView(R.layout.activity_acercade);
            setTitle("Recomendaciones ");

        }
    }
