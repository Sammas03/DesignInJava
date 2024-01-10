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

### 7.合成复用原则（Composition aggregation)

* 尽量使用组合、聚合的方式，而不是使用继承关系达到软件复用的目的
* 可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响较小



## 设计模式

* 创建型模式：
  * 隐藏了创界对象的过程，通过逻辑方法进行创建对象，而不是new
    * 工厂方法模式（factorymethod）：对于相同系列的类
      * 定义一个接口或者一个抽象的工厂类，让它实现类（工厂）来决定创建哪一个实例对象
      * 根据每个工厂的不同方法，来产生不同的所需要的对象
    * 抽象工厂模式（abstractfactory）：对于不相同系列的类
      * 类似公司下的产品，进行生产。
      * 例如生产汽车，将汽车分为各个零部件生产，但都是在公司内生产的不同产品。
      * 提供了一个创建一系列相关或互相依赖对象的接口
    * 单例模式
    * 建造者模式（builder）
      * 将复杂的对象的创建和属性赋值所分离
      * 建造的过程和细节我们不需要知道
    * 原型模式
* 结构型模式：
  * 主要关注类和对象的组合关系
  * 继承的概念被用来组合接口和定义组合对象，获得新的功能方式
* 行为型模式：
  * 主要关注对象之间的通信

除了以上23种外：简单工厂模式（simple factory），由哪一个工厂决定创建哪一种产品的实例

​					
