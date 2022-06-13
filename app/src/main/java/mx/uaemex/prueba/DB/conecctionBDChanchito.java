package mx.uaemex.prueba.DB;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import mx.uaemex.prueba.DB.objectsChanchito.etiquetas;
import mx.uaemex.prueba.DB.objectsChanchito.gastos;
import mx.uaemex.prueba.DB.tables.etiquetasGastos;
import mx.uaemex.prueba.DB.tables.gastosMes;

public class conecctionBDChanchito extends SQLiteOpenHelper {

        private static  final int DB_VERSION =1;
        private static final String DB_NAME= "DBCHANCHITO";

        public conecctionBDChanchito(@Nullable Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            etiquetasGastos etiquetas = new etiquetasGastos();
            String CREATE_TABLE_ETIQUETAS = "CREATE TABLE " + etiquetas.getTableName() + "("
                    + etiquetas.getIdPk() + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + etiquetas.getNameEtiqueta() + " TEXT"
                    + ")";
            db.execSQL(CREATE_TABLE_ETIQUETAS);

            gastosMes gastos = new gastosMes();
            String CREATE_TABLE_GASTOS = "CREATE TABLE " + gastos.getTableName() + "("
                    + gastos.getIdPk() + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + gastos.getIdEtiqueta() + " INTEGER,"
                    + gastos.getDATEGASTO() + " LONG,"
                    + gastos.getMONTO() + " DOUBLE"
                    + ")";
            db.execSQL(CREATE_TABLE_GASTOS);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            etiquetasGastos etiquetas = new etiquetasGastos();
            gastosMes gastos = new gastosMes();
            db.execSQL("DROP TABLE IF EXISTS " + etiquetas.getTableName());
            onCreate(db);
            db.execSQL("DROP TABLE IF EXISTS " + gastos.getTableName());
            onCreate(db);
        }

        public long inserNewEtiqueta(etiquetas newEtiqueta){
            Log.d("Resultado conecctionBD", newEtiqueta.getNAME_ETIQUETA());
            SQLiteDatabase db  = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            etiquetasGastos etiqueta = new etiquetasGastos();

            values.put(etiqueta.getNameEtiqueta(), newEtiqueta.getNAME_ETIQUETA());

            long newId = db.insert(etiqueta.getTableName(), null, values);

            return newId;
        }

        public long inserNewGosto(gastos newGasto){
            SQLiteDatabase db  = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            gastosMes gastos = new gastosMes();

            values.put(gastos.getIdEtiqueta(), newGasto.getID_ETIQUETA());
            values.put(gastos.getDATEGASTO(), newGasto.getDATE_GASTO());
            values.put(gastos.getMONTO(), newGasto.getMONTO());

            long id = db.insert(gastos.getTableName(), null, values);

            return id;
        }

        @SuppressLint("Range")
        public ArrayList<etiquetas> getEtiquetas(){
            ArrayList<etiquetas> list = new ArrayList<>();
            SQLiteDatabase db = this.getReadableDatabase();
            etiquetasGastos tabla = new etiquetasGastos();

            String query = "SELECT * FROM " + tabla.getTableName();

            Cursor cursor = db.rawQuery(query, null);

            while (cursor.moveToNext()){
                etiquetas etiqueta = new etiquetas();
                etiqueta.setID_PK(cursor.getInt(cursor.getColumnIndex(tabla.getIdPk())));
                etiqueta.setNAME_ETIQUETA(cursor.getString(cursor.getColumnIndex(tabla.getNameEtiqueta())));

                list.add(etiqueta);
            }
            cursor.close();
            db.close();

            return list;
        }

        @SuppressLint("Range")
        public ArrayList<gastos> getGastosMes(){
            ArrayList<gastos> list = new ArrayList<>();
            SQLiteDatabase db = this.getReadableDatabase();
            gastosMes tabla1 = new gastosMes();
            etiquetasGastos tabla2 = new etiquetasGastos();

            String query = "SELECT G." + tabla2.getNameEtiqueta()+ ", SUM(GM."+tabla1.getMONTO()+") FROM " + tabla1.getTableName() + " AS  GM "+  tabla2.getTableName() + " AS G "
                    + " WHERE " + tabla1.getIdEtiqueta() + " = " + tabla2.getIdPk();

            Cursor cursor = db.rawQuery(query, null);

            while (cursor.moveToNext()){
                gastos gastosMes  = new gastos();

                gastosMes.setID_ETIQUETA(cursor.getString(cursor.getColumnIndex(tabla2.getNameEtiqueta())));
                gastosMes.setMONTO(cursor.getString(cursor.getColumnIndex(tabla1.getMONTO())));

                list.add(gastosMes);
            }
            cursor.close();
            db.close();

            return list;
        }

        @SuppressLint("Range")
        public ArrayList<gastos> getGastosDetallado(){
            ArrayList<gastos> list = new ArrayList<>();
            SQLiteDatabase db = this.getReadableDatabase();
            gastosMes tabla1 = new gastosMes();
            etiquetasGastos tabla2 = new etiquetasGastos();

            String query = "SELECT * FROM " + tabla1.getTableName() + " AS  GM "+  tabla2.getTableName() + " AS G "
                    + " WHERE " + tabla1.getIdEtiqueta() + " = " + tabla2.getIdPk();

            Cursor cursor = db.rawQuery(query, null);

            while (cursor.moveToNext()){
                gastos gastosMes  = new gastos();

                gastosMes.setID_ETIQUETA(cursor.getString(cursor.getColumnIndex(tabla2.getNameEtiqueta())));
                gastosMes.setDATE_GASTO(cursor.getLong(cursor.getColumnIndex(tabla1.getDATEGASTO())));
                gastosMes.setMONTO(cursor.getString(cursor.getColumnIndex(tabla1.getMONTO())));

                list.add(gastosMes);
            }
            cursor.close();
            db.close();

            return list;
        }

    }
