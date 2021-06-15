package domain;

import exception.NomeIncompletoException;

public class Professor extends Pessoa{

	private String materia;
	
	
	public Professor() {
		super();
	}

	public Professor(int id, String nome, String materia) throws NomeIncompletoException {
		super(id, nome);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public StringBuilder consultarSituacao() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\t\tID: ");
		sb.append(id);
		sb.append(" Professor: ");
		sb.append(getFullName());
		sb.append(" Leciona a matéria: ");
		sb.append(materia);
		
		return sb;
	}
	
}
