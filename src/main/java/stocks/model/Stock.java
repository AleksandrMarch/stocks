package stocks.model;

/**
 * Акция
 */
public class Stock {

  /**
   * Компания, к которой принадлежит акция
   */
  private Company company;
  /**
   * количество акций
   */
  private int amount;

  public Stock(Company company, int amount) {
    this.company = company;
    this.amount = amount;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

}
