package views;

import views.agendamento.AgendarTreino;
import views.agendamento.ListarAgendamento;
import views.cliente.CadastrarCliente;
import views.cliente.ListarCliente;
import views.cliente.ProcurarCliente;
import models.Exercicio;
import utils.Console;
import controllers.ExercicioController;
import views.exercicio.ListarExercicio;
import views.exercicio.ProcurarExercicio;
import views.instrutor.CadastrarInstrutor;
import views.instrutor.ListarInstrutor;
import views.treino.ListarTreino;
import views.treino.MontarTreino;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		inicializarExercicios();
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n== Academia Jedai ==\n");
			System.out.println("11 - Cadastrar Cliente");
			System.out.println("12 - Listar Cliente");
			System.out.println("13 - Procurar Cliente");

			System.out.println("21 - Cadastrar Intrutor");
			System.out.println("22 - Listar Intrutor");

			System.out.println("31 - Montar Treino");
			System.out.println("32 - Listar Treinos");

			System.out.println("41 - Fazer Agendamento");
			System.out.println("42 - Listar Agendamentos");

//			System.out.println("51 - Cadastrar Exercicio");
			System.out.println("52 - Listar Exercicios");
			System.out.println("53 - Procurar Exercicio");


			System.out.println("0 - Sair");
			

			opcao = Console.lerInteiro("\nDigite a op��o desejada:");

			switch (opcao) {
				case 11:
					CadastrarCliente.renderizar();
					break;
				case 12:
					ListarCliente.renderizar();
					break;
				case 13:
					ProcurarCliente.renderizar();
					break;
				case 21:
					CadastrarInstrutor.renderizar();
					break;
				case 22:
					ListarInstrutor.renderizar();
					break;
				case 31:
					MontarTreino.renderizar();
					break;
				case 32:
					ListarTreino.renderizar();
					break;
				case 41:
					AgendarTreino.renderizar();
					break;
				case 42:
					ListarAgendamento.renderizar();
					break;		
				case 52:
					ListarExercicio.renderizar();
					break;
				case 53:
					ProcurarExercicio.renderizar();
					break;
				default:

					break;
			}
		} while (opcao != 0);

		sc.close();
	}

	private static void inicializarExercicios() {
		Exercicio exercicio;
		try {
			exercicio = new Exercicio();
			exercicio.setAtividade("Supino");
			exercicio.setRepeticoes(15);
			exercicio.setSeries(3);
			ExercicioController.cadastrar(exercicio);

			exercicio = new Exercicio();
			exercicio.setAtividade("Leg Press");
			exercicio.setRepeticoes(10);
			exercicio.setSeries(4);
			ExercicioController.cadastrar(exercicio);

			exercicio = new Exercicio();
			exercicio.setAtividade("Rosca direta");
			exercicio.setRepeticoes(20);
			exercicio.setSeries(5);
			ExercicioController.cadastrar(exercicio);
		} catch (Exception e) {
			// Neste ponto nÃ£o hÃ¡ nada a fazer jÃ¡ que nÃ£o
			// ocorrerÃ¡ nenhum erro de exercicio duplicado
		}
	}
}
