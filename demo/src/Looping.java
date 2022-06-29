
public class Looping {
public static void main(String[] args) {
	for(int i=1,j=1;i<10||j<10;i++,j++)
	{
		j++;
		System.out.println("i="+i+"andj="+j);
	}
	int i=1,j=1;
	while(i<10 || j<10) {
		i++;j++;
		System.out.println("i="+i+"andj="+j);
	}
	int n=1,m=1;
	do
	{
		n++;
		m++;
		System.out.println("i="+i+"andj="+j);
		}
	while(i<10||j<10);
}

}
