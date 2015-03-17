package exam;

public class Faculty extends Employee{
	private String OfficeHours, rank;
	 public Faculty(){
	 }
	 public Faculty(String OfficeHours, String rank){
	 this.OfficeHours = OfficeHours;
	 this.rank = rank;
	 }
	 public String getOfficeHours(){
	 return OfficeHours;
	 }
	 public void setOfficeHours(String OfficeHours){
	 this.OfficeHours = OfficeHours;
	 }
	 public String getRank(){
	 return rank;
	 }
	 public void setRank(String rank){
	 this.rank = rank;
	 }
	 }


