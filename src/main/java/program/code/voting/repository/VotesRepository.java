package program.code.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import program.code.voting.entity.Vote;

@Repository
public interface VotesRepository extends JpaRepository<Vote, Long> {
}
