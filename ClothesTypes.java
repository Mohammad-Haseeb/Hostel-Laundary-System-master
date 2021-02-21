import java.util.Scanner;
public class ClothesTypes{
	private int cloth;
	Scanner sc=new Scanner(System.in);
	public ClothesTypes(){
           System.out.println("ENTER ");
            int cloth=sc.nextInt();
             this.setcloth(cloth);
           
	}
	public void setcloth(int cloth){
		this.cloth=cloth;
	}
	public int getcloth(){
		return this.cloth;
	}
}