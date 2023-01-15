
public class Programmer {
	private String ID;
	private String Name;
	private String Background;
	private Integer Bonus;
	private String Salary;
	
	public Programmer(String iD, String name, String background, Integer bonus, String salary) {
		super();
		ID = iD;
		Name = name;
		Background = background;
		Bonus = bonus;
		Salary = salary;
	}

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

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public Programmer() {
		// TODO Auto-generated constructor stub
	}

}
