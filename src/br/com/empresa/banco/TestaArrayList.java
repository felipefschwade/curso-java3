package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaArrayList {
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			array.add(i);	
		}
		Collections.reverse(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
}	
