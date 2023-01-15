import java.util.Scanner;
import java.util.Vector;

public class MainProgram {

	Scanner scan = new Scanner(System.in);
	Vector<Employee> listDataEmployee = new Vector<>();
	Vector<Background> listDataBackground = new Vector<>();
	Vector<Hire> listDataHire = new Vector<>();
	Vector<Fire> listDataFire = new Vector<>();
	Vector<Programmer> listDataProgrammer = new Vector<>();
	Vector<NonProgrammer> listDataNonProgrammer = new Vector<>();
	public MainProgram() {
		// TODO Auto-generated constructor stub
		while(true) {
			int input = 0;
			System.out.println("Maikrosof");
			System.out.println("---------");
			System.out.println("1. View Employee List");
			System.out.println("2. Hire Employee");
			System.out.println("3. Fire Employee");
			System.out.println("4. Exit");
			System.out.println(">> ");
			input = scan.nextInt();
			switch (input) {
			case 1:
				viewEmployeeList();
				break;
			case 2:
				hireEmployee();			
				break;
			case 3:
				fireEmployee();
				break;
			case 4:
				System.exit(0);
				break;
			
			}
		}
		
	}

	private void fireEmployee() {
		// TODO Auto-generated method stub
		while(true) {
			int Newinput = 0;
			System.out.println("Select Employee Type to fire [0 to main menu] :");
			System.out.println("1. View Non-Programmers");
			System.out.println("2. View Programmers");
			System.out.println("Exit");
			Newinput = scan.nextInt();
			switch (Newinput) {
			case 1:
				viewNonProgrammers();
				break;
			case 2:
				viewProgrammers();
				break;
			case 3:
				System.exit(0);
				System.out.println("Shutting Down. . .");
				break;

			}
		}
	}

	private void viewProgrammers() {
		// TODO Auto-generated method stub
		String Employee = "";
		String Programmer = "";
		if(listDataProgrammer.isEmpty()) {
			System.out.println("No Programmers.");
			return;
		}
		for(int i = 0; i < listDataProgrammer.size(); i++) {
			System.out.println("i+1");
			System.out.println(listDataEmployee.get(i).getID());
			System.out.println(listDataEmployee.get(i).getName());
			System.out.println(listDataEmployee.get(i).getBackground());
			System.out.println(listDataEmployee.get(i).getBonus());
			System.out.println(listDataEmployee.get(i).getClass());
			System.out.println(listDataEmployee.get(i).getSalary());
			System.out.println("");
			System.out.println("");
		}
		while(true) {
			System.out.println("Select Employee to Fire[1..2] : ");
			Employee = scan.nextLine();
			if(Employee.equals("1") || Employee.equals("2")) {
				break;
			}
		}
		System.out.println("Employee Fired");
		while(true) {
			System.out.println("Select Programmer to Fire[1..2] : ");
			if(Programmer.equals("1") || Programmer.equals("2")) {
				break;
			}
		}
	}

	private void viewNonProgrammers() {
		// TODO Auto-generated method stub
		if(listDataNonProgrammer.isEmpty()) {
			System.out.println("No Non-Programmers");
			return;
		}
		for(int i = 0; i < listDataNonProgrammer.size(); i++) {
			System.out.println("i+1");
			System.out.println(listDataEmployee.get(i).getID());
			System.out.println(listDataEmployee.get(i).getName());
			System.out.println(listDataEmployee.get(i).getBackground());
			System.out.println(listDataEmployee.get(i).getBonus());
			System.out.println(listDataEmployee.get(i).getClass());
			System.out.println(listDataEmployee.get(i).getSalary());
			System.out.println("");
			System.out.println("");
		}
	}

	private void hireEmployee() {
		// TODO Auto-generated method stub
		String Name = "";
		String Background = "";
		String Salary = "";
		String Programmer = "";
		
		while(true) {
			System.out.println("Insert Employee Name[Must begin with capital Letter] : ");
			Name = scan.nextLine();
			if(Name.toUpperCase() != null) {
				break;
			}
		}
		
		while(true) {
			System.out.println("Insert Employee Background[IT | SI | Others](Case-Sensitive) :");
			Background = scan.nextLine();
			if(Background.equals("IT") || Background.equals("SI") || Background.equals("Others")) {
				break;
			}
		}
		
		while(true ) {
			System.out.println("Insert Employee Salary[$5000 - $20000] :");
			Salary = scan.nextLine();
			if(Salary.length() >=5000 && Salary.length() <=20000) {
				break;
			}
		}
		
		while(true) {
			System.out.println("Is This Employee a Programmer[Yes | No](Case Sensitive)?");
			Programmer = scan.nextLine();
			if(Programmer.equals("Yes") || Programmer.equals("No")) {
				break;
			}
		}
		hire myHire = new Hire(String iD, String name, String background, Integer bonus, Integer salary)
		listDataHire.add(myHire);
		System.out.println("Employee Successfully Hired");
	}

	private void viewEmployeeList() {
		// TODO Auto-generated method stub
		if(listDataEmployee.isEmpty()) {
			System.out.println("No Non-Programmers.");
			return;
		}
		for(int i = 0; i < listDataEmployee.size(); i++) {
			System.out.println("i+1");
			System.out.println(listDataEmployee.get(i).getID());
			System.out.println(listDataEmployee.get(i).getName());
			System.out.println(listDataEmployee.get(i).getBackground());
			System.out.println(listDataEmployee.get(i).getBonus());
			System.out.println(listDataEmployee.get(i).getClass());
			System.out.println(listDataEmployee.get(i).getSalary());
			System.out.println("");
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainProgram();
	}

}
