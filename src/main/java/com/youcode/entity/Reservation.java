package com.youcode.entity;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "reservation_table")
public class Reservation implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private long idReservation;
    @Column(name = "nombre_place")
    private int nombrePlace;
    @Column(name = "type_reservation")
    private String typeReservation;
    private boolean confirmation = false;
    
    
    @OneToMany(mappedBy = "reservation")
    private Collection<NbrPlace> nbrPlacetablesByIdReservation;

	public Reservation(int nombrePlace, String typeReservation, Date dateReservation, User user) {
		super();
		this.nombrePlace = nombrePlace;
		this.typeReservation = typeReservation;
		this.dateReservation = dateReservation;
		this.user = user;
	}

public Collection<NbrPlace> getNbrPlacetablesByIdReservation() {
		return nbrPlacetablesByIdReservation;
	}

	public void setNbrPlacetablesByIdReservation(Collection<NbrPlace> nbrPlacetablesByIdReservation) {
		this.nbrPlacetablesByIdReservation = nbrPlacetablesByIdReservation;
	}

	//	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	@Column(name = "date_reservation")
    private Date dateReservation;

	
	public Reservation(int nombrePlace, String typeReservation, Date dateReservation) {
		super();
		this.nombrePlace = nombrePlace;
		this.typeReservation = typeReservation;
		this.dateReservation = dateReservation;
	}

//	@OneToOne
//    @JoinColumn(name = "id_user")
	 @ManyToOne
	@JoinColumn(name = "id_user")
    private User user;

    public long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}

	public int getNombrePlace() {
		return nombrePlace;
	}

	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	public String getTypeReservation() {
		return typeReservation;
	}

	public void setTypeReservation(String typeReservation) {
		this.typeReservation = typeReservation;
	}

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    
    public Reservation() {
    }

	

	public Reservation(int nombrePlace, Date dateReservation) {
		super();
		this.nombrePlace = nombrePlace;
		this.dateReservation = dateReservation;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
    
}
