package mx.uaemex.prueba;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

import mx.uaemex.prueba.DB.conecctionBDChanchito;
import mx.uaemex.prueba.DB.objectsChanchito.etiquetas;

public class ResumenActivity extends AppCompatActivity {


    private View myTextClick;
    private Spinner listaEgresos;
    private View txtClickOtros;
    private EditText edtNCantidad;
    private EditText edtAgregarOt;
    private Button btnAgregar;
    private Button btnInsertar;
    conecctionBDChanchito db;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_resumen, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private PieChart pie;
    List<PieEntry> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = new conecctionBDChanchito(this);
        setTheme(R.style.ChanceColor);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_configuracion1);
        setContentView(R.layout.activity_resumen);
        setTitle("Resumen");

        ActionBar actionBar = getSupportActionBar();
        ((ActionBar) actionBar).setDisplayHomeAsUpEnabled(true);


        listaEgresos = (Spinner) findViewById(R.id.spiner);
        llenaLista();
        //datos cargados estaticos
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.lista_egresos, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        listaEgresos.setAdapter(adapter);

        pie = (PieChart) findViewById(R.id.pie);
        list=new ArrayList<>();

        list.add(new PieEntry(56,"Disponible"));
        list.add(new PieEntry(44,"Renta"));

        PieDataSet pieDataSet=new PieDataSet(list,"");
        PieData pieData=new PieData(pieDataSet);
        pie.setData(pieData);

        pie.setBackgroundColor(Color.WHITE);

        // Establecer el color de cada dato
        pieDataSet.setColors(Color.RED,Color.BLUE);
        // El radio del círculo hueco del sector de la entidad se establece en 0, es un círculo en lugar de un anillo
        pie.setHoleRadius(40);
        // El radio del círculo blanco semitransparente en el medio se oculta cuando se establece en 0
        pie.setTransparentCircleRadius(20);
        // Establecer el color del círculo central
        pie.setHoleColor(Color.WHITE);
        // Establecer la palabra en la parte central (generalmente se establece cuando el círculo blanco en el medio no está oculto)
        pie.setCenterText("Disponible");
        // Establecer el color de fuente de la palabra central
        pie.setCenterTextColor(Color.RED);
        // Establece el tamaño de fuente de la palabra central
        pie.setCenterTextSize(15);
        // Establece el tamaño de fuente de la descripción (hombre mujer en la imagen)
        pie.setEntryLabelTextSize(20);
        // Establece el tamaño de fuente de los datos (44 56 en la figura)
        pieDataSet.setValueTextSize(20);
        // Establecer la ubicación de la descripción
        pieDataSet.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        pieDataSet.setValueLinePart1Length(0.6f);// Establecer la longitud de la línea de conexión de descripción
        // Establecer la ubicación de los datos
        pieDataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        pieDataSet.setValueLinePart2Length(0.6f);// Establecer la longitud de la línea de conexión de datos
        // Establecer el color de las dos líneas de conexión
        pieDataSet.setValueLineColor(Color.BLACK);

        // Para el funcionamiento de una cadena de letras en la esquina inferior derecha
        pie.getDescription().setEnabled(false);                                    // Si mostrar la descripción en la esquina inferior derecha
        pie.getDescription().setText("Esta es la forma de modificar esa cadena de inglés");        // Modificar la visualización de las letras en la esquina inferior derecha
        pie.getDescription().setTextSize(20);                                        //tamaño de fuente
        pie.getDescription().setTextColor(Color.RED);                          //color de fuente

        //pie.setTransparentCircleAlpha(300);
        pie.setEntryLabelColor(Color.parseColor("#1976D2"));
        //pie.setEntryLabelTypeface(Typeface.DEFAULT);
        pie.setEntryLabelTextSize(20f);

        //Leyenda
        Legend legend=pie.getLegend();
        legend.setEnabled(true);        // Si mostrar la leyenda
        legend.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);        // Posición de la leyenda


        //Actualización de datos
        pie.notifyDataSetChanged();
        pie.invalidate();

        // Animación (si usa animación, puede omitir el paso de actualización de datos)
        pie.animateY(4000);  // El parámetro de animación en el eje Y es el tiempo de ejecución de la animación en milisegundos
