package disquera.disquerahm.models.Cancion;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.FetchType;
import disquera.disquerahm.models.Album.Album;

@Entity
@Table
public class Cancion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idDisquera;
    @NotEmpty
    @Column
    private String nombreCancion;
    @Temporal(TemporalType.DATE)
    @Column
    private Date fechaGrabacion;
    @NotEmpty
    @Column
    private String duracionCancion;
    @ManyToOne(fetch = FetchType.LAZY)
    private Album album;
    @NotEmpty
    @Column
    private String estadoCancion;
    public Cancion(){

    }
    public Integer getIdDisquera() {
        return idDisquera;
    }
    public void setIdDisquera(Integer idDisquera) {
        this.idDisquera = idDisquera;
    }
    public String getNombreCancion() {
        return nombreCancion;
    }
    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }
    public Date getFechaGrabacion() {
        return fechaGrabacion;
    }
    public void setFechaGrabacion(Date fechaGrabacion) {
        this.fechaGrabacion = fechaGrabacion;
    }
    public String getDuracionCancion() {
        return duracionCancion;
    }
    public void setDuracionCancion(String duracionCancion) {
        this.duracionCancion = duracionCancion;
    }
    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }
    public String getEstadoCancion() {
        return estadoCancion;
    }
    public void setEstadoCancion(String estadoCancion) {
        this.estadoCancion = estadoCancion;
    }
}
