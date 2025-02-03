package restaurant.com.tn.restaurant.Models;

import jakarta.persistence.*;
import lombok.Data;
import restaurant.com.tn.restaurant.Models.enums.TypeMenu.TypeChef;

@Entity
@Data
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
}
