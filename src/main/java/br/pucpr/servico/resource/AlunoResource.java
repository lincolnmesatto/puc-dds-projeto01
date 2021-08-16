package br.pucpr.servico.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucpr.servico.entity.Aluno;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {

//	@GetMapping("/consulta")
//	public String consulta() {
//		return "Chamando endpoint de consulta";
//	}
//
//	@PostMapping
//	public String incluir(String nome) {
//		return "Incluindo um nome";
//	}
	
	@GetMapping("/consulta/{id}")
	public Aluno consulta(@PathVariable("id") int id) {
		Aluno a = new Aluno();

		a.setId(id);
		a.setNome("Lincoln");
		a.setMatricula("1234");
		return a;
	}
	
	@PostMapping
	public Aluno incluir(@RequestBody Aluno aluno){
	    return aluno;

	}
}
