package mx.uaemex.prueba.DB.tables;

public class gastosMes {
    private static final String TABLE_NAME = "GASTOSMES";
    private static final String ID_PK = "ID";
    private static final String ID_ETIQUETA = "ID_ETIQUETA";
    private static final String DATE_GASTO = "FECHA_GASTO";
    private static final String MONTO = "MONTO";

    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getIdPk() {
        return ID_PK;
    }

    public static String getIdEtiqueta() {
        return ID_ETIQUETA;
    }

    public static String getDATEGASTO() {
        return DATE_GASTO;
    }

    public static String getMONTO() {
        return MONTO;
    }

    public gastosMes() {
    }
}
