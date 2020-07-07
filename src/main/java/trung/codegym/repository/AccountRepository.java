package trung.codegym.repository;

import org.springframework.data.repository.CrudRepository;
import trung.codegym.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
