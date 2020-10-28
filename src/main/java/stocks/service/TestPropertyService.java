package stocks.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * Тестовый сервис для проверки работоспособности application.properties
 */
@Service
@PropertySource("classpath:application.properties")
public class TestPropertyService {

  @Value("${hello}")
  private String property;

  public void printProperty() {
    System.out.printf("test property is - %s", property);
  }

}
