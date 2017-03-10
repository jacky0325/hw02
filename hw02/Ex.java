package hw02;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		Seabed [] sead = new Seabed[5];
		for(int i=0;i<5;i++){
			System.out.print("Please input code , sort , animal");
			sead[i] = new Seabed(scn.next(), scn.next(), scn.next());
		}
		/*  海洋哺乳類 鯨目 齒鯨
			海洋哺乳類 鯨目 鬚鯨
			海洋脊椎動物 海洋魚類 軟骨魚綱 
			海洋脊椎動物 海龜科 棱蠵龜 
			海洋無脊椎動物 刺胞動物門 水母*/
		System.out.print("Which Seabed Animal you want to find?");
		String animal = scn.next();
		int i = 0;
		boolean flag = true;
		while(i<5&&flag){
			if(sead[i].getId().equals(animal)){
				sead[i].showAll();
				flag = false;
			}
			i++;
		}
	}

}
