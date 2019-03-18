# 原型模式：当创建对象比较复杂，或频繁创建对象时可以使用原型模式。
## 浅克隆
#### 在克隆方法中创建对象并将需要克隆的对象的值赋给新创建的对象，类似于简单工厂模式。
#### PS：克隆出的对象只是持有原对象的地址，两个对象其实是同一个对象。
## 深克隆
#### 使用字节码流将对象序列化成字节码存在内存中，再从内存中读取字节码反序列化成对象，该过程创建了新的对象，和原对象不是同一个对象。
