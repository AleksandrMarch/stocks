package stocks.service;

import stocks.model.Order;

public interface StockManager {

  /**
   * Купить акции
   * @param order - заказ
   */
  void buyStock(Order order);
}
