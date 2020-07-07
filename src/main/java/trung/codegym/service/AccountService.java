package trung.codegym.service;

import trung.codegym.model.Account;
import trung.codegym.model.Blog;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account findOne(Long id);
    Account save(Account model);
    Account delete(Long id);
}
