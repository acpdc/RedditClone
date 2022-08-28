package kamila.RedditClone.repository;

import kamila.RedditClone.model.Comment;
import kamila.RedditClone.model.User;
import kamila.RedditClone.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
