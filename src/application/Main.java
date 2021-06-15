package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import domain.Professor;
import exception.MoreThan4LessThan1Exception;
import exception.NomeIncompletoException;
import exception.IndiceFronteiraException;
import exception.LimitePessoasException;
import domain.Pessoa;
import domain.Aluno;

public class Main{

	private static int tamanhoVetor = 2;
	private static Pessoa[] pessoas = new Pessoa[tamanhoVetor];
	private static int opcao;
	private static int index = 0;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("\t\tAplicativo de Controle Academico");
		
		do {
			
			try {
			cabecalho();
			opcao = sc.nextInt();
		
			System.out.println();
			
			if (opcao <1 || opcao >4) {
				throw new MoreThan4LessThan1Exception("Informe apenas numeros inteiros entre 1 e 4");
				
			}
			
			}catch(InputMismatchException e){
			
				System.err.println("\n\tNão é permitido inserir letras, informe apenas numeros inteiros de 1 a 4.");
				sc.nextLine();
				
			} catch (MoreThan4LessThan1Exception e) {
				System.err.println("\t" + e.getMessage());
			}
			
			finally {
				
				switch (opcao) {
				case 1:
					try {
						
						if (index >= tamanhoVetor) {
							throw new LimitePessoasException("\tNão é possível adicionar mais alunos ou professores, o sistema alcançou o limite de " + tamanhoVetor + " alunos e professores armazenados.");
						}
						adicionarAluno();
					
					}catch (NomeIncompletoException e){
						
						System.err.println(e.getMessage());
						
					}catch (LimitePessoasException e) {
						
						System.err.println(e.getMessage());
					}
						
					opcao = 0;
					
					break;
					
				case 2:
					try {
						if (index >= tamanhoVetor) {
							throw new LimitePessoasException("\tNão é possível adicionar mais alunos ou professores, o sistema alcançou o limite de " + tamanhoVetor + " alunos e professores armazenados.");
						}
						
						adicionarProfessor();
						
					}catch (NomeIncompletoException e) {
						
						System.err.println(e.getMessage());
						
					}catch (LimitePessoasException e) {
						
						System.err.println(e.getMessage());
					
					}
					opcao = 0;
						
					break;
					
				case 3:
					
					try {
						
						System.out.print("\tConsultar situação de um docente/discente (Id): ");	
						int idPessoa = sc.nextInt();
						
						if (index == 0 || idPessoa >= index) {
							throw new IndiceFronteiraException("Não existem pessoas salvas com o Id informado");
						}
						
						System.out.println();
						
						System.out.println(pessoas[idPessoa].consultarSituacao());	
							
					}catch (InputMismatchException e){
						
						System.err.println("\n\tNão é permitido inserir letras para um Id");
						sc.nextLine();
						
					}catch (IndiceFronteiraException e) {
						System.err.println("\n\t" + e.getMessage());  
					}
					
					opcao = 0;
					
					break;
					
				case 4: 
					
					System.out.println("\n\tPrograma Finalizado!!!");
					break;
					
				default:
					break;
				}
			
			}
			
		}while(opcao != 4);
	}
	
	public static void cabecalho() {
		
		System.out.println("");
		System.out.println("\t\t[1] Cadastrar aluno.");
		System.out.println("\t\t[2] Cadastrar professor.");
		System.out.println("\t\t[3] Consultar situação de um docente/discente.");
		System.out.println("\t\t[4] Sair.");
		System.out.println("");
		System.out.print("\tDigite uma das opções acima: ");
	}
	
	public static void adicionarAluno() throws NomeIncompletoException {
	
		
		System.out.print("\tDigite o nome do Aluno: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println();
		
		System.out.print("\tDigite o ensino (fundamental ou medio): ");
		String grauEscolar = sc.nextLine();
		
		System.out.println();
		
		System.out.print("\tDigite o Ano Escolar(1, 2, 3, 4...): ");
		String anoEscolar = sc.nextLine();
		
		System.out.println();
		
		Aluno aluno = new Aluno(index, nome, grauEscolar, anoEscolar); 
		
		pessoas[index] = aluno;
		
		System.out.println("\tO aluno "+ aluno.getFullName() + " foi registrado no ID: " + aluno.getId());
		
		index++;
			
	}
	
	public static void adicionarProfessor() throws NomeIncompletoException {
	
		System.out.print("\tDigite o nome do Professor: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println();
		
		System.out.print("\tDigite a matéria lecionada: ");
		String materia = sc.nextLine();
		
		Professor professor = new Professor(); 
		
		professor.setId(index);
		professor.setFullName(nome);
		professor.setMateria(materia);
		
		pessoas[index] = professor;
		
		System.out.println("\n\tO professor "+ professor.getFullName() + " foi registrado no ID: " 
							+ professor.getId());
		
		index++;
		
	}
	
}