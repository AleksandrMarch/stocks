package stocks.dao.impl;

import org.springframework.stereotype.Repository;
import stocks.dao.*;
import stocks.model.Account;

import java.util.UUID;

@Repository
public class AccountDAOImpl extends BaseDAOImpl<Account, UUID> implements AccountDAO {

}
