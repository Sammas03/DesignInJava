# 设计模式

## 设计模式七大原则

### 1.开闭原则（open close）

* 对扩展开放，对修改关闭
  * 编写软件比如类、模块、方法

* 使用抽象进行构建，使用实现扩展细节
* 面向抽象编程
* 提高软件系统可复用

Human接口 -> Student类(implement Human) -> HighSchoolStudent类(extends Student)

### 2.依赖倒转原则（dependency Inversion）

* 是开闭原则的基础，针对接口进行编程
* 依赖抽象，而不是具体实现
* 可以减少类与类之间耦合性，提高系统稳定性，提高代码可读性
* 降低修改程序造成的风险

Human接口 -> Programmer抽象类（implement Human）

JavaProgrammer类 （extends Programmer）

TestProgrammer类（extends Programmer）



###  3.单一原则（Single responsibility）

* 一个类、接口、方法只负责一项职责

* 降低程序的复杂度，提高可维护性，降低变更所带来的风险

  

### 4.接口隔离原则（Interface Segregation）

* 用多个接口，而不是单一接口
* 尽量细化接口，接口中的方法尽量少
* 提高扩展性，符合低耦合的设计思想

### 5.迪米特原则（Demeter）

* 一个对象应该对其他对象保持最少的了解

* 强调只和成员变量或方法中输入或输出的参数进行交流

### 6.里氏替换原则（liskovsub situation）

* 是继承复用的基石，对开闭原则的补充
* 子类可以扩展父类的功能，但是不能修改父类原有的功能
* 子类可以实现父类的抽象方法，但是不能覆盖原有父类的方法
* 子类可以增加自己持有的方法
* 增加程序的健壮性