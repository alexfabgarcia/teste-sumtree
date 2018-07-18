package br.com.s2it.teste.sumtree;

/**
 * Classe que representa um nós de uma árvore binária.
 * <br />A árvore não possui funções que realizem o seu balanceamento.
 */
public class BinaryTree {
	
	private int value;
	
	private BinaryTree left;
	
	private BinaryTree right;

	public BinaryTree(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
}
