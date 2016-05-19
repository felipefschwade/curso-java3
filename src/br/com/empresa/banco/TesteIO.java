package br.com.empresa.banco;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteIO {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir); 
		String linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
	}
}
