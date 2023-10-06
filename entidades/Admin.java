package entidades;


import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

import com.teste.mysql.attributeGen;

@Entity
@Table (name ="Admin")
public class Admin extends attributeGen{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_generator")
	@SequenceGenerator(name="admin_generator", sequenceName = "admin_seq", allocationSize=1)
	@Column(name="Admin_id")
	private Integer id;
	
	@ManyToOne(targetEntity=Centro.class)
	@JoinColumn(referencedColumnName = "Centro_id", name="Centro_id")
	private Centro centro;	
	
	
	@Column(name="Admin_nome")
	private String nome;
	
	@Column(name="Admin_sobrenome")
	private String sobrenome;
	
	@Column(name="Adimn_senha", nullable = false)
	private int senha;
	
	@Column(name="Adimn_matricula")
	private int matricula;
	
	@Column(name = "Admin_email")
    private String email;
	
	
	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    		
	public Admin() {
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
	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Admin(String nome, String sobrenome, int senha) {
		super();
		this.matricula = genMatricula();
		genEmail();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.senha = senha;
		
	}

	
	
}
