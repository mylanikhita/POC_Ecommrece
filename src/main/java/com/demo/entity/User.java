package com.demo.entity;

//import java.util.Set;
//
//import javax.management.loading.PrivateClassLoader;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

//import com.demo.repository.UserRepository;



@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(nullable = false,unique = true,length = 45)
    private String email;
	@Column(nullable = false,length = 20)
    private String firstName;
	@Column(nullable = false,length = 20)
    private String lastName;
	@Column(nullable = false,length = 64)
    private String password;
	
	
	public User() {
		
	}

	 public User(long id, String email, String firstName, String lastName, String password) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password= password;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	




	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + "]";
	}








//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "users_watches",
//        joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//        inverseJoinColumns = @JoinColumn(name = "watch_id", referencedColumnName = "id"))
//    private Set<Watches>watches;
	
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//  @JoinTable(name = "users_mobiles",
//      joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//      inverseJoinColumns = @JoinColumn(name = "mobiles_id", referencedColumnName = "id"))
//  private Set<Mobiles>mobiles;
	
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//  @JoinTable(name = "users_computers",
//      joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//      inverseJoinColumns = @JoinColumn(name = "computers_id", referencedColumnName = "id"))
//  private Set<Computers>computers;
	
	


	}



	
	   


