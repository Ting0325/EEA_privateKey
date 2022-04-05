
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two prime numbers");
		//int pn1 = sc.nextInt();
		//int pn2 = sc.nextInt();
		int pn1 = 5;//61;//5;
		int pn2 = 11;//53;//11;
		System.out.println("pn1 :"+pn1);
		System.out.println("pn2 :"+pn2);
		//int e = sc.nextInt();//17
		int e = 17;//17;
		System.out.println("e :"+e);
		int fee = (pn1-1)*(pn2-1);
		ArrayList<Integer> r = new ArrayList<Integer>();
		ArrayList<Integer> q = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();		//divisors

		int dividend = fee;
		int divisor = e;
		int quotient = dividend/divisor;
		int remainder = dividend%divisor;
		r.add(remainder);
		d.add(divisor);
		q.add(quotient);
		int step = 1;
		int i = 0;
		while (remainder != 0&&i<10) {
			dividend = d.get(step-1);
			divisor = r.get(step-1);
			quotient = dividend/divisor;
			remainder = dividend%divisor;
			r.add(remainder);
			d.add(divisor);
			q.add(quotient);
			step ++;
		} ;
		System.out.println("r "+r);
		System.out.println("d "+d);
		System.out.println("q "+q);

		int subsitute = q.get(0);
		subsitute *= q.get(1);
		System.out.println("sub:"+subsitute);
		//int x = ((q.get(0)*q.get(1)+1)+q.get(0))*(-1);
		int x = ((subsitute+1)*q.get(2) + q.get(0))*(-1);
		//System.out.println(x);
		//System.out.println(step);
		while(x < 0) {
			x+=fee;
		}
		System.out.println(x);
	}
}


