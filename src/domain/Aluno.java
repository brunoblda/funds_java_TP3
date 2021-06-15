package domain;

import exception.NomeIncompletoException;

public class Aluno extends Pessoa{
	
	private String grauEscolar;
	private String anoEscolar;
	
	public Aluno() {
		super();
	}

	public Aluno(int id, String nome, String grauEscolar, String anoEscolar) throws NomeIncompletoException {
		
		super(id, nome);
		
		this.grauEscolar = grauEscolar;
		this.anoEscolar = anoEscolar;
	}

	public String getGrauEscolar() {
		return grauEscolar;
	}

	public void setGrauEscolar(String grauEscolar) {
		this.grauEscolar = grauEscolar;
	}

	public String getAnoEscolar() {
		return anoEscolar;
	}

	public void setAnoEscolar(String anoEscolar) {
		this.anoEscolar = anoEscolar;
	}
	
	@Override
	public StringBuilder consultarSituacao() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\t\tID: ");
		sb.append(id);
		sb.append(" Aluno: ");
		sb.append(getFullName());
		sb.append(" Ensino: ");
		sb.append(grauEscolar);
		sb.append(" Ano: ");
		sb.append(anoEscolar);
		
		return sb;
	}
		
}
	
