package disquera.disquerahm.models.Disquera;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import disquera.disquerahm.models.Artista.Artista;

@Entity
@Table(name="disqueras")
public class Disquera {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idDisquera;
    @NotEmpty
    @Column(length = 50)
    private String nombreDisquera;
    @NotEmpty
    @Column (length = 50)
    private String telefonoDisquera;
    @NotEmpty
    @Column (length = 50)
    private String direccionDisquera;
    @NotEmpty
    @Column (length = 50)
    private String nitDisquera;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "disquera",  cascade = CascadeType.ALL)
    private List<Artista> artista;
    private boolean estadoDisquera;

    public Disquera(){
        artista=new ArrayList<Artista>();
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
