public class Main {
    public static void main(String[] args) {

        Class newclass=new Class(2,"Student",new int[]{3});

        System.out.println("Class:");

        System.out.println(newclass.getNumber());
        System.out.println(newclass.getSoz());
        System.out.println(newclass.getArray());


    }
}