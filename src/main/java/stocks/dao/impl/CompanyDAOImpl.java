package stocks.dao.impl;

import org.springframework.stereotype.Repository;
import stocks.dao.CompanyDAO;
import stocks.model.Company;

import java.util.UUID;

@Repository
public class CompanyDAOImpl extends BaseDAOImpl<Company, UUID> implements CompanyDAO {
}
