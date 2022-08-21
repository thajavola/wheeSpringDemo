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
public class Vehicule implements Serializable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long idVehicule;
	
	@ManyToOne	
	private Compte compte;
	
	@Column(nullable=true, length=55)	
	private String numMatricule;
	
	@Column(name="NbPlace", nullable=false)	
	private Integer nbPlace;
	
	@Column(name="NoteVehicule", nullable=true)	
	private Integer noteVehicule;
	
	@Column(nullable=true, length=55)	
	private String modele;
	
	@Column(nullable=true, length=55)	
	private String marque;
	
	@Column(nullable=true, length=255)	
	private String typeVehicule;
	
	@OneToMany(mappedBy="vehicule")	
		
	private List<AnnonceCovoiturage> annonceCovoiturages;
	
	
	
}
