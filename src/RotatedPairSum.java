
import java.util.ArrayList;
import java.util.Scanner;

public class RotatedPairSum {
	public static void pairSum(ArrayList<Integer>list,int target) {
		int bp=-1;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>list.get(i+1)) {
				bp=i;
				break;
			}
		}
		
		int lp=bp+1;
		int rp=bp;
		int n=list.size();
		boolean isFound=false;
		while(lp!=rp) {
			if(list.get(lp)+list.get(rp)==target) {
				System.out.println("The sum of two numbers "+list.get(lp)+" "+list.get(rp)+" ="+target);
		        isFound=true;
		        return;
			}
			
			if(list.get(lp)+list.get(rp)<target) {
				lp=(lp+1)%n;
			}else {
				rp=(n+rp-1)%n;
			}
		}
		if(isFound==false) {
			System.out.println("the pairsum did not found ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Enter the length of thr list");
		int listsize=sc.nextInt();
		System.out.println("Enter the list");
		for(int i=0;i<listsize;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		
		System.out.println("Enter the target");
		int target=sc.nextInt();
		
		pairSum(list,target);
		
	}

}
