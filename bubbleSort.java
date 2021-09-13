
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void sortName(String[]teamNames) {
		int n = teamNames.length;
        String temp = "";
        int x = 0;
       
        
        while (x<=n) {
        	for(int y = 0; y<(n-x)-1;y++) {
        		
        		if(teamNames[y].charAt(0)>teamNames[y+1].charAt(0)) {
        			// SWAP
        			temp = teamNames[y];
        			teamNames[y]=teamNames[y+1];
        			teamNames[y+1]=temp; 
        			
        		}	
        	}
        	x++;
        }
        
        
	}
	
	public int[] sortSize(int[] teamSize)
	{
        int n = teamSize.length;
        int temp = 0;
        int x = 0;
       
        
        while (x<=n) {
        	for(int y = 0; y<(n-x)-1;y++) {
        		
        		if(teamSize[y]>teamSize[y+1]) {
        			// SWAP
        			temp = teamSize[y];
        			teamSize[y]=teamSize[y+1];
        			teamSize[y+1]=temp; 
        			
        		}	
        	}
        	x++;
        }
		return teamSize;
		
	}

}
