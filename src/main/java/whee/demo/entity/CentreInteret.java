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
public class CentreInteret implements Serializable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)		
	private Long idCenD;
	
	@ManyToOne
	private CategorieCD categorieCD;
	
	@Column(nullable=true, length=50)	
	private String nomCenD;
	
	@ManyToMany(mappedBy="centreInterets")	
	private List<Compte> comptes;
	
	
	
}
