package restaurant.com.tn.restaurant.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    @JoinColumn(name = "chaine_id")
    private ChaineRestauration chaineRestauration;

    @OneToMany(mappedBy = "restaurant")
    private List<Menu> menus;
}