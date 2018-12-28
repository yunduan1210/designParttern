# designParttern
### 单例模式

定义：保证一个类仅有一个实例，并提供一个全局访问点

类型：创建型

适用场景：想确保任何情况下都绝对只有一个实例

优点：
* 在内存里只有一个实例，减少了内存开销
* 可以便面对资源的多重占用
* 设置全局访问点，严格控制访问

缺点：
* 没有接口，扩展困难

重点：
* 私有构造器
* 线程安全
* 延迟加载
* 序列化和反序列化安全
* 反射   lazy无法解决反射问题

单例容器hashmap线程不安全

例子：
* Runtime 
* getDesktop容器单例
* AbstractFactoryBean  getObject  
* ErrorContext 线程隔离(mybatis)
