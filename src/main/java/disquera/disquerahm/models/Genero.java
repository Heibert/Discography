package disquera.disquerahm.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="generos")
public class Genero{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idGenero;
    @Column(length=50, nullable=false)
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