package trung.codegym.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import trung.codegym.model.Role;
import trung.codegym.repository.RoleRepository;
import trung.codegym.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }

    @Override
    public Role findOne(Long id) {
        return roleRepository.findOne(id);
    }

    @Override
    public Role save(Role model) {
        return roleRepository.save(model);
    }

    @Override
    public Role delete(Long id) {
        Role role = roleRepository.findOne(id);
        roleRepository.delete(role);
        return role;
    }
}
