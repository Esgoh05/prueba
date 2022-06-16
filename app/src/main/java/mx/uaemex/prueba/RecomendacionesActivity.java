package mx.uaemex.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;

public class RecomendacionesActivity extends AppCompatActivity {

    private View Recomendaciones;
    private View Recomendaciones1;
    private View Recomendaciones3;
    private View Recomendaciones5;
    private View Recomendaciones6;
    private View Recomendaciones7;
    private View Recomendaciones8;
    private View Recomendaciones9;
    private RelativeLayout txtRecomendaciones1;
    private RelativeLayout txtRecomendaciones4;
    private RelativeLayout txtRecomendaciones7;
    private RelativeLayout txtRecomendaciones9;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_recomendaciones, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.ChanceColor);
        setContentView(R.layout.activity_recomendaciones);
        setTitle("Recomendaciones ");

        Recomendaciones = findViewById(R.id.item_txtTip2);
        Recomendaciones1 = findViewById(R.id.item_txtRec);
        Recomendaciones3 = findViewById(R.id.item_txtTip1);
        Recomendaciones5 = findViewById(R.id.txtRec2);
        Recomendaciones6 = findViewById(R.id.item_txtTip3);
        Recomendaciones7 = findViewById(R.id.txtRec3);
        Recomendaciones8 = findViewById(R.id.item_txtTip4);
        Recomendaciones9 = findViewById(R.id.item_MoreInfo);
        txtRecomendaciones1 = findViewById(R.id.relativeLayout4);
        txtRecomendaciones4 = findViewById(R.id.relativeLayout6);
        txtRecomendaciones7 = findViewById(R.id.relativeLayout8);
        txtRecomendaciones9 = findViewById(R.id.relativeLayout10);

        Recomendaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Recomendaciones1.getVisibility() == View.VISIBLE){
                    txtRecomendaciones1.setVisibility(View.VISIBLE);
                    txtRecomendaciones4.setVisibility(View.INVISIBLE);
                    txtRecomendaciones7.setVisibility(View.INVISIBLE);
                    txtRecomendaciones9.setVisibility(View.INVISIBLE);
                }
                else {
                    txtRecomendaciones1.setVisibility(View.INVISIBLE);
                }

            }
        });

        Recomendaciones3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Recomendaciones5.getVisibility() == View.VISIBLE){
                    txtRecomendaciones4.setVisibility(View.VISIBLE);
                    txtRecomendaciones1.setVisibility(View.INVISIBLE);
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
                if(Recomendaciones7.getVisibility() == View.VISIBLE){
                    txtRecomendaciones7.setVisibility(View.VISIBLE);
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
                if(Recomendaciones9.getVisibility() == View.VISIBLE){
                    txtRecomendaciones9.setVisibility(View.VISIBLE);
                    txtRecomendaciones1.setVisibility(View.INVISIBLE);
                    txtRecomendaciones4.setVisibility(View.INVISIBLE);
                    txtRecomendaciones7.setVisibility(View.INVISIBLE);
                }
                else {
                    txtRecomendaciones9.setVisibility(View.INVISIBLE);
                }

            }
        });
    }
    }
