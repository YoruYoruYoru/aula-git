package entities;

public class Employee {
	
	private String name;
	private Integer id;
	private Double salary;
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void increaseSalary(double salary) {
		this.salary = this.salary + (this.salary * salary / 100);
	}

	public Integer getId() {
		return id;
	}
	
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f", salary);
	}
}

