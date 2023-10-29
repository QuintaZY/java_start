package day9_polyparameter_;

public class PloyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milman = new Manager("milman", 4000, 300);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showAnu(tom);
        ployParameter.showAnu(milman);

        ployParameter.testWork(tom);
        ployParameter.testWork(milman);

        "hello".equals("asdasd");
    }

    public void showAnu(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if(e instanceof Worker) {
            Worker worker = (Worker)e;
            worker.work();
        } else if (e instanceof Manager){
            Manager manager = (Manager) e;
            manager.manage();
        }
    }
}
