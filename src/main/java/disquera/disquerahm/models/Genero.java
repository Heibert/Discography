package disquera.disquerahm.models;

public class Genero{
    private int idGenero;
    private String nombreGenero;
    private boolean estadoGenero;
    public Genero(){
        
    }
    public Genero(int idGenero,String nombreGenero,boolean estadoGenero){
        this.idGenero=idGenero;
        this.nombreGenero=nombreGenero;
        this.estadoGenero=estadoGenero;
    }
    public int getIdGenero() {
        return idGenero;
    }
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }
    public String getNombreGenero() {
        return nombreGenero;
    }
    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }
    public boolean getEstadoGenero() {
        return estadoGenero;
    }
    public void setEstadoGenero(boolean estadoGenero) {
        this.estadoGenero = estadoGenero;
    }
}