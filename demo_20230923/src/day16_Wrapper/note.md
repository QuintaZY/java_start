```java

/**
 * string  不可变字符序列，效率低，复用率高
 * string buffer 可变字符序列， 效率较高(增删)，线程安全
 * string builder 可变字符序列， 效率最高，线程不安全
 * */

```

```java
//1, 如果字符串存在大量的修改操作，一般使用string buffer或者string builder
//2, 如果字符串存在大量的修改操作，并在单线程的情况，使用string builder
//3, 如果字符串存在大量的修改操作，并在多线程的情况，使用string buffer
//4, 很少修改时，被多个对象引用，使用string。

```