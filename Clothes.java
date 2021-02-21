public class Clothes {
	private int total_cloths;
	private ClothesTypes[] Clothe=new ClothesTypes[4];
	
	public Clothes(){
		
	System.out.println("ENTER  Clothes");
	
	       System.out.println("ENTER YOUR looseTrousers");
         Clothe[0]=new ClothesTypes();
         System.out.println("ENTER YOUR long Shirts ");
         Clothe[1]=new ClothesTypes();
         System.out.println("Enter Your Shirts");
         Clothe[2]=new ClothesTypes();
         System.out.println("Enter Your  Pants");
         Clothe[3]=new ClothesTypes();

	}
	public int  totalClothes(){
            for(int i=0;i<Clothe.length;i++ ){

            	this.total_cloths+=Clothe[i].getcloth();
            }		
            return this.total_cloths;
	}

	
	}
