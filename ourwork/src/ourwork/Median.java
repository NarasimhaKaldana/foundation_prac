//package ourwork;
//
//import java.util.Arrays;
//
//public class Median {
//
//	public static void main(String[] args) {
//    int a[] = {1,5,2,9};
//    Arrays.sort(a);
////    for(int i=0;i<a.length;i++) {
////    	System.out.println(a[i]);
////    }
//    int m1=0;
//    int m2=0;
//    
//	if(a.length%2==0) {
//		m1=a[(a.length/2)-1];
//		m2=a[a.length/2];
//		System.out.println((m1+m2)/2);
//		
//	}
//	else {
//		m1=a[(a.length/2)];
//		System.out.println(m1);
//	}
//	
//	}
//
//}
//
//
//
//


package ourwork;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		int a[]= {3,6,5,7,0,1,9,11,2,12};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
}
		
		if(a.length%2==0) {
			int c=a[(a.length/2)-1]+a[((a.length/2)+1)-1];
			float result= (float) (c/2.0);
			System.out.println("median is"+result);
		}
		else {
		int result1=a[(a.length/2)];
			System.out.println("median is"+result1);
		}

}
}
