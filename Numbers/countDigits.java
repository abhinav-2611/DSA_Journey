package Numbers;
public class countDigits {
    
    public static void main(String[] args) {   
        int num= 12345;
        int count =0;
        while (num>0) {

            num= num/10;
            count++;
        }  
        System.out.println("number of digits " + count);
    }
}
