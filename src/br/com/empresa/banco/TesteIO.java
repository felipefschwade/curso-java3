package br.com.empresa.banco;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteIO {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		OutputStream os = new FileOutputStream("escrita.txt");
		PrintStream ps = new PrintStream(os);
		Scanner sc = new Scanner(is);
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			ps.println(linha);
		}
		sc.close();
		ps.close();
	}
}
