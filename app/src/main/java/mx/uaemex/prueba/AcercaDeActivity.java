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
    private View Recomendaciones5;
    private View Recomendaciones6;
    private View Recomendaciones7;
    private View Recomendaciones8;
    private View Recomendaciones9;
    private RelativeLayout txtRecomendaciones;
    private RelativeLayout txtRecomendaciones1;
    private RelativeLayout txtRecomendaciones2;
    private RelativeLayout txtRecomendaciones3;
    private RelativeLayout txtRecomendaciones4;
    private RelativeLayout txtRecomendaciones5;
    private RelativeLayout txtRecomendaciones6;
    private RelativeLayout txtRecomendaciones7;
    private RelativeLayout txtRecomendaciones8;
    private RelativeLayout txtRecomendaciones9;

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
            Recomendaciones5 = findViewById(R.id.txtRec2);
            Recomendaciones6 = findViewById(R.id.item_txtTip3);
            Recomendaciones7 = findViewById(R.id.txtRec3);
            Recomendaciones8 = findViewById(R.id.item_txtTip4);
            Recomendaciones9 = findViewById(R.id.item_MoreInfo);
            txtRecomendaciones = findViewById(R.id.relativeLayout3);
            txtRecomendaciones1 = findViewById(R.id.relativeLayout4);
            txtRecomendaciones3 = findViewById(R.id.relativeLayout1);
            txtRecomendaciones2 = findViewById(R.id.relativeLayout5);
            txtRecomendaciones4 = findViewById(R.id.relativeLayout6);
            txtRecomendaciones5 = findViewById(R.id.relativeLayout2);
            txtRecomendaciones6 = findViewById(R.id.relativeLayout7);
            txtRecomendaciones7 = findViewById(R.id.relativeLayout8);
            txtRecomendaciones8 = findViewById(R.id.relativeLayout9);
            txtRecomendaciones9 = findViewById(R.id.relativeLayout10);

            Recomendaciones.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //txtRecomendaciones.setVisibility(View.GONE);
                    //Toast.makeText(getApplicationContext(), "#Tip 2. Que tus gastos no excedan la cantidad de tus ingresos", Toast.LENGTH_LONG)
                    //.show();
                    if(Recomendaciones1.getVisibility() == View.VISIBLE){
                        txtRecomendaciones1.setVisibility(View.VISIBLE);
                        txtRecomendaciones2.setVisibility(View.INVISIBLE);
                        txtRecomendaciones4.setVisibility(View.INVISIBLE);
                        txtRecomendaciones7.setVisibility(View.INVISIBLE);
                        txtRecomendaciones9.setVisibility(View.INVISIBLE);
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
                        txtRecomendaciones4.setVisibility(View.INVISIBLE);
                        txtRecomendaciones7.setVisibility(View.INVISIBLE);
                        txtRecomendaciones9.setVisibility(View.INVISIBLE);
                    }
                    else {
                        txtRecomendaciones2.setVisibility(View.INVISIBLE);
                    }

                }
            });

            Recomendaciones3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(Recomendaciones5.getVisibility() == View.VISIBLE){
                        txtRecomendaciones4.setVisibility(View.VISIBLE);
                        txtRecomendaciones1.setVisibility(View.INVISIBLE);
                        txtRecomendaciones2.setVisibility(View.INVISIBLE);
                        txtRecomendaciones7.setVisibility(View.INVISIBLE);
                        txtRecomendaciones9.setVisibility(View.INVISIBLE);
                    }
                    else {
                        txtRecomendaciones4.setVisibility(View.INVISIBLE);
                    }

                }
            });

            Recomendaciones6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //txtRecomendaciones.setVisibility(View.GONE);
                    //Toast.makeText(getApplicationContext(), "#Tip 2. Que tus gastos no excedan la cantidad de tus ingresos", Toast.LENGTH_LONG)
                    //.show();
                    if(Recomendaciones7.getVisibility() == View.VISIBLE){
                        txtRecomendaciones7.setVisibility(View.VISIBLE);
                        txtRecomendaciones2.setVisibility(View.INVISIBLE);
                        txtRecomendaciones4.setVisibility(View.INVISIBLE);
                        txtRecomendaciones1.setVisibility(View.INVISIBLE);
                        txtRecomendaciones9.setVisibility(View.INVISIBLE);
                    }
                    else {
                        txtRecomendaciones7.setVisibility(View.INVISIBLE);
                    }

                }
            });

            Recomendaciones8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //txtRecomendaciones.setVisibility(View.GONE);
                    //Toast.makeText(getApplicationContext(), "#Tip 2. Que tus gastos no excedan la cantidad de tus ingresos", Toast.LENGTH_LONG)
                    //.show();
                    if(Recomendaciones9.getVisibility() == View.VISIBLE){
                        txtRecomendaciones9.setVisibility(View.VISIBLE);
                        txtRecomendaciones1.setVisibility(View.INVISIBLE);
                        txtRecomendaciones4.setVisibility(View.INVISIBLE);
                        txtRecomendaciones7.setVisibility(View.INVISIBLE);
                        txtRecomendaciones2.setVisibility(View.INVISIBLE);
                    }
                    else {
                        txtRecomendaciones9.setVisibility(View.INVISIBLE);
                    }

                }
            });
        }
    }
