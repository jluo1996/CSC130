package Generic;

public class AddNum {
    public static void main(String[] args){
        int x = 1;
        int y = 2;

        add(x, y);
    }

    public static <T extends Number> void add(T num1, T num2){
        if(num1 == null || num2 == null){
            System.out.println("A NUMBER NEEDED!");
        }

        else if(num1 instanceof Integer && num2 instanceof Integer){
            double total = num1.doubleValue() + num2.doubleValue();
            System.out.println(num1 + " + " + num2 + " = " + total);
        }

        else{
            throw new IllegalArgumentException("Type " + num1.getClass() + " is not a supported by this method!");
        }
    }
}
