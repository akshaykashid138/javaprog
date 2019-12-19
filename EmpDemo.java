import java.util.*;

class Emp
{

   String firstnm;
   String lastnm;
   double mbno;
   int id;

   Emp()
   {
     firstnm="abc";
     lastnm="xyz";
     mbno=78877;
     id=15;
   }

   void input()
   {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter first name");
     firstnm=sc.nextLine();
     System.out.println("enter last name");
     lastnm=sc.nextLine();
     System.out.println("enter mbno");
     mbno=sc.nextDouble();
     System.out.println("enter id");
     id=sc.nextInt();

    }

    void output()
    {
      System.out.println("First name is:"+firstnm);
      System.out.println("Last name is:"+lastnm);
      System.out.println("mbno is:"+mbno);
      System.out.println("id is:"+id);

    }
}

class EmpDemo
{
   public static void main(String args[])
   {
     Emp d=new Emp();
     d.input();
     d.output();
    }
}     