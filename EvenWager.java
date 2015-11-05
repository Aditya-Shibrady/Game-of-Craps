import java.util.*;
import java.io.*;

public class EvenWager {

	public static void main(String[] args) throws IOException {
		
	File file = new File("EvenWager.csv");
	//Comment the file create after first round.
	//file.createNewFile();
	FileWriter writer = new FileWriter(file,true);
	writer.append("-------------------------------------------------------------"+"\n");
	System.out.println("We start the game with an initial balance of $1000 and initial wager amount of $100 \n");
	System.out.println("| Game# | Starting Balance | Ending Balance | Wager for next round | Outcome |"); 
	writer.append("Game #"+","+"Starting Balance"+","+"Ending Balance"+","+"Wager for next round"+","+"Outcome"+"," + "\n");
    int count=0, bal=1000;
    int win=0,lose=0;
	while(count<=9){
		 
		int wflag=0,lflag=0;
		int stbal;
		stbal=bal;
		//myWriter.(count);
		//myWriter.write(',');
		int sum=0,sum2=0;
		//System.out.println("Rolling Dice for the first time...");
		Random randomGenerator = new Random();
		//System.out.println("Dice One Returns:");  
		int rand1 = randomGenerator.nextInt(7);
		if(rand1==0){
				rand1=rand1+1;
		}
		//System.out.println(rand1);
		//System.out.println("Dice two Returns");
		int rand2=randomGenerator.nextInt(7);
		if(rand2==0){
			rand2=rand2+1;
		}
		//System.out.println(rand2);
		//Winning Criteria
		sum=(rand1+rand2);
		int flag=0;
		if(sum==7 || sum==11){
			//count++;
			//System.out.println("Count is" + count);
			//System.out.println("You Win!");
			flag=1;
			win++;
			wflag=1;
			bal=bal+100;
			//System.out.println("Probe Wins:"+ "" + win);
			//continue;
			//break;
		}
		else if(sum==2 || sum==3 || sum==12){
			//count++;
			//System.out.println("Count is" + count);
			//System.out.println("You lose!");
			flag=1;
			lose++;
			lflag=1;
			bal=bal-100;
			//continue;
			//break;
			}
		else if (flag!=1){
			while(sum2!=7 || sum!=sum2){
				//System.out.println("Rolling Dice again...");
				//System.out.println("Dice One Returns:");  
				int rand11 = randomGenerator.nextInt(7);
				if(rand11==0){
					rand11=rand11+1;
					}
				//System.out.println(rand11);
				//System.out.println("Dice two Returns");
				int rand22=randomGenerator.nextInt(7);
				if(rand22==0){
					rand22=rand22+1;
					}
				//System.out.println(rand22);
				sum2=(rand11+rand22);
				if(sum2==7){
					//System.out.println("You Lose!");
					lose++;
					lflag=1;
					bal=bal-100;
					break;
					
					}
				if(sum2!=7 && sum==sum2){
					//System.out.println("You win!");
					win++;
					wflag=1;
					bal=bal+100;
					break;
				}
			}
			}
		String Outcome = null;
		if(lflag==1){
			Outcome="Loss";
		}
		if(wflag==1){
			Outcome="Win";
		}
		count++;
		//System.out.println("| Game | Starting Balance | Ending Balance | Wager | Outcome |");
		System.out.println(+ count + "	  " + stbal + "	 		 " + bal + "		 " + "100" + "	 	  " + Outcome );
		writer.append(+count + "," + stbal + "," + bal + "," + "100" + "," + Outcome +"," +"\n");
		//writer.write("\n" + "Round" +""+count +"\n");
	      
		//System.out.println("Count is" + count);
		//System.out.println("The number of Wins:"+ "" + win);
		//System.out.println("The number of Lose:"+ "" + lose);
		//System.out.println("Balance is:" + bal);
		//System.out.println("");
		//System.out.println("Playing another Game!");
		if(bal<=0){
			break;
		}
		}
	writer.flush();
    writer.close();
	}
}

