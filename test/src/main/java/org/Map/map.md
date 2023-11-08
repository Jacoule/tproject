### Map
#### Map<K,V>接口实现类 ：
- 1、HashMap<K,V> ：无序、不重复、无索引 （用的最多）
- 2、LinkedHashMap<K,V> ： 有序不重复、无索引
- 3、TreeMap<K,V> ：按照键的大小从到大排序、不重复、无索引
- Map的key是不能重复的，适合存储一一对应的数据，
- 特点：都是由键决定的，值只是一个附属品，值是不做要求的

### Map 集合的遍历方式
- 1、键找值  用到的方法 keySet()  get()
- 2、键值对（看成一个整体） entrySet<K,V>
  Entry(K,V) 接口  getKey() getValue()
- 3、 Lambda 表达式
 ### 自定义的类作为 key 重写 hashcode 和 equals 方法
