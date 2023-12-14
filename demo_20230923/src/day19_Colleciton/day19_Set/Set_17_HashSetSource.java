package day19_Colleciton.day19_Set;

import java.util.HashSet;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Set_17_HashSetSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("lksdhqa");
        hashSet.add("jsdfj");
        hashSet.add("javac");
        System.out.println("set="+ hashSet);


        // * 1
        // *
        // * 2
        // * public boolean add(E e) {
        //       return map.put(e, PRESENT)==null;    // private static final Object PRESENT = new Object();
        //   }
        // * 3   这里会执行 hash(key)   得到对应的key的hash值  算法
        // * public V put(K key, V value) {  // key= 'java'  value=PRESENT
        //     return putVal(hash(key), key, value, false, true);
        // }
        // * 4 执行 putVal
        // * final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
        //            boolean evict) {
        //         Node<K,V>[] tab; Node<K,V> p; int n, i;  // 定义了辅助变量
        //         * // table就是 hashmap的一个数组 类型是 Node[]
        //         * // if语句表示如果当前table是null  或者 大小=0
        //         * // 就是第一次扩容  到16个空间
        //         if ((tab = table) == null || (n = tab.length) == 0)
        //             n = (tab = resize()).length;
        //         * // 1，根据key  得到hash  计算key 存放到table表的那个索引位置
        //         * // 吧这个位置的对象，复制给p
        //         * // 2，判断是否为空
        //         * // 2，1  如果空  表示没有存放元素  就创建一个node
        //         * // 2，2  就放在该位置  tab[i] = newNode(hash, key, value, null);
        //         if ((p = tab[i = (n - 1) & hash]) == null)
        //             tab[i] = newNode(hash, key, value, null);
        //         else {
        //             Node<K,V> e; K k;
        //             //  如果当前索引位置对应的链表的第一个元素和准备添加的key的hash一样
        //             // 并且满足两个之一 ：
        //             // （1） 准备加入的key 和p只想的Node结点的key是同一个对象
        //             // （2） p 指向的Node节点的key 的equals() 和准备加入的key比较后相同
        //             if (p.hash == hash &&
        //                 ((k = p.key) == key || (key != null && key.equals(k))))
        //                 e = p;
        //             else if (p instanceof TreeNode)
        //                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        //             else {
        //                 for (int binCount = 0; ; ++binCount) {
        //                     if ((e = p.next) == null) {
        //                         p.next = newNode(hash, key, value, null);
        //                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
        //                             treeifyBin(tab, hash);
        //                         break;
        //                     }
        //                     if (e.hash == hash &&
        //                         ((k = e.key) == key || (key != null && key.equals(k))))
        //                         break;
        //                     p = e;
        //                 }
        //             }
        //             if (e != null) { // existing mapping for key
        //                 V oldValue = e.value;
        //                 if (!onlyIfAbsent || oldValue == null)
        //                     e.value = value;
        //                 afterNodeAccess(e);
        //                 return oldValue;
        //             }
        //         }
        //         ++modCount;
        //         if (++size > threshold)
        //             resize();
        //         afterNodeInsertion(evict);
        //         return null;
        //     }
        // *
    }
}
