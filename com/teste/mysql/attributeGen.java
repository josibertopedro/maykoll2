package com.teste.mysql;

import java.util.Calendar;

public abstract class attributeGen {

	private String nome;
	private String sobrenome;
	private String email;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	public void genEmail() {
		String email = getNome() + getSobrenome() + ("@edu.unifor.br");
		setEmail(email);
	}
	
	public Integer genMatricula() {
		Integer matricula = Calendar.getInstance().get(Calendar.YEAR);
		matricula %= 100;
		
		String ano = matricula.toString();
		String semestre = "";
		
		if (Calendar.getInstance().get(Calendar.MONTH) >= 1 && Calendar.getInstance().get(Calendar.MONTH) <= 6) {
			semestre = "1";
		}else semestre = "2";
		
		
		ano += semestre;
		
		Integer seg = Calendar.getInstance().get(Calendar.SECOND);
		int miliSeg = Calendar.getInstance().get(Calendar.MILLISECOND)/10;
		ano += ano.format("%02d", seg) + ano.format("%02d", miliSeg);
		matricula = matricula.parseInt(ano);
		return matricula;
	}
}
