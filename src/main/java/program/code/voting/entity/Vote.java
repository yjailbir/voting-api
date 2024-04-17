package program.code.voting.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "votes")
@Data
@NoArgsConstructor
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "speaker")
    private String speaker;

    @Column(name = "mark")
    private Byte mark;

    @Column(name = "fire")
    private Boolean fire;

    @Column(name = "without_water")
    private Boolean withoutWater;

    @Column(name = "fresh")
    private Boolean fresh;

    @Column(name = "deep")
    private Boolean deep;

}
