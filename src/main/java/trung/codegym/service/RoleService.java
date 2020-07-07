package trung.codegym.service;

import trung.codegym.model.Blog;
import trung.codegym.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role findOne(Long id);
    Role save(Role model);
    Role delete(Long id);
}
