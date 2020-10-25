package stocks.service;

import stocks.dao.CompanyDAO;
import stocks.model.Company;

public class CompanyService {

  private CompanyDAO companyDAO;

  public CompanyService(CompanyDAO companyDAO) {
    this.companyDAO = companyDAO;
  }

  public void save(Company company) {
    companyDAO.save(company.getId(), company);
  }
}