//        line.animateX(2000);  // Animación del eje X
//        line.animateXY(2000,2000);// Animación mixta de dos ejes XY

        myTextClick = findViewById(R.id.text_click);
//        listaEgresos = findViewById(R.id.spiner);
        txtClickOtros = findViewById(R.id.text_click_otros);
        edtNCantidad = findViewById(R.id.edtNumberCantidad);
        edtAgregarOt = findViewById(R.id.edtAgregarOt);
        btnAgregar = findViewById(R.id.btn_agregar);
        btnInsertar = findViewById(R.id.btn_insertar);


        //btnAgregar.setBackgroundColor(Color.parseColor("#1976D2"));
        btnAgregar.setBackgroundResource(R.drawable.custom_button); //shape, contorno de esquinas para boton
        btnAgregar.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1976D2")));

        btnInsertar.setBackgroundResource(R.drawable.custom_button); //shape, contorno de esquinas para boton
        btnInsertar.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1976D2")));

        myTextClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Remplazar por tu codigo", Toast.LENGTH_LONG)
                        //.show();
                if(listaEgresos.getVisibility() == View.INVISIBLE){ //si es Visible lo pones Gone
                    listaEgresos.setVisibility(View.VISIBLE);
                    txtClickOtros.setVisibility(View.VISIBLE);
                    edtNCantidad.setVisibility(View.VISIBLE);
                    edtAgregarOt.setVisibility(View.INVISIBLE);
                    btnInsertar.setVisibility(View.VISIBLE);
                    btnAgregar.setVisibility(View.INVISIBLE);
                    //Toast.makeText(getApplicationContext(), "Elige campos", Toast.LENGTH_LONG)
                    //.show();
                }
                else{ // si no es Visible, lo pones
                    listaEgresos.setVisibility(View.INVISIBLE);
                    txtClickOtros.setVisibility(View.INVISIBLE);
                    edtNCantidad.setVisibility(View.INVISIBLE);
                    edtAgregarOt.setVisibility(View.INVISIBLE);
                    //btnAgregar.setVisibility(View.INVISIBLE);
                    btnInsertar.setVisibility(View.INVISIBLE);
                }
            }
        });

        txtClickOtros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnAgregar.getVisibility() == View.INVISIBLE){ //si es Visible lo pones Gone
                    edtAgregarOt.setVisibility(View.VISIBLE);
                    listaEgresos.setVisibility(View.INVISIBLE);
                    edtNCantidad.setVisibility(View.INVISIBLE);
                    btnAgregar.setVisibility(View.VISIBLE);
                    btnInsertar.setVisibility(View.INVISIBLE);
                    //Toast.makeText(getApplicationContext(), "Elige campos", Toast.LENGTH_LONG)
                    //.show();
                }
                else{ // si no es Visible, lo pones
                    edtAgregarOt.setVisibility(View.INVISIBLE);
                    btnAgregar.setVisibility(View.INVISIBLE);
                    txtClickOtros.setVisibility(View.INVISIBLE);
                }

            }

        });

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Remplazar por tu codigo", Toast.LENGTH_LONG)
                //.show();
                insertLista(edtAgregarOt.getText().toString());
            }
        });

    }

    private void llenaLista(){
        ArrayList<etiquetas> etiquetasList = db.getEtiquetas();
        String[] etiquetasSting = new String[etiquetasList.size()];
        int i = 0;
        for (etiquetas etiq:
                etiquetasList) {
            Log.d("llenar lista ", etiq.getNAME_ETIQUETA());
            etiquetasSting [i] = etiq.getNAME_ETIQUETA();
            i++;
        }
        for (String eti:
        etiquetasSting) {
            Log.d("Arreglo lleno", eti);
        }
        listaEgresos.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, etiquetasSting ));

    }

    public void insertLista(String etiqueta){
        Log.d("Resultado" , etiqueta);
        etiquetas insert = new etiquetas();
        insert.setNAME_ETIQUETA(etiqueta);
        db.inserNewEtiqueta(insert);
        llenaLista();
    }


}