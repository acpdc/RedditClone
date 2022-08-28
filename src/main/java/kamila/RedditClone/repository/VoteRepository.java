package kamila.RedditClone.repository;

import kamila.RedditClone.model.Post;
import kamila.RedditClone.model.User;
import kamila.RedditClone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
