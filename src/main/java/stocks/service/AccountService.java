package stocks.service;

import stocks.dao.AccountDAO;
import stocks.model.Account;

import java.util.UUID;

public class AccountService {

  private AccountDAO<UUID,Account> accountDAO;

  public AccountService(AccountDAO accountDAO) {
    this.accountDAO = accountDAO;
  }

  public void save(Account account) {
    accountDAO.save(account.getId(), account);
  }

  public Account findById(UUID id) {
    return accountDAO.read(id);
  }
}
