package trung.codegym.repository;

import org.springframework.data.repository.CrudRepository;
import trung.codegym.model.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
