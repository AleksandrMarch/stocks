package stocks.model;

import java.util.UUID;

/**
 * Заказ на действие над акцией
 */
public class Order {

  private UUID id;
  /**
   * компания, с которой происходит операция
   */
  private Company company;
  /**
   * количество акций для операции
   */
  private int amount;
  /**
   * счет для операции
   */
  private Account account;

  public Order(UUID id, Company company, int amount, Account account) {
    this.id = id;
    this.company = company;
    this.amount = amount;
    this.account = account;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
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

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}
