package net.certus.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.certus.model.Vacantes;

@Controller
public class HomeController {
	@GetMapping("/")
	public String mostrarTabla(Model model) {
		List<Vacantes> lista = getVacantes();
		model.addAttribute("vacantes", lista);
		
		return "tabla";
	}
	
	
	
	
	
	/* Medoto para regresar una lista de objetos de tipo vacante
	 * @return */
	private List<Vacantes> getVacantes(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Vacantes> lista = new LinkedList<Vacantes>();
		try {
			//creamos la oferta de trabajo1
			Vacantes vacante1 = new Vacantes();
			
			vacante1.setId(1);
			vacante1.setNombre("Estilista canino");
			vacante1.setDescripcion("Se solicita estilista canino para baños, corte de pelo , corte de uñas y cuidado del pelaje");
			vacante1.setFecha(sdf.parse("08-08-2023"));
			vacante1.setSalario(8700.0);
			//agrefamos la propiedad destacado
			vacante1.setDestacado(1);
			vacante1.setImagen("veterinaria1.png");
			
			//creamos la oferta de trabajo2
			Vacantes vacante2 = new Vacantes();
			
			vacante2.setId(2);
			vacante2.setNombre("Estilista felino");
			vacante2.setDescripcion("Se solicita estilista felino para baños, corte de pelo , corte de uñas y cuidado del pelaje");
			vacante2.setFecha(sdf.parse("09-08-2023"));
			vacante2.setSalario(12700.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("veterinaria2.png");
			
			//creamos la oferta de trabajo3
			Vacantes vacante3 = new Vacantes();
			
			vacante3.setId(3);
			vacante3.setNombre("Medico veterinario");
			vacante3.setDescripcion("Se solicita veterinario para diagnostico, cirugia y tratamiento");
			vacante3.setFecha(sdf.parse("10-02-2023"));
			vacante3.setSalario(10500.0);
			vacante3.setDestacado(0);
			
			//creamos la oferta de trabajo4
			Vacantes vacante4 = new Vacantes();
			
			vacante4.setId(4);
			vacante4.setNombre("Recepcionista");
			vacante4.setDescripcion("Se solicita diseñador grafico para diseñar publicidad de la empresa");
			vacante4.setFecha(sdf.parse("10-02-2023"));
			vacante4.setSalario(12800.0);
			vacante4.setDestacado(1);
			vacante4.setImagen("veterinaria4.png");
			
			/* agregamos 4 objetos detipo vacante a la lista*/
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
			
		}catch (ParseException e) {
			System.out.print("Error: "+ e.getMessage());
		}
		return lista;
	}
	
}
