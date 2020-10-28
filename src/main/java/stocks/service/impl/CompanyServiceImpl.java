package stocks.service.impl;

import org.springframework.stereotype.Service;
import stocks.dao.CompanyDAO;
import stocks.model.Company;
import stocks.service.CompanyService;

/**
 * Сервис для работы с компаниями
 */
@Service
public class CompanyServiceImpl implements CompanyService {

  private CompanyDAO companyDAO;

  public CompanyServiceImpl(CompanyDAO companyDAO) {
    this.companyDAO = companyDAO;
  }

  @Override
  public void save(Company company) {
    companyDAO.save(company.getId(), company);
  }
}
