package stocks.model;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Компания
 */
public class Company {

  private UUID id;
  /**
   * название компании
   */
  private String name;
  /**
   * цена акции компании
   */
  private BigDecimal price;

  public Company(UUID id, String name, BigDecimal price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
