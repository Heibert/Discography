package disquera.disquerahm.models.Artista;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import disquera.disquerahm.models.Album.Album;
import disquera.disquerahm.models.Disquera.Disquera;

@Entity
@Table
public class Artista {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idArtista;
    @NotEmpty
    @Column
    private String numeroArtista;
    @NotEmpty
    @Column
    private String tipoDocumentoArtista;
    @NotEmpty
    @Column
    private String nombreArtista;
    @NotEmpty
    @Column
    private String apellidoArtista;
    @NotEmpty
    @Column
    private String nombreArtistico;
    @Temporal(TemporalType.DATE)
    private Date feNacimientoArtista;
    @NotEmpty
    @Column
    private String emailArtista;
    /* @NotEmpty
    @Column
    Aqui van las relaciones que no sé hacer */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "artista",  cascade = CascadeType.ALL)
    private List<Album> album;
    @ManyToOne(fetch = FetchType.LAZY)
    private Disquera disquera;
    public Artista(){
        album=new ArrayList<Album>();
    }
    public Integer getIdArtista() {
        return idArtista;
    }
    public void setIdArtista(Integer idArtista) {
        this.idArtista = idArtista;
    }
    public String getNumeroArtista() {
        return numeroArtista;
    }
    public void setNumeroArtista(String numeroArtista) {
        this.numeroArtista = numeroArtista;
    }
    public String getTipoDocumentoArtista() {
        return tipoDocumentoArtista;
    }
    public void setTipoDocumentoArtista(String tipoDocumentoArtista) {
        this.tipoDocumentoArtista = tipoDocumentoArtista;
    }
    public String getNombreArtista() {
        return nombreArtista;
    }
    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }
    public String getApellidoArtista() {
        return apellidoArtista;
    }
    public void setApellidoArtista(String apellidoArtista) {
        this.apellidoArtista = apellidoArtista;
    }
    public String getNombreArtistico() {
        return nombreArtistico;
    }
    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }
    public Date getFeNacimientoArtista() {
        return feNacimientoArtista;
    }
    public void setFeNacimientoArtista(Date feNacimientoArtista) {
        this.feNacimientoArtista = feNacimientoArtista;
    }
    public String getEmailArtista() {
        return emailArtista;
    }
    public void setEmailArtista(String emailArtista) {
        this.emailArtista = emailArtista;
    }
    public List<Album> getAlbum() {
        return album;
    }
    public void setAlbum(List<Album> album) {
        this.album = album;
    }
    public Disquera getDisquera() {
        return disquera;
    }
    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }
}
