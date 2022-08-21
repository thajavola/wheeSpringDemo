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
import java.time.LocalTime;

import javax.persistence.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnonceCovoiturage implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCovoiturage;

	@ManyToOne
	private Vehicule vehicule;

	@ManyToOne
	private Evenement evenement;

	@ManyToOne
	private Compte compte;

	@Column(nullable = false)
	private int nbPassage;

	@Column(nullable = true, length = 50)
	private String lieuDepart;

	@Column(nullable = true, length = 50)
	private String lieuArriver;

	@Column(columnDefinition = "TIME")
	private LocalTime heureDepart;

	@Column(nullable = false)
	private float tarif;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateCovoiturage;

	@ManyToMany(mappedBy = "annonceCovoiturages")
	private List<Compte> comptes;

}
