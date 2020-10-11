package stocks.model;

import java.math.*;
import java.util.*;

public class Account {

  private UUID id;
  private Map<String, Stock> stockList = new HashMap<>();
  private BigDecimal balance;
  private Currency currency;

  public Account(UUID id, BigDecimal balance, Currency currency) {
    this.id = id;
    this.balance = balance;
    this.currency = currency;
  }

  public UUID getId() {
    return id;
  }

  public Map<String, Stock> getStockList() {
    return stockList;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public void printAccountInfo() {
    System.out.printf("Id аккаунта %s \n", id);
    System.out.printf("Баланс %s \n", balance);
    System.out.printf("Валюта %s \n", currency);
    System.out.print("--- Список Акций --- \n");

    stockList.forEach((companyName, stock) -> {
      System.out.printf(
          "Сомпания %s Количество %d Цена акции %s \n",
          companyName,
          stock.getAmount(),
          stock.getCompany().getPrice()
      );
    });
  }
}
