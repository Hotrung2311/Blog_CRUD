package trung.codegym.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import trung.codegym.model.Comment;
import trung.codegym.repository.CommentRepository;

import java.util.List;

public class CommentServiceImpl implements trung.codegym.service.CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return (List<Comment>)commentRepository.findAll();
    }

    @Override
    public Comment findOne(Long id) {
        return commentRepository.findOne(id);
    }

    @Override
    public Comment save(Comment model) {
        return commentRepository.save(model);
    }

    @Override
    public Comment delete(Long id) {
        Comment comment =commentRepository.findOne(id);
        commentRepository.delete(comment);
        return comment;
    }
}
