package stocks.service;

import org.springframework.stereotype.Service;
import stocks.dao.AccountDAO;
import stocks.model.Account;

import java.util.UUID;

/**
 * Сервис для работы со счетами
 */
@Service
public class AccountService {

  private AccountDAO accountDAO;

  public AccountService(AccountDAO accountDAO) {
    this.accountDAO = accountDAO;
  }

  public void save(Account account) {
    accountDAO.save(account.getId(), account);
  }

  public Account findById(UUID id) {
    return accountDAO.getById(id);
  }
}
