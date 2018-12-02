public class Hello{
    public static void main(String[] args){
        System.out.println("CodeIgniter is the easy framework ..");
         view("CodeIgniter Version 3.1.3");
    }

    public static void view(String name){
      System.out.println("Welcome To " + name);
    }
}