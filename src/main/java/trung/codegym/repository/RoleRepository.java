package trung.codegym.repository;

import org.springframework.data.repository.CrudRepository;
import trung.codegym.model.Role;

public interface RoleRepository extends CrudRepository<Role,Long> {
}
