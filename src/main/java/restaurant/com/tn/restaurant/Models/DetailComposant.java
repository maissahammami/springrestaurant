package restaurant.com.tn.restaurant.Models;

import jakarta.persistence.*;
import lombok.Data;
import restaurant.com.tn.restaurant.Models.enums.TypeMenu.TypeComposant;

@Entity
@Data
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float imc;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    @OneToOne
    @JoinColumn(name = "composant_id")
    private Composant composant;
}