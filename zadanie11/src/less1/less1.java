package less1;

public class Less1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int maxValue = 5;
		int minValue = 1;
		int[] simv = new int[12];		
		int sum = 1;
		int k = 0;
		int k2 = 0;
		int n = 0;
		int m = 0;
		for(int i=0;i<array.length;i++)
		{
		array[i] = ((int)(Math.random()*5)+1);		
		sum += array[i];
		System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("сумм "+ sum);
		for(int i=0;i<array.length;i++)
		{
			if(array[i] == 3)
				k2++;
		}		
		System.out.println("число 3 встречается "+ k2 + " раз(a)");
		
		int array2[] = new int[maxValue-minValue+1];
		for(int i=0;i<array.length;i++)array2[array[i]-minValue]++;			
		for(int i=0;i<array2.length;i++)System.out.println("число "+ minValue++ +" раз"+array2[i]);	
		
		for(int i=0;i<simv.length;i++)
		{
		simv[i] = ((int)(Math.random()*25)+97);		
		System.out.print((char)simv[i]+" ");
		}
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
		array[i] = ((int)(Math.random()*2));		
		System.out.print(array[i]+" ");
		}
		for(int i=0;i<array.length;i++)
		{	
				if(array[i] == 0)
				{	
					k=0;
					k2++;
					if(k2>n) 
					{
						n=k2;						
					}					
				}
				else
				{
					k2=0;
					k++;	
					if(k>m) 
					{
						m=k;						
					}																		
				}
		}
		System.out.println();
		System.out.print("подрят нулей "+n+" ");
		System.out.println();
		System.out.print("подрят едениц "+m+" ");
		System.out.println();
		m=0;
		n=0;
		k=0;
		for(int i=0;i<array.length;i++)
		{
		array[i] = ((int)(Math.random()*10));		
		System.out.print(array[i]+" ");
		k=array[i]%2;
		if(k>0)
		{
			m+=array[i];
		}
		else 
		{
			n+=array[i];
		}
		}
		System.out.println();
		System.out.print("сумм чет "+n+" ");
		System.out.println();
		System.out.print("сумм не чет "+m+" ");
		
		for(int i=4;i<2;i++)
		{
			System.out.println("dsg "+i+" ");
		}
	}

}
