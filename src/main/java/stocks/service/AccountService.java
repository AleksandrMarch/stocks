package stocks.service;

import stocks.model.Account;

import java.util.UUID;

public interface AccountService {

  void save(Account account);

  Account findById(UUID id);
}
