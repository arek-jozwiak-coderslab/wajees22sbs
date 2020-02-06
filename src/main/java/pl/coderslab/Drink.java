package pl.coderslab;

import lombok.Data;
import pl.coderslab.validators.UniqueLogin;

import javax.persistence.*;

@Entity
@Data
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @UniqueLogin
    @Column(unique = true)
    private String name;
    private String originalFileName;
    private String fileName;
}