package exam;

public class Employee extends Person{
	private String office,salary;
	 private MyDate DateHired;
	 public Employee(){
	 }
	 public Employee(String office, String salary, MyDate DateHired){
	 this.office = office;
	 this.salary = salary;
	 this.DateHired = DateHired;
	 }
	 public String office(){
	 return office;
	 }
	 public void setOffice(String office){
	 this.office = office;
	 }
	 public String getSalary(){
	 return salary;
	 }
	 public void setSalary(String salary){
	 this.salary = salary;
	 }
	 public MyDate getMyDate(){
	 return DateHired;
	 }
	 }


