interface drawable
{
public void draw();
}
class rectangle implements drawable
{
public void draw()
{
System.out.println("rectangle");
}
}
class circle implements drawable
{
public void draw()
{
System.out.println("circle");
}
}
class name
{
public static void main(String args[])
{
rectangle r=new rectangle();
circle c=new circle();
r.draw();
c.draw();
}
}