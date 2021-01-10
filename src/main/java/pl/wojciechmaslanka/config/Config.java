package pl.wojciechmaslanka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.wojciechmaslanka.api.IOrder;
import pl.wojciechmaslanka.api.IPizza;
import pl.wojciechmaslanka.implementation.GoodPizza;
import pl.wojciechmaslanka.implementation.Order;

@Configuration
public class Config {
	@Bean
	public IPizza pizza() {
		return new GoodPizza(15, "Neapolitana");
	}
	@Bean
	public IOrder order(IPizza pizza) {
		return new Order(pizza);
	}
}
