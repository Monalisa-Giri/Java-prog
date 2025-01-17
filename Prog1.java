import java.util.Scanner;
import java.lang.*;

class Employee{
	private String empName;
	private int empID;
	public Employee(){
	}
	public Employee(String s, int id){
		this.empName=s;
		this.empID=id;
	}
	public void inputData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name of the employee : ");
		empName=sc.nextLine();
		System.out.println("enter employee ID : ");
		empID=sc.nextInt();
		return;
	}
	public void displayData(){
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee ID: "+empID);
		return;
	}
}

class Manager extends Employee{
	private double basicSalary;
	private double DA;
	private double HRA;
	public Manager(){
		super();
	}
	public Manager(String s, int id, double b, double d, double h){
		super(s, id);
		this.basicSalary=b;
		this.DA=d;
		this.HRA=h;
	}
	public void getInfo(){
		Scanner sc = new Scanner(System.in);
		inputData();
		System.out.println("enter basic salary : ");
		basicSalary=sc.nextDouble();
		System.out.println("enter DA : ");
		DA=sc.nextDouble();
		System.out.println("enter HRA : ");
		HRA=sc.nextDouble();
		return;
	}
	public double calSal(){
		double t;
		t=basicSalary+(basicSalary*HRA/100)+(basicSalary*DA/100);
		return t;
	}
	public void printInfo(){
		double sal=calSal();
		displayData();
		System.out.println("BASIC SALARY : "+basicSalary);
		System.out.println("DA : "+DA);
		System.out.println("HRA : "+HRA);
		System.out.println("Gross : "+sal);
		return;
	}
}

class Main{
	public static void main(String [] args){
	Manager e1, e2, e3;
	e1 = new Manager();
	e2 = new Manager("gaurab",1,100000,10,20);
	e3 = new Manager();
	e3.getInfo();
	e1.printInfo();
	e2.printInfo();
	e3.printInfo();
	}
}