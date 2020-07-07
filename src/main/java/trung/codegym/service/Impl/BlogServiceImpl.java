package trung.codegym.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import trung.codegym.model.Blog;
import trung.codegym.repository.BlogRepository;
import trung.codegym.service.BlogService;

import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return (List<Blog>)blogRepository.findAll();
    }

    @Override
    public Blog findOne(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public Blog save(Blog model) {
        return blogRepository.save(model);
    }

    @Override
    public Blog delete(Long id) {
        Blog blog = blogRepository.findOne(id);
        blogRepository.delete(blog);
        return blog;
    }
}
