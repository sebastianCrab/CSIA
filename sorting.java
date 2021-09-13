import java.util.ArrayList;
import java.util.Scanner;
public class sorting {

	public sorting(){
		
		ArrayList<String> teamNames = new ArrayList<String>();
		ArrayList<Integer> teamSize = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> genderMF = new ArrayList<ArrayList<Integer>>();
		
		int s = teamNames.size(); 
		int i = 0; 
		int first = 0; 
		ArrayList<String> tNames = new ArrayList<String>();
		
		
		while (i<=s) {
			int t = 0; 
			int m = 0; 
			int f = 0; 
			String same = teamNames.get(first); 
			
			
			for (i=first;i<=s;i++) {
				if (teamNames.get(i).equals(teamNames.get(first))){
					t=t+1;
					if (genderMF.get(i).equals("M")) {
						m=m+1;
					} else {
						f=f+1;
					}
				} else {
					tNames.add(teamNames.get(i));
					teamSize.add(t);
					first = i+1;
					break;
				}
			}
			

			int [] misc = new int [tNames.size()];
			int [] tents = new int [tNames.size()];
			int [] bags = new int [tNames.size()];
			
			for (int j=0;j<teamSize.get(i);j++) {
				if (teamSize.get(i) == 7) {
					misc[j] = 3;
				} else {
					misc [j] = 2;
				}
				
				if (m==7) {
					tents[j] = 3;
				} else if (m>=4) {
					tents[j] = 2;
				} else if (m>0) {
					tents[j] = 1;
				} else {
					tents[j] = 0;
				}
				
				if (f==7) {
					tents[j] = 3;
				} else if (f>=4) {
					tents[j] = 2;
				} else if (f>0) {
					tents[j] = 1;
				} else {
					tents[j] = 0;
				}
				
			}
		}
		
		
		


	}
	
	public static boolean ynCheck(String i) {
		String choice = i.toUpperCase(); 
		if (!choice.equals("N")||!choice.equals("Y")) {
			return false;
		}
		return true;
	}
	
	public static void main (String[] args) {
		team one = new team();
		System.out.println("Do you want to change the number of bags? Enter Y or N");
		Scanner input = new Scanner(System.in); 
		String yn = input.nextLine();
		
		while(!ynCheck(yn)) {
			System.out.println("Please re-enter");
			input = new Scanner(System.in); 
			yn = input.nextLine();
		}
		
		if (yn.equals("Y")) {
			one.changeBagNum();
		}
		
		
	}
	

}
