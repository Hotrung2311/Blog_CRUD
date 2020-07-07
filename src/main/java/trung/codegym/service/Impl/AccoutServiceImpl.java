package trung.codegym.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import trung.codegym.model.Account;
import trung.codegym.repository.AccountRepository;
import trung.codegym.service.AccountService;

import java.util.List;

public class AccoutServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> findAll() {
        return (List<Account>)accountRepository.findAll();
    }

    @Override
    public Account findOne(Long id) {
        return accountRepository.findOne(id);
    }

    @Override
    public Account save(Account model) {
        return accountRepository.save(model);
    }

    @Override
    public Account delete(Long id) {
        Account account= accountRepository.findOne(id);
        accountRepository.delete(account);
        return account;
    }
}
