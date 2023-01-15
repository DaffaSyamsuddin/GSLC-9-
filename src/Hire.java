
public class Hire {
	private String Name;
	private String Background;
	private Integer Bonus;
	private Integer Salary;
	private String ID;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBackground() {
		return Background;
	}
	public void setBackground(String background) {
		Background = background;
	}
	public Integer getBonus() {
		return Bonus;
	}
	public void setBonus(Integer bonus) {
		Bonus = bonus;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}

	public Hire() {
		// TODO Auto-generated constructor stub
	}
	public Hire(String iD, String name, String background, Integer bonus, Integer salary) {
		super();
		ID = iD;
		Name = name;
		Background = background;
		Bonus = bonus;
		Salary = salary;
	}

}
