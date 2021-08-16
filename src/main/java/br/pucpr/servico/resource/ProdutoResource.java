package br.pucpr.servico.resource;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucpr.servico.entity.Produto;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

	@GetMapping("/produto/{id}")
	public Produto consultaPorID(@PathVariable("id") int id) {
		Produto p = new Produto();

		p.setId(id);
		p.setAnoFabricacao(2021);
		p.setNome("Produto 1");
		p.setEan("Teste");
		return p;
	}
	
	@GetMapping
	public Collection<Produto> consulta() {
		Produto p = new Produto();
		
		p.setId(1);
		p.setAnoFabricacao(2021);
		p.setNome("Produto 1");
		p.setEan("Teste");

		Produto p2 = new Produto();
		
		p2.setId(2);
		p2.setAnoFabricacao(2021);
		p2.setNome("Produto 2");
		p2.setEan("Teste 2");
		
		Collection<Produto> produtos = new ArrayList<>();
		produtos.add(p);
		produtos.add(p2);
		return produtos;
	}
	
	@PostMapping
	public Produto incluir(@RequestBody Produto produto){
	    return produto;

	}
	
    @DeleteMapping("/produto/{id}")
    public String deletar(@PathVariable("id") Long id){
        return "Produto "+id+" deletado.";
    }

    @PutMapping
    public Produto alterar(Produto produto){
    	return produto;
    }
}
