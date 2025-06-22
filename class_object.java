class Rectangle
{
    int length, width;
    void getDetails(int x, int y)
    {
        length = x;
        width = y;
    }
    int area()
    {
        int a = length*width;
        return a;
    }
}

public class class_object
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        r.getDetails(10, 20);
        int area = r.area();
        System.out.print(area);
        r.length = 30; // Modifying the length
        r.width = 40;  // Modifying the width
        area = r.area(); // Recalculating area after modification
        System.out.print(" " + area); // Output the new area
    }
}