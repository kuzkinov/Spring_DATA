package softuni.exam.models.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "passengers")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
