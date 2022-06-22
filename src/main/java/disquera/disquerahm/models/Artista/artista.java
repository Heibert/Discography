package disquera.disquerahm.models.Artista;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table
public class artista {
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
    @NotEmpty
    @Column
    private Date feNacimientoArtista;
    @NotEmpty
    @Column
    private Email emailArtista;
    /* @NotEmpty
    @Column
    Aqui van las relaciones que no sé hacer */
}
