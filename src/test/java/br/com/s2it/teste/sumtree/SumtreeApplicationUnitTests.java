package br.com.s2it.teste.sumtree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class SumtreeApplicationUnitTests {
	
	private SumtreeApplication sumtreeApplication;
	
	@Before
	public void setup() {
		sumtreeApplication = new SumtreeApplication();
	}

	@Test
	public void somaDeArvoreVaziaDeveRetonarZero() {
		int soma = sumtreeApplication.somarNosSubsequentes(null);
		
		assertNotNull(soma);
		assertEquals("A soma de um nó null deve ser zero.", 0, soma);
	}

	@Test
	public void somaDeNoSemFilhosDeveRetornarSeuProprioValor() {
		int soma = sumtreeApplication.somarNosSubsequentes(new BinaryTree(10));
		
		assertNotNull(soma);
		assertEquals("A soma de um nó null deve ser zero.", 10, soma);
	}

	@Test
	public void somaDeComFilhosDeveRetornarSeuProprioValorMaisOsValoresDeSeusSucessores() {
		
		// Para simplificar o teste do método de soma de valores subsequentes, a inserção de nós não é balanceada
		BinaryTree root = new BinaryTree(10);
		
		BinaryTree leftTree = new BinaryTree(5);
		leftTree.setLeft(new BinaryTree(2));
		leftTree.setRight(new BinaryTree(8));
		
		root.setLeft(leftTree);
		root.setRight(new BinaryTree(20));
		
		int soma = sumtreeApplication.somarNosSubsequentes(root);
		
		assertNotNull(soma);
		assertEquals("A soma deve conter o valor do nó pai mais os seus subsequentes, ou seja, 10 + 5 + 2 + 8 + 20 = 45.", 45, soma);
	}
	

}
