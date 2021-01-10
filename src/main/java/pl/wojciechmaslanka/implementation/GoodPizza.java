package pl.wojciechmaslanka.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import pl.wojciechmaslanka.api.IPizza;

@Component
public class GoodPizza implements IPizza{
	private int price;
	private String name;
	
	
	public GoodPizza(
			@Value("13") int price, //to nie działa aktulanie, bo nie ma automatycznego wiązania, więc działają te regułu z pliku Config
			@Value("Fungi") String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
