package kamila.RedditClone.repository;

import kamila.RedditClone.model.Post;
import kamila.RedditClone.model.User;
import kamila.RedditClone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
