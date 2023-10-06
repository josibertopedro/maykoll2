package entidades;


import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Calendar;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.teste.mysql.attributeGen;

import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
@Table (name ="Aluno")
public class Aluno extends attributeGen{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Aluno_generator")
	@SequenceGenerator(name="Aluno_generator", sequenceName = "Aluno_seq", allocationSize=1)
	@Column(name="Aluno_id")
	private Integer id;
	
	@Column(name="Aluno_nome")
	private String nome;
	
	@Column(name="Aluno_sobrenome")
	private String sobrenome;
	
	@Column(name="Aluno_senha", nullable = false)
	private int senha;
	
	@Column(name="Aluno_matricula")
	private int matricula;
	
	@Column(name = "Aluno_email")
    private String email;
	
	
	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    		
	public Aluno() {
		this.matricula = genMatricula();
		//this.email = genEmail( this.nome, this.sobrenome);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	public void setsobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getMatricula() {		
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Aluno(String nome, String sobrenome, int senha) {
		super();
		this.matricula = genMatricula();
		genEmail();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.senha = senha;
		
	}

	
	
}
