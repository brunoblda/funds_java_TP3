package domain;

import java.util.Arrays;
import java.util.List;

import exception.NomeIncompletoException;

public class Pessoa {
	
	protected int id;
	protected String nome;
	protected String nomeDoMeio;
	protected String ultimoNome;
	
	public Pessoa() {
		super();
	}

	public Pessoa (int id, String nome) throws NomeIncompletoException {
		this.id = id;
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		if(posInicial == -1) {
			
			throw new NomeIncompletoException("\n\tO nome da pessoa precisa ter pelo menos 1 sobrenome.");
		}	
		
		this.nome = nome.substring(0, posInicial);
		this.nomeDoMeio = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();	
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFullName(String nomeFull) throws NomeIncompletoException {
		
		List<String> nomeSplit = Arrays.asList(nomeFull.split(" "));
		
		if(nomeSplit.size() < 2) {
			throw new NomeIncompletoException("\n\tO nome da pessoa precisa ter pelo menos 1 sobrenome.");
		}
		
		StringBuilder sb = new StringBuilder();
		
		if (nomeSplit.size() <= 2) {
			nome = nomeSplit.get(0);
			ultimoNome = nomeSplit.get(1);
			
		}else {
			
			nome = nomeSplit.get(0);
			ultimoNome = nomeSplit.get(nomeSplit.size() - 1);
			
			for (int i = 1; i < nomeSplit.size() - 1; i++) {
				
				sb.append(nomeSplit.get(i)+ " ");
			}
			
			nomeDoMeio = sb.toString().trim();
			
		}
		
	}
	
	public StringBuilder getFullName() {
		
		StringBuilder sb = new StringBuilder();
	
		if(nomeDoMeio == null || nomeDoMeio.isEmpty()) {
			sb.append(nome);
			sb.append(" ");
			sb.append(ultimoNome);
		}else {
			sb.append(nome);
			sb.append(" ");
			sb.append(nomeDoMeio);
			sb.append(" ");
			sb.append(ultimoNome);
		}
		
		return sb;
	}
	
	public StringBuilder consultarSituacao() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\t\tID: ");
		sb.append(id);
		sb.append(" Nome: ");
		sb.append(nome);
		
		return sb;
		
		
	}
	
}
