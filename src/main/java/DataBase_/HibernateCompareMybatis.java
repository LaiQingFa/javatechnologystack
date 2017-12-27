package DataBase_;

public class HibernateCompareMybatis {
/*

Hibernate与 MyBatis的比较

2017.12.27

http://blog.csdn.net/firejuly/article/details/8190229

Hibernate和MyBatis都有相应的代码生成工具。可以生成简单基本的DAO层方法;
针对高级查询，Mybatis需要手动编写SQL语句，以及ResultMap。而Hibernate有良好的映射机制，开发者无需关心SQL的生成与结果映射，可以更专注于业务流程。

Hibernate缓存
Hibernate一级缓存是Session缓存，利用好一级缓存就需要对Session的生命周期进行管理好。建议在一个Action操作中使用一个Session。一级缓存需要对Session进行严格管理。

Hibernate二级缓存是SessionFactory级的缓存。 SessionFactory的缓存分为内置缓存和外置缓存。
内置缓存中存放的是SessionFactory对象的一些集合属性包含的数据(映射元素据及预定SQL语句等),
对于应用程序来说,它是只读的。外置缓存中存放的是数据库数据的副本,其作用和一级缓存类似.
二级缓存除了以内存作为存储介质外,还可以选用硬盘等外部存储设备。
二级缓存称为进程级缓存或SessionFactory级缓存，它可以被所有session共享，
它的生命周期伴随着SessionFactory的生命周期存在和消亡。


两者相同点
Hibernate与MyBatis都可以是通过SessionFactoryBuider由XML配置文件生成SessionFactory，然后由SessionFactory 生成Session，最后由Session来开启执行事务和SQL语句。其中SessionFactoryBuider，SessionFactory，Session的生命周期都是差不多的。
Hibernate和MyBatis都支持JDBC和JTA事务处理。
Mybatis优势
MyBatis可以进行更为细致的SQL优化，可以减少查询字段。
MyBatis容易掌握，而Hibernate门槛较高。
Hibernate优势
Hibernate的DAO层开发比MyBatis简单，Mybatis需要维护SQL和结果映射。
Hibernate对对象的维护和缓存要比MyBatis好，对增删改查的对象的维护要方便。
Hibernate数据库移植性很好，MyBatis的数据库移植性不好，不同的数据库需要写不同SQL。
Hibernate有更好的二级缓存机制，可以使用第三方缓存。MyBatis本身提供的缓存机制不佳。



 JDBC：
   我们平时使用jdbc进行编程，大致需要下面几个步骤：
   1，使用jdbc编程需要连接数据库，注册驱动和数据库信息
   2，操作Connection，打开Statement对象
   3，通过Statement对象执行SQL，返回结果到ResultSet对象
   4，使用ResultSet读取数据，然后通过代码转化为具体的POJO对象
   5，关闭数据库相关的资源
  jdbc的缺点：
  一：工作量比较大，需要连接，然后处理jdbc底层事务，处理数据类型，还需要操作Connection，Statement对象和ResultSet对象去拿数据并关闭他们。
   二：我们对jdbc编程可能产生的异常进行捕捉处理并正确关闭资源

   由于JDBC存在的缺陷，在实际工作中我们很少直接使用jdbc进行编程，用的更多的是ORM对象关系模型来操作数据库，Hibernate就是一个ORM模型
     Hibernate：
    Hibernate是建立在若干POJO通过xml映射文件（或注解）提供的规则映射到数据库表上的。我们可以通过POJO直接操作数据库的数据，他提供的是一种全表映射的模型。相对而言，Hibernate对JDBC的封装程度还是比较高的，我们已经不需要写SQL，只要使用HQL语言就可以了。
    使用Hibernate进行编程有以下好处：
    1，消除了代码的映射规则，它全部分离到了xml或者注解里面去配置。
    2，无需在管理数据库连接，它也配置到xml里面了。
    3，一个会话中不需要操作多个对象，只需要操作Session对象。
    4，关闭资源只需要关闭一个Session便可。
    这就是Hibernate的优势，在配置了映射文件和数据库连接文件后，Hibernate就可以通过Session操作，非常容易，消除了jdbc带来的大量代码，大大提高了编程的简易性和可读性。Hibernate还提供了级联，缓存，映射，一对多等功能。Hibernate是全表映射，通过HQL去操作pojo进而操作数据库的数据。

    Hibernate的缺点：
    1，全表映射带来的不便，比如更新时需要发送所有的字段。
    2，无法根据不同的条件组装不同的SQL。
    3，对多表关联和复杂的sql查询支持较差，需要自己写sql，返回后，需要自己将数据封装为pojo。
    4，不能有效的支持存储过程。
    5，虽然有HQL，但是性能较差，大型互联网系统往往需要优化sql，而hibernate做不到。


Mybatis：
    为了解决Hibernate的不足，Mybatis出现了，Mybatis是半自动的框架。之所以称它为半自动，是因为它需要手工匹配提供POJO，sql和映射关系，而全表映射的Hibernate只需要提供pojo和映射关系即可。
   Mybatis需要提供的映射文件包含了一下三个部分：sql，映射规则，pojo。在Mybatis里面你需要自己编写sql，虽然比Hibernate配置多，但是Mybatis可以配置动态sql，解决了hibernate表名根据时间变化，不同条件下列不一样的问题，同时你也可以对sql进行优化，通过配置决定你的sql映射规则，也能支持存储过程，所以对于一些复杂和需要优化性能的sql查询它就更加方便。Mybatis几乎可以做到jdbc所有能做到的事情。

什么时候使用Hibernate，Mybatis
    Hibernate作为留下的Java orm框架，它确实编程简易，需要我们提供映射的规则，完全可以通过IDE生成，同时无需编写sql确实开发效率优于Mybatis。此外Hibernate还提供了缓存，日志，级联等强大的功能，但是Hibernate的缺陷也是十分明显，多表关联复杂sql，数据系统权限限制，根据条件变化的sql，存储过程等场景使用Hibernate十分不方便，而性能又难以通过sql优化，所以注定了Hibernate只适用于在场景不太复杂，要求性能不太苛刻的时候使用。
    如果你需要一个灵活的，可以动态生成映射关系的框架，那么Mybatis确实是一个最好的选择。它几乎可以替代jdbc，拥有动态列，动态表名，存储过程支持，同时提供了简易的缓存，日志，级联。但是它的缺陷是需要你提供映射规则和sql，所以开发工作量比hibernate要大些。


jdbc,mybatis,hibernate的区别
1）从层次上看，JDBC是较底层的持久层操作方式，而Hibernate和MyBatis都是在JDBC的基础上进行了封装使其更加方便程序员对持久层的操作。
2）从功能上看，JDBC就是简单的建立数据库连接，然后创建statement，将sql语句传给statement去执行，如果是有返回结果的查询语句，会将查询结果放到ResultSet对象中，通过对ResultSet对象的遍历操作来获取数据；Hibernate是将数据库中的数据表映射为持久层的Java对象，对sql语句进行修改和优化比较困难；MyBatis是将sql语句中的输入参数和输出参数映射为java对象，sql修改和优化比较方便.
3）从使用上看，如果进行底层编程，而且对性能要求极高的话，应该采用JDBC的方式；如果要对数据库进行完整性控制的话建议使用Hibernate；如果要灵活使用sql语句的话建议采用MyBatis框架。


https://www.cnblogs.com/rzqz/p/7266092.html




解释Spring中的IOC?

IOC:Inversion of Control控制反转，也叫（Dependency Injection）依赖注入， dao接口的实现不再是业务逻辑层调用工厂类去获取，而是通过容器（spring）来自动的为我们的业务层设置Dao的实现类，这样整个过程就反过来，以前是我们业务层主动去获取dao，而现在是dao主动被设置到业务逻辑层中来了，这个也就是反转控制的由来。通过IOC，我们就可以在不修改任何代码的情况下，无缝地实现数据库的换库迁移
简单一点说：
IOC就是一个生产和管理bean的容器就行了，原来需要在调用类中new的东西，现在都是通过容器生成，同时，要是产生的是单例的bean，他还可以给管理bean的生命周期。

解释Spring中的AOP?

AOP面向切面编程将程序中的交叉业务逻辑（比如安全，日志，事务），封装成一个切面，然后注入到目标业务逻辑中去。
比如：很多方法都可能会抛异常，你要记录这个异常到日志中去，可以写个拦截器，在这个类中记录日志，在spring.xml中配置一个记录这些日志的方法的拦截器，在这个方法执行后调用这个拦截器，记录日志。这样就不用每次抛异常都要手动记录日志。
spring的事务管理用到的就是AOP这样也可以提高程序的内聚性。


Spring中有哪三种依赖注入的方式？

spring有三种注入方式：
1）根据属性注入也叫set方法注入
2）根据构造方法注入
3）根据注解进行注入（推荐）

Spring框架的优点？

Spring的AOP和IOC都是为了解决系统代码耦合度过高的问题，使代码重用度高，易于维护。


http://blog.csdn.net/snn1410/article/details/45167979
    */
}
