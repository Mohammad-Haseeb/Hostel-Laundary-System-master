import java.util.Scanner;
public class Lot{
	private Clothes Clothes;
	protected Clothes[] SpecialLot;
	private Clothes [] NormalLot;
	private Clothes [] UrgentLot;
	protected String AskforotherLot;
	private int totalClothesinlot;
	private int  ArraySize;
	      
         Scanner sc=new Scanner(System.in);
          public void lot(){
                
                  System.out.println("Which is your Lot type \nUrgent lot \nSpecial Lot \nNormal Lot \nSelect ONe of These Types");
                  AskforotherLot=sc.nextLine();
                  while(!(AskforotherLot.equalsIgnoreCase("Normal")
                   ||AskforotherLot.equalsIgnoreCase("Special")|| AskforotherLot.equalsIgnoreCase("Urgent")) ){
                    System.out.println("ENTER VALID 'Special' ,'Noraml','Urgent' ");
                    AskforotherLot=sc.nextLine();        
                  }//while for correctness to chosse correct Lot type
                  if(AskforotherLot.equalsIgnoreCase("Normal"))
                  {
                  	System.out.println("ENTER LOT SIZE");
                  	ArraySize=sc.nextInt();
                    while(ArraySize<=0){
                      System.out.println("ENTER LOT Again SIZE");
                    ArraySize=sc.nextInt();
                    }
                  	NormalLot=new Clothes[ArraySize];
                  	for(int i=0;i<NormalLot.length;i++)
                  	{
                  		System.out.println("ENTER CLOTHS FOR LOT "+ i);
                  	   NormalLot[i]= new Clothes();
                  	}
                  	  
                  }//if
                   else if(AskforotherLot.equalsIgnoreCase("Urgent")){
                          System.out.println("ENTER LOT SIZE");
                  	       ArraySize=sc.nextInt();
                           while(ArraySize<=0){
                      System.out.println("ENTER LOT Again SIZE");
                    ArraySize=sc.nextInt();
                    }
                  	       UrgentLot=new Clothes[ArraySize];
                  	       for(int i=0;i<UrgentLot.length;i++)
                  	{
                  		System.out.println("ENTER CLOTHS FOR LOT "+i);
                  		UrgentLot[i]=new Clothes();
                  	}

                  	   }//else if
                  	   else{
                  	   	 System.out.println("ENTER LOT SIZE");
                  	       ArraySize=sc.nextInt();
                           while(ArraySize<=0){
                      System.out.println("ENTER LOT Again SIZE");
                    ArraySize=sc.nextInt();
                    }
                  	       SpecialLot=new Clothes[ArraySize];
                  	       for(int i=0;i<SpecialLot.length;i++)
                  	{
                  		System.out.println("ENTER CLOTHS FOR LOT "+i);
                  		SpecialLot[i]=new Clothes();
                  	}

                  	   }//if



                

          }//end first

        public int NormalCLothesinlot(){
          int Clothesinlot=0;
        	for(int i=0;i<NormalLot.length;i++){
            Clothesinlot+=NormalLot[i].totalClothes();
        	}
        	return Clothesinlot;
        }//NormalClothes
        public int SpeciaCLothesinlot(){
        	for(int i=0;i<SpecialLot.length;i++){
        		totalClothesinlot+=SpecialLot[i].totalClothes();
        	}
        	return totalClothesinlot;
        }//Special lot
        public int UrgentCLothesinlot(){
        	for(int i=0;i<UrgentLot.length;i++){
                    totalClothesinlot+=UrgentLot[i].totalClothes();
        	}
        	return totalClothesinlot;
        }//Urgentlot


        
 


}
