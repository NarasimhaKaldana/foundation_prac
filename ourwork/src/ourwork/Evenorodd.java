package ourwork;

public class Evenorodd {
	int a[]= {1,2,3,4,5,6,7,8,9,10};

	int j=0;
	int k=0;
	int count=0;
	int count1=0;
	public  void evenorodd() {
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			
			count++;	
			}
			else
			{
				count1++;
			}
		}
		int b[]=new int[count];
		int c[]=new int[count1]; 
		
		for(int i=0;i<a.length;i++)    
		{
			
			if(a[i]%2==0)
			{
				b[j]=a[i];
				j++;
			}
			else
			{
				
				
					c[k]=a[i];
					k++;
				}
			}
			
		System.out.println("even elements:");
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		System.out.println("odd elements:");
		for(int k=0;k<c.length;k++)
		{
			System.out.println(c[k]);
		}
		
		
		
	int d1= count+count1;
	int d[]= new int[d1];
	
	for(int i=0; i<count; i++) {
		d[i]=b[i];
	}
	for(int i=0;i<count1;i++) {
		d[count+i]=c[i];
	}
	for(int i=0;i<d1;i++) {
		System.out.print(d[i]+" ");
	}
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evenorodd obj = new Evenorodd();
		obj.evenorodd();
		

	}

}
