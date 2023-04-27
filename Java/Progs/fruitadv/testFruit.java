package com.app.fruit;

import java.util.Scanner;
import static java.lang.System.*;
public class testFruit
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		out.println("Enter number of fruits in basket");
		Fruit[] basket=new Fruit[sc.nextInt()];
		int index=0;
		int ch;
		out.println("1.Add mango\n2.add Orange\n3.Add Apple\n4.Display names\n5.Display Details\n6.Mark Stale\n7.Sour fruits as stale\n8.Special Functionality\n9.Exit");
		out.println("Enter choice");
		do
		{
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					if(index<basket.length)
					{
						out.println("Enter Name,Color and weight");
						basket[index++]=new Mango(sc.next(),sc.next(),sc.nextDouble());
						System.out.println("Mango added into basket");						
					}
					else
					{
						System.out.println("Array full");
					}
				}break;
				
				case 2:
				{
					if(index<basket.length)
					{
						out.println("Enter Name,Color and weight");
						basket[index++]=new Orange(sc.next(),sc.next(),sc.nextDouble());
						System.out.println("Orange added into basket");						
					}
					else
					{
						System.out.println("Array full");
					}
				}break;
				
				case 3:
				{
					if(index<basket.length)
					{
						out.println("Enter Name,Color and weight");
						basket[index++]=new Apple(sc.next(),sc.next(),sc.nextDouble());
						System.out.println("Apple added into basket");						
					}
					else
					{
						System.out.println("Array full");
					}
				}break;
				
				case 4:
				{
					for(Fruit f:basket)
					{
						if(f!=null)
						System.out.print(" Name: "+f.getName());
					}
				}break;
				
				case 5:
				{
					for(Fruit f:basket)
					{
						if(f!=null)
						System.out.println(f);
					}
				}break;
				
				case 6:
				{
					for(int i=0;i<=index;i++)
					{
						System.out.println((i+1)+")"+basket[i].getName());
					}
					System.out.println("Enter index to make it stale");
					int key=sc.nextInt();
					if(key<index)
					{
						basket[key-1].setStale();
						System.out.println("Fresh:"+basket[key-1].isFresh());
					}
					else
					{
						System.out.println("invalid id");
					}
					
				}break;
				
				case 7:
				{
					for(Fruit f:basket)
					{
						if(f!=null)
						{
						if(f.taste().contains("sour"))
						{
							f.setStale();
							System.out.println("Name:"+f.getName()+"Fresh:"+f.isFresh());
						}
						}
					}
				}break;
				
				case 8:
				{
					for(Fruit f:basket)
					{
						if(f!=null)
						{
							if(f instanceof Apple)
							{
								((Apple)f).jam();
							}
							else if(f instanceof Mango)
							{
								((Mango)f).pulp();
							}
							else if(f instanceof Orange)
							{
								((Orange)f).juice();
							}
						}
					}
				}break;
				
				case 9:
				{
					System.out.println("Exiting application....");
				}break;
				
				default:
					System.out.println("Invalid choice");
			
			}//switch
		}while(ch!=10);
	
	}


}
