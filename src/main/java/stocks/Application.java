package stocks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stocks.model.*;
import stocks.service.*;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Точка входа в прилодение
 */
public class Application {

  public static void main(String[] args) {
    ApplicationContext context =
        new AnnotationConfigApplicationContext(Config.class);

    //создаем счет
    AccountService accountService = context.getBean(AccountService.class);
    Account account = new Account(UUID.randomUUID(), new BigDecimal(100), Currency.RUB);

    accountService.save(account);

    //создаем компанию
    CompanyService companyService = context.getBean(CompanyService.class);
    Company companyApple = new Company(UUID.randomUUID(), "APPLE", new BigDecimal(13));
    Company companySber = new Company(UUID.randomUUID(), "SBER", new BigDecimal(3));

    companyService.save(companyApple);
    companyService.save(companySber);

    //создаем заказы на покупку
    Order order1 = new Order(UUID.randomUUID(), companyApple, 5, account);
    Order order2 = new Order(UUID.randomUUID(), companySber, 3, account);

    //исполняем заказы
    StockManager stockManager = context.getBean(StockManager.class);
    stockManager.buyStock(order1);
    stockManager.buyStock(order2);

    //печатаем инфо аккаунта
    account.printAccountInfo();
  }
}
