class Point
{
    private int x;
    private int y;
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x,int y)// constructor
    {
        this.x = x;
        this.y = y;
    }
    // set and get methods
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public String toString()
    {
        return "Point("+getX() +","+getY()+")";
    }
};
class Circle extends Point
{

    private int radius;

    public Circle()
    {
        super(0,0);
        radius = 0;

    }
    public Circle(int x,int y,int radius)// constructor
    {
        super(x,y);
        this.radius = radius ;
    }

    // set and get methods
    public int getRadius()
    {
        return radius;
    }


    public double getArea() //compute the area of the circle
    {
        double area;
        area = 3.14*radius*radius;
        return area;
    }
    public double getPerimeter() //compute the perimeter of circle
    {
        return 2*3.14*radius;
    }
    public String toString()
    {
        return "Circle : Center :"+ getX() +","+ getY() +" radius :"+getRadius() ;
    }
}


class Rectangle extends Point
{

    private int length,width;

    public Rectangle()
    {
        super(0,0);
        length = 0;
        width = 0;
    }
    public Rectangle(int x,int y,int length,int width)
    {
        super(x,y);
        this.length = length;
        this.width = width;
    }
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }

    public void setLength(int length)
    {
        this.length = length;
    }
    public double getArea() //compute the area of the square.
    {
        double area;
        area = length * width;
        return area;
    }

    public String toString()
    {
        return "Rectangle : Top left Point :"+ getX() +","+ getY() +" length :"+getLength() +" width : "+getWidth();
    }
}

class Cube extends Point
{
    private Point p;
    private int depth;

    public Cube()
    {
        super(0,0);
        depth = 0;

    }
    public Cube(int x,int y,int depth)// constructor
    {
        super(x,y);
        this.depth = depth;
    }

    // set and get methods
    public int getDepth()
    {
        return depth;
    }

    public Point getPoint()
    {
        return this.p;
    }
    public double getArea() //compute the area of the cube
    {
        double area;
        area = 6*getDepth()*getDepth();
        return area;
    }
    public double getVolume() //compute the volume of the cube
    {
        double vol;
        vol = getDepth() * getDepth() * getDepth();
        return vol;
    }
    public String toString()
    {
        return "Cube : Top left Point :"+ getX() +","+ getY() +" depth :"+getDepth() ;
    }
}

class GeometricTest
{
    public static void main (String[] args)
    {


        Circle circle = new Circle(3,-1,6);
        System.out.println(circle.toString());
        System.out.println("Area of Circle = "+circle.getArea());


        Rectangle r = new Rectangle(1,2,4,5);
        System.out.println(r.toString());
        System.out.println("Area of Rectangle = "+r.getArea());


        Cube c = new Cube(4,5,2);

        System.out.println(c.toString());
        System.out.println("Area of cube = "+c.getArea());
        System.out.println("Volume of cube = "+c.getVolume());



    }

}
