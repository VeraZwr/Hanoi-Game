
public class Hanoi {
	
	    public static void main(String[] args) {
	        int nDisks = 3;
	        
	        Hanoi(nDisks, 'A', 'C', 'B');
	    }
	    public static void Hanoi(int disk, char source, char dest, char tmp) {
	    	
	        if (disk == 1){
	            
	            if(((source=='A')&&(dest=='C'))|((source=='C')&&(dest=='A'))){
	      
	        	   System.out.println("Disk 1 from "+source+" to "+ tmp);
	        	
	        	   System.out.println("Disk 1 from "+tmp+" to "+ dest);
	            }
	            else
	            	
	            	System.out.println("Disk 1 from " + source+" to "+dest);
	        }
	        else {
	            Hanoi(disk - 1, source,dest,tmp);
	            
	            System.out.println("Disk "+disk+" from "+source+" to "+tmp);
	            
	            Hanoi(disk - 1, dest, source, tmp );
	            
	            System.out.println("Disk "+disk+" from "+tmp+" to "+dest);
	            
	            Hanoi(disk - 1, source, dest,tmp);
	        }
	    }
	

}
