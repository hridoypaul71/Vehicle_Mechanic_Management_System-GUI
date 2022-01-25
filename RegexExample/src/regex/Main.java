package regex;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        String s = "Welcome to https://www.lus.sc.bd Leading University";

        Pattern pattern = Pattern.compile("https?:\\/\\/[w]{3}[\\w.]*");

        Matcher matcher = pattern.matcher(s);
        s = matcher.replaceAll("");
        System.out.println(s);
    }
}





//1 st 0 chara hobe
/*public class Main {
    public static void main(String[] args){
        System.out.println("Enter your email:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        String str2 = "[a-z]{3}_[^0]{1}[0-9]{9}@lus.ac.bd";

        Pattern pattern = Pattern.compile(str2);
        Matcher matcher = pattern.matcher(str);

        boolean f = matcher.matches();
        if (f){
            System.out.println("Valid");
        }
        else {
            System.out.println("invalid");
        }
    }
}*/



//email varification
/*public class Main {
    public static void main(String[] args){
        System.out.println("Enter your email:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        String str2 = "[a-z]_[0-9]{14}@lus.ac.bd";

                Pattern pattern = Pattern.compile(str2);
                Matcher matcher = pattern.matcher(str);

                boolean f = matcher.matches();
                if (f){
                    System.out.println("Valid");
                }
                else {
                    System.out.println("invalid");
                }
    }
}*/









/*public class Main {

    public static void main(String[] args) {
	// write your code here

        Pattern pan = Pattern.compile("Bangla");
        Matcher mat = pan.matcher("Bangladesh");

        /*boolean f = mat.matches();

        if(f){
            System.out.println("matched");
        }
        else{
            System.out.println("not matched");
        }*/

   /*     boolean f = mat.find();

        if(f){
            System.out.println("find");
        }
        else{
            System.out.println("not find");
        }
    }
}*/