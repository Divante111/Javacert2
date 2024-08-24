



public class StringBuilderExample {
    public static void main(String[] args) {
        String myString = "";
        for(char c = 'a'; c <= 'z'; c++){
            myString += c; // every iteration this creates a new string object
        }
        System.out.println(myString);

        //with string builder

        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++){
            sb.append(c); // add char to StringBuilder, reuses string builder without creating a string each time
        }
        System.out.println(sb);

        StringBuilder builder = new StringBuilder("start");

        builder.append("-middle");
        System.out.println(builder);
        System.out.println("*************************************");
        StringBuilder anotherBuilder = builder.append("-end");
        System.out.println(builder);
        System.out.println(builder);
        System.out.println("*************************************");
        System.out.println(builder == anotherBuilder);
        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherBuilder));
        
        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        myBuilder = new StringBuilder(100);
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        myBuilder.append("MyNewTest");
        System.out.println("size = " + myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b = b.append("is").append(" so ").append("Cool");
        System.out.println(a);
        System.out.println(b);

    }
    
}
