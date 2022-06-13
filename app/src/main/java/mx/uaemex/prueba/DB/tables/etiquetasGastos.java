package mx.uaemex.prueba.DB.tables;

public class etiquetasGastos {
    private static final String TABLE_NAME = "ETIQUITAS";
    private static final String ID_PK = "ID";
    private static final String NAME_ETIQUETA = "NAME_ETIQUETA";

    public etiquetasGastos() {
    }

    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getIdPk() {
        return ID_PK;
    }

    public static String getNameEtiqueta() {
        return NAME_ETIQUETA;
    }
}
