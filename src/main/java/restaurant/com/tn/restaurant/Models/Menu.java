package restaurant.com.tn.restaurant.Models;

import jakarta.persistence.*;
import lombok.Data;
import restaurant.com.tn.restaurant.Models.enums.TypeMenu.TypeMenu;

import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;
    private Float prixTotal;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "menu")
    private List<Composant> composants;
}