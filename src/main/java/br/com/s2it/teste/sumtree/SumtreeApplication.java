package br.com.s2it.teste.sumtree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumtreeApplication{

	public static void main(String[] args) {
		SpringApplication.run(SumtreeApplication.class, args);
	}
	
	public int somarNosSubsequentes(BinaryTree tree) {
		if (tree == null) {
			return 0;
		}
		return tree.getValue() + somarNosSubsequentes(tree.getLeft()) + somarNosSubsequentes(tree.getRight());
	}
}
