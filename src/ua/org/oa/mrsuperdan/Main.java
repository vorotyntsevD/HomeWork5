package ua.org.oa.mrsuperdan;

public class Main {

    public static void main(String[] args) {
        SimpleList simpleList = new DynamicStringList(5);
        simpleList.add("Hello");
        simpleList.add("World");
        simpleList.add("It");
        simpleList.add("is");
        simpleList.add("Java");

        System.out.println(simpleList);

        System.out.println("----------");

        System.out.println(simpleList.get());

        System.out.println("----------");


        System.out.println(simpleList.get(3));

        System.out.println("----------");


        simpleList.remove();
        System.out.println(simpleList);

        System.out.println("----------");


        simpleList.remove(0);
        System.out.println(simpleList);

        System.out.println("----------");


        simpleList.delete();
        System.out.println(simpleList);
    }

}
