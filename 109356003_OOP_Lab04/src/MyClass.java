public class MyClass
{
  void show(int a, char b)
  {
    System.out.println("KING KONG");
  }
  void show(char a, int b)
  {
    System.out.println("JIM JAM");
  }
  public static void main(String[] args)
  {
    MyClass test = new MyClass ();
    test.show(10, 'A');
    test.show('B', 10);
  }
}
