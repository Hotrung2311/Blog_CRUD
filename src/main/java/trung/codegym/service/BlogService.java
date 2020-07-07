package trung.codegym.service;

import trung.codegym.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findOne(Long id);
    Blog save(Blog model);
    Blog delete(Long id);
}
