import java.util.*;
import java.io.*;

public class ReverseMartingale {

	public static void main(String[] args) throws IOException {
		
	File file = new File("ReverseMartingale.csv");
	//file.createNewFile();
	FileWriter writer = new FileWriter(file,true);
	writer.append("-------------------------------------------------------------"+"\n");
	System.out.println("We start the game with an initial balance of $1000 and initial wager amount of $100 \n");
	System.out.println("| Game# | Starting Balance | Ending Balance | Wager for next round | Outcome |"); 
	writer.append("Game #"+","+"Starting Balance"+","+"Ending Balance"+","+"Wager for next round"+","+"Outcome"+"," + "\n");
    int count=0, bal=1000;
    int win=0,lose=0, wager=100;
	while(count<=9){
		int wflag=0,lflag=0;
		int stbal;
		stbal=bal;
		int sum=0,sum2=0;
		Random randomGenerator = new Random();
		int rand1 = randomGenerator.nextInt(7);
		if(rand1==0){
				rand1=rand1+1;
		}
		int rand2=randomGenerator.nextInt(7);
		if(rand2==0){
			rand2=rand2+1;
		}
		sum=(rand1+rand2);
		int flag=0;
		if(sum==7 || sum==11){
			flag=1;
			win++;
			wflag=1;
			bal=bal+wager;
		}
		else if(sum==2 || sum==3 || sum==12){
			flag=1;
			lose++;
			lflag=1;
			bal=bal-wager;
			}
		else if (flag!=1){
			while(sum2!=7 || sum!=sum2){
				int rand11 = randomGenerator.nextInt(7);
				if(rand11==0){
					rand11=rand11+1;
					}
				int rand22=randomGenerator.nextInt(7);
				if(rand22==0){
					rand22=rand22+1;
					}
				sum2=(rand11+rand22);
				if(sum2==7){
					lose++;
					lflag=1;
					bal=bal-wager;
					break;
					
					}
				if(sum2!=7 && sum==sum2){
					win++;
					wflag=1;
					bal=bal+wager;
					break;
				}
			}
			}
		String Outcome = null;
		if(lflag==1){
			Outcome="Loss";
			wager=100;
			
		}
		if(wflag==1){
			Outcome="Win";
			wager=wager*2;
			
		}
		
		count++;
		System.out.println(+ count + "	  " + stbal + "	 		 " + bal + "		 " + wager + "	 	  " + Outcome );
		writer.append(+count + "," + stbal + "," + bal + "," + wager + "," + Outcome +"," +"\n"); 
		if(bal<=0){
			break;
		}
		}
	writer.flush();
    writer.close();
	}
}

