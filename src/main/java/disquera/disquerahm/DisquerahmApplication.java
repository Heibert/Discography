package disquera.disquerahm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DisquerahmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisquerahmApplication.class, args);
	}

}
//Tenia un problema a la hora de montar la BD tuve que borrar un archivo llamado "ServletInitializer"
//Este era su contenido

/*package disquera.disquerahm;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DisquerahmApplication.class);
	}
}
 */