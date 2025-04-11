package br.com.vicente.contador;

import br.com.vicente.contador.model.Tarefa;
import br.com.vicente.contador.model.TarefaRecord;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número para nosso contador: ");
		int numero = input.nextInt();


		int i = 1;

		while (i != (numero + 1)){
			System.out.print(i + " ");
			i += 1;
		}

		// exercicio 2;
		System.out.println();


		ObjectMapper mapper = new ObjectMapper();

		Tarefa tarefa1 = new Tarefa("Jantar", true, "Sarah");

		File arquivo =  new File("src/main/java/br/com/vicente/contador/arquivo/tarefa.json");

		mapper.writerWithDefaultPrettyPrinter().writeValue(arquivo, tarefa1);





		TarefaRecord tarefaRecord = mapper.readValue(arquivo, TarefaRecord.class);

		Tarefa tarefa2 = new Tarefa(tarefaRecord);


		System.out.println(tarefa2.toString());


	}

}
