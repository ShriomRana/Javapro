import java.util.*;
class programer
{
    public void user()
    {
        System.out.println("wright the program");
    }
}
class demo extends programer
{
public void coder()
{
System.out.println("hello programer");
}
}
class main {
 public static void main(String[]args){
demo shri = new demo();
shri.coder();
programer c = new programer();
c.user();
}
}

