package whee.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Entree implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ident;

    @ManyToOne
    private Utilisateur utilisateur;

    @Column(name = "nent", nullable = true, length = 255)
    private String nent;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @Column(name = "description", nullable = true, length = 50)
    private String description;

    @Column(name = "montant", nullable = false, length = 10)
    private double montant;

    @Column(name = "code", nullable = false, length = 10)
    private Integer code;

}
