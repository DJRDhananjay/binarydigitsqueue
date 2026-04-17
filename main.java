import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Queue<String>q=new LinkedList();
		q.offer("1");
		int n=5;
		for(int i=0;i<n;i++){
		    String curr=q.poll();
		    System.out.print(curr+" ");
		    q.offer("0");
		    q.offer("1");
		}
	    
	}
}
