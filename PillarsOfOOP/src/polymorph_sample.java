import java.util.Scanner;

/*class Poly{
    public void create(){
        System.out.print("This is a polygon");
    }
}
class square extends Poly{
    public void create(){
        System.out.print("This is a square");
    }
}
class circle extends Poly{
    public void create(){
        System.out.print("This is a circle");
    }
}*///Just sample codes dw dw

class asker {
    Scanner in = new Scanner(System.in);
    String name;
    int age;
    public void ask(){
        System.out.print("May I please know your name? ");
        name = in.nextLine();
        System.out.print("Good day " + name);
    }
}
class askAge extends asker{
    @Override
    public void ask(){
        System.out.print(" How old are you right now? ");
        age = in.nextInt();
        System.out.print("Oh, so you are now " + age +" years old.");
    }
}

class display {
    public void show(){
        for (int i = 0; i < 10; i++){
            System.out.print("* ");
        }
    }

    public void show(String Symbol){
        for (int i = 0; i < 10; i++){
            System.out.print("@ ");
        }
    }
}
public class polymorph_sample {

    public static void main (String[] args){
        asker qs = new asker();     //Overriding methods
        askAge qa = new askAge();
        qs.ask();
        qa.ask();
        System.out.println();
        display ds = new display(); //Overloading methods
        ds.show();
        System.out.println();
        ds.show("#");
    }
}
