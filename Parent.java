/*class Parent
{
void show()
{
System.out.println("parent method");
}
}
class Child extends Parent
{
void show()
{
System.out.println("child method");
}
}
class Demo
{
public static void main(String[]args)
{
Child C=new Child();
C.show();
}
}*/
/*class Parent
{
void show()
{
System.out.println("this is parent");
}
}
class Child extends Parent
{
void show()
{
System.out.println(" this is child");
}
}
class Demo
{
public static void main(String[]args)
{
Child C=new Child();
C.show();
}
}*/
/*class Parent
{
void add(int a,int b)
{
System.out.println(a+b);
}
}
class Child extends Parent
{
void add(int a,int b,int c)
{
System.out.println(a+b+c);
}
}
class Demo
{
public static void main(String[]args)
{
Child C=new Child();
C.add(10,20);
C.add(10,20,30);
}
}*/

class Parent
{
void mul(int a,int b)
{
System.out.println(a*b);
}
}
class Child extends Parent
{
void mul(int a,int b,int c)
{
System.out.println(a*b*c);
}
}
class Demo
{
public static void main(String[]args)
{
Child C=new Child();
C.mul(10,20);
C.mul(10,20,30);
}
}
