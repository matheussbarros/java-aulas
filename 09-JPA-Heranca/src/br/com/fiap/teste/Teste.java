package br.com.fiap.teste;

import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.impl.VeiculoDAOImpl;
import br.com.fiap.entity.Barco;
import br.com.fiap.entity.Carro;
import br.com.fiap.entity.TipoBarco;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Teste {

	
	
	private static VeiculoDAO dao;
	
	@BeforeAll
	public static void init() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new VeiculoDAOImpl(em);
	}
	
	
	@Test
	void cadastroTest() {
		
		Veiculo veiculo = new Veiculo(300,"CG");
		Carro carro = new Carro(200, "Veloster", 3, 17);
		Barco barco = new Barco(200, "titanic", 2.6, TipoBarco.CANOA);
		
		try {
			dao.cadastrar(barco);
			dao.cadastrar(carro);
			dao.cadastrar(veiculo);
			dao.commit();
			
		}catch(CommitException e) {
			
			fail("Not yet implemented");
			e.printStackTrace();
			
			
		}
		
		
		
	}

}
