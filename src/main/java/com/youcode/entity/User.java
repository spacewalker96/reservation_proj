
package com.youcode.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name ="user_table")
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long idUser;
    @Column(name = "user_nom")
    private String nom;
    @Column(name = "user_prenom")
    private String prenom;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_password")
    private String password;
//    @OneToOne (mappedBy = "user")
//    private Admin admin;
//    @OneToOne (mappedBy = "user")
//    private Student student;

  /*  @ManyToOne
    @JoinColumn(name = "idRole")*/
    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="role_id")
    private Role role;
    
//    @OneToOne
//    @JoinColumn(name = "reservation_id")
//  private List<Reservation> reservations;

    @OneToMany(mappedBy = "user")
    private List<Reservation> reservation;



   

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	public User(Long idUser, String nom, String prenom, String email, String password, Role role) {
        this.idUser = idUser;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;

        this.role = role;
    }

    public User(String nom, String prenom, String email, String password, Role role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	
		this.role = role;
	}
    

	public User(String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		
	}

	public User() {

    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Admin getAdmin() {
//        return admin;
//    }
//
//    public void setAdmin(Admin admin) {
//        this.admin = admin;
//    }
//
//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
