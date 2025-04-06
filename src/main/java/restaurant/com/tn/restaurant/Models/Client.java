package restaurant.com.tn.restaurant.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String identifiant;
    private Date datePremiereVisite;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;


}
