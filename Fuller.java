import java.util.Scanner;
public class Fuller extends User{
	private Lot lotCaller;
	private String shopinfo;
	private Prize prize;
	
	public Fuller(){
		this.valuesGetter();
	}
	@Override
	public void valuesGetter(){
		Scanner sc=new Scanner(System.in);
             super.valuesGetter();
		System.out.println("ENTER YOUR SHOP ADDRESS");
		String shopinfo=sc.next();
		this.setShopInfo(shopinfo);
	}
	public void setShopInfo(String shopinfo){
		this.shopinfo=shopinfo;
	}
	public String getShopInfo(){
		return this.shopinfo;
	}
	@Override
    public void lotcaller(){
          
      lotCaller=new Lot();
    } 
    public void prizesetter(){
    	 prize.prizeEntranceForall();
    	  }
	public void Fullerinfo(){
            System.out.println("SHOP INFORMATION "+this.getShopInfo());
            super.display();
	}
	 public  void totalbill(){
      System.out.println("Total bill of Sepcial clothes"+);
      System.out.println("Total bill of Normal clothes"+Bil.getNormalPrize());
      System.out.println("Total bill of Uregent clothes"+Bil.getUrgentPrize());
      System.out.println("OVER ALL TOTAL BILL"+Bil.totalBill());
    }
     
   
}