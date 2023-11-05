package day01_if;

public class day1_ifdemo {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int wine = sc.nextInt();
        if(wine > 2 ) {
            System.out.println("好"); 
        };*/
        //for (int i = 0; i < 10; i++) {
        //    System.out.println("123");
        //}
        int x = 1234;
        int num = 0;

        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num);
    }
}
