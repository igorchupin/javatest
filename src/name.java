import java.util.Locale;

public class name {
    public class GreetMe{
        public  String greet(String name){

            name = name.toLowerCase();
            String name2 = name.toUpperCase();

            name = name.replace(name.charAt(0), name2.charAt(0));

            return ("Hello " + name + '!');
        }
    }
}
