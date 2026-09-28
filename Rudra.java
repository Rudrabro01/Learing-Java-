class Rudra
{
    int marks;
    int roll_no;
    String name;

void display()
{
   System.out.println("Name: "+name);
   System.out.println("Roll No: "+roll_no);
   System.out.println("Marks: "+marks);

}
public static void main(String[] args) {
    Rudra s1=new Rudra();
    s1.name="Ravi";
    s1.roll_no=123;
    s1.marks=90;
    s1.display();
}
}