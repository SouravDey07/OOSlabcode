import java.util.Scanner;
public class Time
{
	int h,m,s;
	Time()
	{
		h=0;
		m=0;
		s=0;
	}
	Time(int a,int b,int c)
	{
		h=a;
		m=b;
		s=c;
	}
	public Time Add(Time c)
	{
		Time ob=new Time();
		ob.h=h+c.h;
		ob.m=m+c.m;
		ob.s=s+c.s;
		if(ob.s>=60)
		{
			ob.s=ob.s-60;
			ob.m=ob.m+1;
		}
		 if(ob.m>=60)
                {                                                                                                                                                                   ob.m=ob.m-60;
                        ob.h=ob.h+1;                                                                                                                                        }
		return ob;
	}
	public void display()
	{
		System.out.println(h+" hr "+m+" min "+s+" sec");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int h1=sc.nextInt();
		int m1=sc.nextInt();
		int s1=sc.nextInt();
		int h2=sc.nextInt();
		int m2=sc.nextInt();
		int s2=sc.nextInt();
		Time ob1=new Time(h1,m1,s1);
		Time ob2=new Time(h2,m2,s2);
		Time ob3=new Time();
		ob3=ob1.Add(ob2);
		ob1.display();
		ob2.display();
		ob3.display();
	}
}
