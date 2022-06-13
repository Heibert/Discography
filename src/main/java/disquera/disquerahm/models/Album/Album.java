package disquera.disquerahm.models.Album;

import disquera.disquerahm.models.Genero.Genero;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import javax.persistence.GeneratedValue;

@Entity
@Table(name="Album")
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer idAlbum;
    @NotEmpty
    @Column(length = 50,nullable = false)
        private String nombreAlbum;
    @NotEmpty
        private String anoAlbum;
        //Album == DetalleFactura
    @ManyToOne(fetch = FetchType.LAZY)
        private Genero genero;
    private boolean estadoAlbum;
    
    public Album(){

    }
    public Album(Integer idAlbum,String nombreAlbum,boolean estadoAlbum){
        this.idAlbum=idAlbum;
        this.nombreAlbum=nombreAlbum;
        this.estadoAlbum=estadoAlbum;
    }
    public Integer getIdAlbum() {
        return idAlbum;
    }
    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }
    public String getNombreAlbum() {
        return nombreAlbum;
    }
    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }
    public String getAnoAlbum() {
        return anoAlbum;
    }
    public void setanoAlbum(String anoAlbum) {
        this.anoAlbum = anoAlbum;
    }
    public boolean getEstadoAlbum() {
        return estadoAlbum;
    }
    public void setEstadoAlbum(boolean estadoAlbum) {
        this.estadoAlbum = estadoAlbum;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
}
