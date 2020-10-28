package stocks.service.impl;

import org.springframework.stereotype.Service;
import stocks.dao.AccountDAO;
import stocks.model.Account;
import stocks.service.AccountService;

import java.util.UUID;

/**
 * Сервис для работы со счетами
 */
@Service
public class AccountServiceImpl implements AccountService {

  private AccountDAO accountDAO;

  public AccountServiceImpl(AccountDAO accountDAO) {
    this.accountDAO = accountDAO;
  }

  @Override
  public void save(Account account) {
    accountDAO.save(account.getId(), account);
  }

  @Override
  public Account findById(UUID id) {
    return accountDAO.getById(id);
  }
}
