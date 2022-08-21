/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package whee.demo.entity;

import java.io.Serializable;


import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compte implements Serializable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private Long idCompte;
	
	@Column(nullable=true, length=50)	
	private String nom;
	
	@Column(nullable=true, length=50)	
	private String prenom;
	
	@Column(nullable=false, length=50)	
	private String mail;
	
	@Column(nullable=true, length=50)	
	private String adresse;
	
	@Column(nullable=false, length=50)	
	private String mdp;
	
	@Column(nullable=true, length=55)	
	private String contact;
	
	@Column(nullable=true, length=55)	
	private String img;
	
	@Column(nullable=true, length=55)	
	private String genre;
	
	@ManyToMany
	private List<AnnonceCovoiturage> annonceCovoituragesParticiper;
	
	@OneToMany(mappedBy="compte")	
		
	private List<Vehicule> vehicules;

	@OneToMany(mappedBy="compte")	
		
	private List<AnnonceCovoiturage> annonceCovoituragesPublier;
	
	@ManyToMany
	private List<CentreInteret> centreInterets;
	
	
	
}
