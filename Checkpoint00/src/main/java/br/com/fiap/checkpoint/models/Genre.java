package br.com.fiap.checkpoint.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="genre_id")
    private Long id;
    @NotNull
    @Column(name="genre_name")
    private String name;

    @OneToMany(mappedBy = "genreId")
    private List<GenreTrack> genreTrack;
}