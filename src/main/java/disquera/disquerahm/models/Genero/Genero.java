package disquera.disquerahm.models.Genero;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GeneratedValue;

import disquera.disquerahm.models.Album.Album;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="generos")
public class Genero{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer idGenero;
    @NotEmpty
    @Column(length=50, nullable=false) 
        private String nombreGenero;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "genero", cascade = CascadeType.ALL)
        private List<Album> album;
    private boolean estadoGenero;
    public Genero(){
        album=new ArrayList<Album>();
    }
    public Genero(Integer idGenero,String nombreGenero,boolean estadoGenero){
        this.idGenero=idGenero;
        this.nombreGenero=nombreGenero;
        this.estadoGenero=estadoGenero;
    }
    public Integer getIdGenero() {
        return idGenero;
    }
    public void setIdGenero(Integer idGenero) {
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
    public List<Album> getAlbum() {
        return album;
    }
    public void setAlbum(List<Album> album) {
        this.album = album;
    }
}