package stocks.service;

import org.springframework.stereotype.Service;
import stocks.model.*;

import java.math.BigDecimal;

/**
 * Управляет упорециями на бирже
 */
@Service
public class StockManager {

  /**
   * Купить акции
   * @param order - заказ
   */
  public void buyStock(Order order) {
    Company company = order.getCompany();
    Account account = order.getAccount();

    BigDecimal accountBalance = account.getBalance();
    BigDecimal orderPrice = company.getPrice().multiply(new BigDecimal(order.getAmount()));

    if (orderPrice.compareTo(accountBalance) > 0) {
      throw new RuntimeException("Не хватает средств");
    }

    Stock stock = account.getStockByCompanyName(company.getName());

    if (stock == null) {
      stock = new Stock(company, order.getAmount());
      account.getStockList().add(stock);
    } else {
      stock.setAmount(stock.getAmount() + order.getAmount());
    }

    account.setBalance(accountBalance.subtract(orderPrice));
  }
}
