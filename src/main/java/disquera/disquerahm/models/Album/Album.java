package disquera.disquerahm.models.Album;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

import disquera.disquerahm.models.Artista.Artista;
import disquera.disquerahm.models.Cancion.Cancion;
import disquera.disquerahm.models.Genero.Genero;

@Entity
@Table(name="Album")
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer idAlbum;
    @NotEmpty
    @Column(length = 50,nullable = false)
        private String nombreAlbum;
    @Temporal(TemporalType.DATE)
    private Date anoPublicacionAlbum;
    @PrePersist
        public void prePersist(){
        anoPublicacionAlbum=new Date();
        }
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
        private Genero genero;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "album",  cascade = CascadeType.ALL)
        private List<Cancion> cancion;
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
        private Artista artista;
    private boolean estadoAlbum;
    
    public Album(){
        cancion=new ArrayList<Cancion>();
    }
    public Album(Integer idAlbum,String nombreAlbum,boolean estadoAlbum, Genero genero){
        this.idAlbum=idAlbum;
        this.nombreAlbum=nombreAlbum;
        this.estadoAlbum=estadoAlbum;
        this.genero=genero;
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
    public Date getAnoPublicacionAlbum() {
        return anoPublicacionAlbum;
    }
    public void setAnoPublicacionAlbum(Date anoPublicacionAlbum) {
        this.anoPublicacionAlbum = anoPublicacionAlbum;
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
    public List<Cancion> getCancion() {
        return cancion;
    }
    public void setCancion(List<Cancion> cancion) {
        this.cancion = cancion;
    }
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
