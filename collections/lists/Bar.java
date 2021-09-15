package lists;


class Foo {

    Foo(){

           System.out.print("Foo");

   }

   

}

public class Bar extends Foo{

   Bar(){

           System.out.print("Bar");

   }

   public static void main(String[] args) {

           Bar fb = new Bar();

   }

}