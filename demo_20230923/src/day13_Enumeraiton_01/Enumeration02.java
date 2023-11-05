package day13_Enumeraiton_01;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Enumeration02 {
    public static void main(String[] args) {

    }
}

enum Season2 {

//    使用enum 实现枚举，需要写在定义常量前面
    SPRING("春天", "12312"), SUMMER("炎热", "hot");
    private String name;
    private String desc;

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
