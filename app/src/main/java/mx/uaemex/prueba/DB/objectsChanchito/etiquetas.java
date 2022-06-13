package mx.uaemex.prueba.DB.objectsChanchito;

public class etiquetas {
    private int ID_PK ;
    private String NAME_ETIQUETA;

    public etiquetas() {
    }


    public etiquetas(int ID_PK, String NAME_ETIQUETA) {
        this.ID_PK = ID_PK;
        this.NAME_ETIQUETA = NAME_ETIQUETA;
    }

    public int getID_PK() {
        return ID_PK;
    }

    public void setID_PK(int ID_PK) {
        this.ID_PK = ID_PK;
    }

    public void setNAME_ETIQUETA(String NAME_ETIQUETA) {
        this.NAME_ETIQUETA = NAME_ETIQUETA;
    }



    public String getNAME_ETIQUETA() {
        return NAME_ETIQUETA;
    }
}
