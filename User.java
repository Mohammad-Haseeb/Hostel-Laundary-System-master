import java.util.Scanner;
public abstract  class User{

	private String Name;
	private String Email;
	private long ContactNumber;

	public  void valuesGetter(){
	Scanner sc=new Scanner(System.in);
      System.out.println("ENTER NAME please");
      String Name=sc.nextLine();
      System.out.println("Enter Email");
      String Email=sc.nextLine();
      System.out.println("ENTER CONTACT NUMBER ");
      long ContactNumber=sc.nextLong();
      while(ContactNumber<=0){
       System.out.println("ENTER CONTACT NUMBER Again ");
       ContactNumber=sc.nextLong();
      }
      setName(Name);
      setEmail(Email);
      setContactNumber(ContactNumber);
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public void setEmail(String Email){
		this.Email=Email;
	}
	public void setContactNumber(long ContactNumber){
		this.ContactNumber=ContactNumber;
	}
	public String getName(){
		return this.Name;
	}
	public String getEmail(){
		return this.Email;
	}
	public long getContactNumber(){
		return this.ContactNumber;
	}
	public abstract void lotcaller();
	public void display(){
		System.out.println("NAME            : "+this.getName());
		System.out.println("EMAIL           : "+this.getEmail());
		System.out.println("ContactNUmber   : "+this.getContactNumber());
	}
	public abstract void totalbill();
	
	

} 