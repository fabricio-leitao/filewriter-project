package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		//Criando um vetor de string com os valores j� incluidos
		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night"};
		
		//string com o caminho
		String path = "C:\\Users\\Beco\\eclipse-workspace\\filewriter-project\\out.txt";
		
		//try with resources
		//BufferedWriter e File Writer para a cria��o de um arquivo caso n�o exista
		//usando um segundo parametro em FileWriter apenas adiciona texto abaixo do j� existente no arquivo sem apagar o anterior
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			//para cada linha contida em linhas fa�a
			for(String line : lines) {
				//escrever linha por linha
				bw.write(line);
				//escreve na proxima linha
				bw.newLine();
			}
		} catch (IOException e) {
			//captura de exce��o
			e.printStackTrace();
		}
	}

}
