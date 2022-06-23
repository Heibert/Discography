package disquera.disquerahm.models.Cancion;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GenerationType;

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
    @NotEmpty
    @Column
    private String estadoCancion;
}
