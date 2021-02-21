import java.util.Scanner;
public class Student extends User{
	private int id;
	private Lot lotCaller;
	
	private  Prize prize;
	
		public Student(Prize pri){
			this.prize=pri;
		this.valuesGetter();
		this.lotcaller();
	}
	
	@Override
	public void valuesGetter(){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR ID");
		int id=sc.nextInt();
		while(id<=0){
			System.out.println("ENTER YOUR ID");
		 id=sc.nextInt();
		}
		super.valuesGetter();
		IdSetter(id);

	}
	void IdSetter(int id){
		this.id=id;
	}
	int IdGetter(){
		return this.id;
	}
	public void StudentINfo(){
		System.out.println(" ID "+this.IdGetter());
		super.display();
	}
	@Override
	public void lotcaller(){
		System.out.println( "a");
		lotCaller=new Lot();
		lotCaller.lot();

	} 
	@Override
	public  void totalbill(){
		
		if(lotCaller.AskforotherLot.equalsIgnoreCase("Normal"))
			System.out.println("Total bill of Normal clothes"+lotCaller.NormalCLothesinlot()*prize.getNormalSuitprize());
		else if(lotCaller.AskforotherLot.equalsIgnoreCase("Urgent"))
			System.out.println("Total bill of Urgent clothes"+lotCaller.UrgentCLothesinlot()*prize.getUrgentSuitprize());
		else
			System.out.println("Total bill of Special clothes"+lotCaller.SpeciaCLothesinlot()*prize.getSpecialSuitprize());

	
	

}

}