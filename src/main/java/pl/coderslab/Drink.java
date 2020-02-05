package pl.coderslab;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String name;
    private String originalFileName;
    private String fileName;
}