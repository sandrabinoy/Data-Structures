package problems.parantheses;

public class Main {

    public static void main(String[] args) {

        String s = "()[]{}";
        ValidParantheses parantheses = new ValidParantheses();
        System.out.println(parantheses.validParantheses(s));

    }

}
