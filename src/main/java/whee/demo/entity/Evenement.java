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
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evenement implements Serializable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEvent;
	
	@Column(nullable=true, length=55)	
	private String nomEvent;
	
	@Column(nullable=true, length=55)	
	private String lieuEvent;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date dateEvent;
	
	@Column(columnDefinition = "TIME")	
	private LocalTime heureEvent;
	
	@Column(nullable=true, length=55)	
	private String description;
	
	@OneToMany(mappedBy="evenement")	
	
	private List<AnnonceCovoiturage> annonceCovoiturages;
	
	@ManyToMany
	private List<CategorieCD> categorieCDs;
	
	
}
