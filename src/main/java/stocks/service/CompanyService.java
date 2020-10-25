package stocks.service;

import org.springframework.stereotype.Service;
import stocks.dao.CompanyDAO;
import stocks.model.Company;

/**
 * Сервис для работы с компаниями
 */
@Service
public class CompanyService {

  private CompanyDAO companyDAO;

  public CompanyService(CompanyDAO companyDAO) {
    this.companyDAO = companyDAO;
  }

  public void save(Company company) {
    companyDAO.save(company.getId(), company);
  }
}
