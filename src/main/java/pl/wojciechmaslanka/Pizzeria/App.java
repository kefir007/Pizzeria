package pl.wojciechmaslanka.Pizzeria;

import pl.wojciechmaslanka.implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.wojciechmaslanka.api.IOrder;
import pl.wojciechmaslanka.config.AutoConfig;
import pl.wojciechmaslanka.config.Config;
import pl.wojciechmaslanka.implementation.Order;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		IOrder order = context.getBean(Order.class);
		order.printOrder();
	}

}
 