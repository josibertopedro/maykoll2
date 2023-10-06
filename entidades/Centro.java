package entidades;

import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;


@Entity
@Table(name="Centro")
public class Centro {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Centro_generator")
	@SequenceGenerator(name="Centro_generator", sequenceName = "Centro_seq", allocationSize=1)
	@Column(name="Centro_id")
	private Integer id;
	
	@Column(name="Centro_nome",nullable=false)
	private String nome;
	
	@OneToMany(targetEntity=Admin.class)
	@JoinColumn(referencedColumnName = "Admin_id", name="Admin_id")
	private List<Admin> admins = new ArrayList<Admin>();	
	
	

}
