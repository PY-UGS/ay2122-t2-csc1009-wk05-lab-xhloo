public class Triangle extends Shape
{
    public Triangle(double dim1, double dim2)
    {
        super(dim1, dim2);
    }
    
    public double area()
    {
        return (dim1 * dim2) / 2;
    }
}
