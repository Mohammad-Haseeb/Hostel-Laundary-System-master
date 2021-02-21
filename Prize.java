import java.util.Scanner;
public class Prize{
	 
	protected double NormalSuitlsprize=34;
	protected double UrgentSuitsprize=13;
		protected double SpecialSuitprize=23;	
	Scanner sc=new Scanner(System.in);

	public void prizeEntranceForall(){
		System.out.println("Set prizr for Normal Suits Clothes");
		double NormalSuitlsprize=sc.nextDouble();
		System.out.println("Set prizr for Urgent Suits Clothes");
		double UrgentSuitsprize=sc.nextDouble();
		System.out.println("Set prizr for Sepcial Suits Clothes");
		double SpecialSuitprize=sc.nextDouble();
		this.setNormalSuitprize(NormalSuitlsprize);
		this.setUrgentSuitsprize(UrgentSuitsprize);
		this.setSpecialSuitprize(SpecialSuitprize);
	}
	public void setNormalSuitprize(double NormalSuitlsprize){
		this.NormalSuitlsprize=NormalSuitlsprize;
	}
	public void setUrgentSuitsprize(double UrgentSuitsprize){
		this.UrgentSuitsprize=UrgentSuitsprize;
	}
	public void setSpecialSuitprize(double SpecialSuitprize){
		this.SpecialSuitprize=SpecialSuitprize;
	}
	public double getNormalSuitprize(){
		return this.NormalSuitlsprize;
	}
	public double getUrgentSuitprize(){
		return this.UrgentSuitsprize;
	}
	public double getSpecialSuitprize(){
		return this.SpecialSuitprize;
	}

}