package br.com.empresa.banco;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TesteIO {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner sc = new Scanner(is);
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
		}
		sc.close();
	}
}
