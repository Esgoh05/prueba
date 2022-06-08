package mx.uaemex.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class AcercaDeActivity extends AppCompatActivity {

    private View Recomendaciones;
    private View Recomendaciones1;
    private View Recomendaciones2;
    private View Recomendaciones3;
    private View Recomendaciones4;
    private RelativeLayout txtRecomendaciones;
    private RelativeLayout txtRecomendaciones1;
    private RelativeLayout txtRecomendaciones2;
    private RelativeLayout txtRecomendaciones3;

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
            setContentView(R.layout.activity_recomendaciones);
            //setContentView(R.layout.activity_rec);
            //setContentView(R.layout.activity_acercade);
            setTitle("Recomendaciones ");

            Recomendaciones = findViewById(R.id.item_txtTip2);
            Recomendaciones1 = findViewById(R.id.item_txtRec);
            Recomendaciones2 = findViewById(R.id.txtRec);
            Recomendaciones3 = findViewById(R.id.item_txtTip1);
            Recomendaciones4 = findViewById(R.id.item_textName3);
            txtRecomendaciones = findViewById(R.id.relativeLayout3);
            txtRecomendaciones1 = findViewById(R.id.relativeLayout4);
            txtRecomendaciones3 = findViewById(R.id.relativeLayout1);
            txtRecomendaciones2 = findViewById(R.id.relativeLayout5);

            Recomendaciones.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //txtRecomendaciones.setVisibility(View.GONE);
                    //Toast.makeText(getApplicationContext(), "#Tip 2. Que tus gastos no excedan la cantidad de tus ingresos", Toast.LENGTH_LONG)
                    //.show();
                    if(Recomendaciones1.getVisibility() == View.VISIBLE){
                        txtRecomendaciones1.setVisibility(View.VISIBLE);
                        txtRecomendaciones2.setVisibility(View.INVISIBLE);
                    }
                    else {
                        txtRecomendaciones1.setVisibility(View.INVISIBLE);
                    }

                }
            });

            Recomendaciones4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //txtRecomendaciones.setVisibility(View.GONE);
                    //Toast.makeText(getApplicationContext(), "#Tip 2. Que tus gastos no excedan la cantidad de tus ingresos", Toast.LENGTH_LONG)
                    //.show();
                    if(Recomendaciones2.getVisibility() == View.VISIBLE){
                        txtRecomendaciones2.setVisibility(View.VISIBLE);
                        txtRecomendaciones1.setVisibility(View.INVISIBLE);
                    }
                    else {
                        txtRecomendaciones2.setVisibility(View.INVISIBLE);
                    }

                }
            });
        }
    }
