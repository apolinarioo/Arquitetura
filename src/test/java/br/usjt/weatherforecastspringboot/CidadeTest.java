package br.usjt.weatherforecastspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.weatherforecastspringboot.model.Cidade;
import br.usjt.weatherforecastspringboot.model.repository.CidadeRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class CidadeTest {
	
	@Autowired
	private CidadeRepository repo;
	
	private String msgErro = "Cidade não encontrada";
	
	@Test
	public void findByLatitudeAndLongitudeTest() {
		Cidade cidade = repo.findByLatitudeAndLongitude("", "");
		System.out.println(cidade != null ? cidade.toString() : msgErro);
	}
	
	@Test
	public void findByNomeTest() {
		Cidade cidade = repo.findByNome("São Paulo");
		System.out.println(cidade != null ? cidade.toString() : msgErro);
	}
	
	@Test
	public void findByNomeIgnoreCaseTest() {
		Cidade cidade = repo.findByNomeIgnoreCase("SÃO PAULO");
		System.out.println(cidade != null ? cidade.toString() : msgErro);
	}
	
}