package disquera.disquerahm.models;

public class Disquera {
    private int idDisquera;
    private String nombreDisquera;
    private boolean estadoDisquera;
    private String telefonoDisquera;
    private String direccionDisquera;
    private String nitDisquera;

    public Disquera(){
        
    }
    public Disquera(int idDisquera,String nombreDisquera,boolean estadoDisquera){
        this.idDisquera=idDisquera;
        this.nombreDisquera=nombreDisquera;
        this.estadoDisquera=estadoDisquera;
    }
    public int getIdDisquera() {
        return idDisquera;
    }
    public void setIdDisquera(int idDisquera) {
        this.idDisquera = idDisquera;
    }
    public String getNombreDisquera() {
        return nombreDisquera;
    }
    public void setNombreDisquera(String nombreDisquera) {
        this.nombreDisquera = nombreDisquera;
    }
    public boolean getEstadoDisquera() {
        return estadoDisquera;
    }
    public void setEstadoDisquera(boolean estadoDisquera) {
        this.estadoDisquera = estadoDisquera;
    }
    public String getNitDisquera() {
        return nitDisquera;
    }
    public void setNitDisquera(String nitDisquera) {
        this.nitDisquera = nitDisquera;
    }
    public String getTelefonoDisquera() {
        return telefonoDisquera;
    }
    public void setTelefonoDisquera(String telefonoDisquera) {
        this.telefonoDisquera = telefonoDisquera;
    }
    public String getDireccionDisquera() {
        return direccionDisquera;
    }
    public void setDireccionDisquera(String direccionDisquera) {
        this.direccionDisquera = direccionDisquera;
    }
}
