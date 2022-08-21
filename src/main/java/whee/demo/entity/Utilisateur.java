package whee.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "utilisateur")
public class Utilisateur implements Serializable {

    @Column(name = "idusr", nullable = false)
    @Id
    private Integer idusr;

    @Column(name = "nom", nullable = true, length = 50)
    private String nom;

    @Column(name = "prenom", nullable = true, length = 50)
    private String prenom;

    @OneToMany(mappedBy = "utilisateur")
    private List<Entree> entree;

}
