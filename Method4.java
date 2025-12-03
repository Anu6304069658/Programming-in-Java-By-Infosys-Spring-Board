class Rectangle
{
    float length;
    float width;
    public double calculateArea()
    {
        double area=length*width;
        return Math.round(area * 100.0) / 100.0;
    }
    public double calculatePerimeter()
    {
        double perimeter=2*(length+width);
        return Math.round(perimeter * 100.0) / 100.0;
    }
}
public class Method4 {
    public static void main(String1[] args) {
        Rectangle r=new Rectangle();
        r.length=12f;
        r.width=5f;
        double a=r.calculateArea();
        double p=r.calculatePerimeter();
        	System.out.println("Area of the rectangle is: "+a);
		System.out.println("Perimeter of the rectangle is: "+p );
    }
}
