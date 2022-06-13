package mx.uaemex.prueba.DB.objectsChanchito;

public class etiquetas {
    private String ID_PK ;
    private String NAME_ETIQUETA;

    public etiquetas() {
    }

    public etiquetas(String ID_PK, String NAME_ETIQUETA) {
        this.ID_PK = ID_PK;
        this.NAME_ETIQUETA = NAME_ETIQUETA;
    }

    public void setID_PK(String ID_PK) {
        this.ID_PK = ID_PK;
    }

    public void setNAME_ETIQUETA(String NAME_ETIQUETA) {
        this.NAME_ETIQUETA = NAME_ETIQUETA;
    }

    public String getID_PK() {
        return ID_PK;
    }

    public String getNAME_ETIQUETA() {
        return NAME_ETIQUETA;
    }
}
