import java.util.LinkedList;
import java.util.List;

class Data{
    private Object object;
    public Data(Object object) {
        this.object = object;
    }
    @Override
    public String toString() {
//        return (String) object; //type casting as String to get the string as a output
        // above return statement will give error as we
        // are trying to cast object to string which is not possible with the given code generation method as we are using object as a parameter in the constructor and we are not using any type casting in the constructor so we can't use type casting here to get the string
        return object.toString(); //using toString method to get the string as a output
    }

}
class Name {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Name(String name) {
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {
        List<Data> element = new LinkedList<>();
        element.add(new Data("Akash"));
        element.add(new Data("K"));
        element.add(new Data(25));
        element.add(new Data(10.25));

        element.add(new Data(new Name("Kobal"))); // passing a custom object to the Data class new Name("Kobal") and then to the list element of type Data class .
        System.out.println(element);

        Data x = new Data("Hello World!");// always generate a constructor and a toString method for the Data class to get the string as a output.

        // with out the toString method in the Data class we will get the output as the address of the object in the memory(reference variable)
        // . (eg: Data@6d06d69c,Data@7852e922,Data@4e25154f,Data@70dea4e,Data@5c647e05 )

        Data x2 = new Data(new Name("Hello Java")); // this is going to give a output, because we generated a toString method in the Name class.
        // if we don't generate a toString method in the Name class we will get the output as the address of the object in the memory(reference variable)
        // (eg: Name@6d06d69c,Name@7852e922,Name@4e25154f,Name@70dea4e,Name@5c647e05 )
        System.out.println(x);
        System.out.println(x2);

//        String s = new Data("Hello World!"); this will generate error because
        // data is not a string type and we are trying to assign a string to a data type. so we can't do that. we have to use the toString method to get the string as a output.

        String s = new Data("Without custom class").toString(); // this is going to give a output, because we generated a toString method in the Name class.
        System.out.println(s);
        String s2 = new Data(new Name("with custom class")).toString(); // this is going to give a output, because we generated a toString method in the Name class.
        System.out.println(s2);

    }
}