package mx.uaemex.prueba.DB.objectsChanchito;

public class gastos {
    private String ID_PK;
    private String ID_ETIQUETA;
    private long DATE_GASTO;
    private String MONTO;

    public gastos() {
    }

    public gastos(String ID_PK, String ID_ETIQUETA, long DATE_GASTO, String MONTO) {
        this.ID_PK = ID_PK;
        this.ID_ETIQUETA = ID_ETIQUETA;
        this.DATE_GASTO = DATE_GASTO;
        this.MONTO = MONTO;
    }

    public long getDATE_GASTO() {
        return DATE_GASTO;
    }

    public void setDATE_GASTO(long DATE_GASTO) {
        this.DATE_GASTO = DATE_GASTO;
    }

    public String getID_PK() {
        return ID_PK;
    }

    public String getID_ETIQUETA() {
        return ID_ETIQUETA;
    }

    public String getMONTO() {
        return MONTO;
    }

    public void setID_PK(String ID_PK) {
        this.ID_PK = ID_PK;
    }

    public void setID_ETIQUETA(String ID_ETIQUETA) {
        this.ID_ETIQUETA = ID_ETIQUETA;
    }

    public void setMONTO(String MONTO) {
        this.MONTO = MONTO;
    }

}
