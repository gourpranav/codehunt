import java.util.Scanner; 
class Hotel
{
 public static void main (String s[])
 {
  //1 2 4 7
 	int days=0,c1=0,c2=0,c4=0,c7=0,bill=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter total days");
  if(sc.hasNextInt())
   days=sc.nextInt();
  if(days>14)
  {
  	System.out.println("You overstayed");
  	System.out.println("Abort! Run again");
  	System.exit(0);
  }
  	
  else
   while(days!=0)
   {
   	if(c1<1)
   	 c1++;
   	else 
   	 if(c2<2)
   	 c2++;
   	else
   	 if(c4<4)
     c4++;   		
   	else 
   	 if(c7<7)
   	 c7++;	  
    days-=1;
   }

  bill=(c1*110)+(c2*100)+(c4*90)+(c7*70);
  System.out.println("c1: "+c1+" c2: "+c2+" c4: "+c4+" c7: "+c7);
  System.out.println("Bill is: "+bill);
 }

}
