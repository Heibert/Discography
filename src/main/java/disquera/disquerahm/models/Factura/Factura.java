package disquera.disquerahm.models.Factura;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;

import disquera.disquerahm.models.Genero.Genero;

@Entity
@Table
public class Factura {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer idFactura;
    @Temporal(TemporalType.DATE)
        private Date fecha;
    @ManyToOne(fetch = FetchType.LAZY)
        private Genero genero;
    //Accesores
    public Integer getIdFactura() {
        return idFactura;
    }
    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
