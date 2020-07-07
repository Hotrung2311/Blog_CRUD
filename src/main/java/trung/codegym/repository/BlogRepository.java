package trung.codegym.repository;

import org.springframework.data.repository.CrudRepository;
import trung.codegym.model.Blog;

public interface BlogRepository extends CrudRepository<Blog, Long> {
}
