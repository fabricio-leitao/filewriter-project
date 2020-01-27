package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		//Criando um vetor de string com os valores já incluidos
		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night"};
		
		//string com o caminho
		String path = "C:\\Users\\Beco\\eclipse-workspace\\filewriter-project\\out.txt";
		
		//try with resources
		//BufferedWriter e File Writer para a criação de um arquivo caso não exista
		//usando um segundo parametro em FileWriter apenas adiciona texto abaixo do já existente no arquivo sem apagar o anterior
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			//para cada linha contida em linhas faça
			for(String line : lines) {
				//escrever linha por linha
				bw.write(line);
				//escreve na proxima linha
				bw.newLine();
			}
		} catch (IOException e) {
			//captura de exceção
			e.printStackTrace();
		}
	}

}
