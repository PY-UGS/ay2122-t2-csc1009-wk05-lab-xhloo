abstract class Shape
{
    double dim1;
    double dim2;
    // final static means that once the variable is assigned
    // with a value it can never be changed
    final static double PI = 3.14;
    
    public Shape(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // sub/child classes to have this method but the values inside can be change by them
    public abstract double area();
}