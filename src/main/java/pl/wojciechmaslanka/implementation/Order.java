package pl.wojciechmaslanka.implementation;

import org.springframework.stereotype.Component;

import pl.wojciechmaslanka.api.IOrder;
import pl.wojciechmaslanka.api.IPizza;

@Component
public class Order implements IOrder {
	
	private IPizza pizza;
	
	public Order(IPizza pizza) {
		super();
		this.pizza = pizza;
	}
	
	public void printOrder() {
		System.out.println("Zamowienie: " + pizza.getName() + ", cena " + pizza.getPrice());
	}
}
