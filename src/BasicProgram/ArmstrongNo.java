package BasicProgram;

public class ArmstrongNo {
    public static void main(String[] args) {
        int no = 371;
        int temp = no;
        int sum = 0;
        int res;
        while (no > 0){

            res = no%10;
            sum = sum+(res*res*res);
            no = no/10;

        }
        if (temp == sum){
            System.out.println(sum+" The number is Armstrong Number");
        }
        else {
            System.out.println(sum+" is not a Armstrong number");
        }
    }
}
