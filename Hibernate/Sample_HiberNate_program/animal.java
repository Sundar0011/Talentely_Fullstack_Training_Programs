package HibernateBasic.HibernateBasic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class animal {
	@Id
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private  String name;
	 private String color;
	 }
