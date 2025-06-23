public class TypeConversion {
    
    public static void main(String[] args) {
        
        // narrowing(explictly): converting larger datypes into smaller one

        double num1= 434.252d;
        int num2= (int) num1;
        System.out.println(num2);

        // widening(automatic): converting smaller data types into larger one
        float float_val= 344.723f;
          double double_val= float_val;
        System.out.println(double_val);

        // when we do arithmatic operation on different data types then the datatype of result will the datatype of operand with maximum size

        int a=10;
        float b=20.20f;
        double c=2638.273d;
        long d=7238213L; 
        System.out.println(a+b+c+d); // double has max size between all of them so result we get will be of double datatype
    }
}
