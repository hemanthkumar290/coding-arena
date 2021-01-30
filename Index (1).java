
/// Program to check for an Sequence of numbers form a pallindrome or  not
/// Time complexity-- O(n) and Space complexity is O(n)
/// Approach-- Using a Linked List to store elements and then to stack and comparing ..

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.ListIterator;
import java.util.LinkedList;

class Main
{
public static void main(String[]  args)
{
Scanner s= new Scanner(System.in);
System.out.println("Hey Hemanth!!enter the size of array");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements of array");
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int size=a.length;
createLL(a,size);
}
public static void createLL(int a[],int size)
{
LinkedList<Integer> l=new LinkedList<>();
for(int i=0;i<size;i++)
{
	Integer x =a[i];
	l.add(x);
}
System.out.println(l);
Stack<Integer> s=new Stack<>();
ListIterator itr = l.listIterator();
while(itr.hasNext())
{
	int x=(Integer)itr.next();
	s.push(x);
}
ListIterator itr1= l.listIterator();
while(itr1.hasNext()&& (!s.empty()))
{
    int x1=(Integer)itr1.next();
	Integer stacktop = (Integer)s.peek();
	if(stacktop==x1)
	{
 	s.pop();
	}
}
if(s.empty())
{
 System.out.println("Congo !!the sequence is pallindrome!!");
}
else 
 System.out.println("Sorry!!the sequence is not a pallindrome");
}
}
 