package br.com.empresa.banco;

import java.util.TreeSet;

public class TestaTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree_set = new TreeSet<>();
		for (int i = 0; i < 1000; i++) {
			tree_set.add(i);
		}
		for (int i : tree_set.descendingSet()) {
			System.out.println(i);
		}
	}
}	
