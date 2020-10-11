package stocks.service;

import stocks.dao.CompanyDAO;
import stocks.model.Company;

import java.util.UUID;

public class CompanyService {

  private CompanyDAO<UUID, Company> companyDAO;

  public CompanyService(CompanyDAO companyDAO) {
    this.companyDAO = companyDAO;
  }

  public void save(Company company) {
    companyDAO.save(company.getId(), company);
  }
}
