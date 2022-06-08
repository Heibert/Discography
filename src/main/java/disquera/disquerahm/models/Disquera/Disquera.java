package disquera.disquerahm.models.Disquera;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="disqueras")
public class Disquera {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idDisquera;
    @NotEmpty
    @Column(length = 50,nullable = false)
    private String nombreDisquera;
    @NotEmpty
    @Column (length = 50, nullable = false)
    private String telefonoDisquera;
    @NotEmpty
    @Column (length = 50, nullable = false)
    private String direccionDisquera;
    @NotEmpty
    @Column (length = 50, nullable = false)
    private String nitDisquera;

    private boolean estadoDisquera;

    public Disquera(){
        
    }
    public Disquera(Integer idDisquera,String nombreDisquera,boolean estadoDisquera){
        this.idDisquera=idDisquera;
        this.nombreDisquera=nombreDisquera;
        this.estadoDisquera=estadoDisquera;
    }
    public Integer getIdDisquera() {
        return idDisquera;
    }
    public void setIdDisquera(Integer idDisquera) {
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
