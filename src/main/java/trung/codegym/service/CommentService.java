package trung.codegym.service;

import trung.codegym.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();
    Comment findOne(Long id);
    Comment save(Comment model);
    Comment delete(Long id);
}
