public class day2_fundemo {
    public static void main(String[] args) {
//        方法定义和调用
//      playGame();
        int a = getSum(10, 13);
        System.out.println(a);
    }

    //    fun1
    public static void playGame() {
        System.out.println("选人了");
    }

    public static int getSum(int num1, int num2) {
        int result = 0;
        if (num1 == 10) {
            result = num1 + num2;
        }
        return result;
    }


}
