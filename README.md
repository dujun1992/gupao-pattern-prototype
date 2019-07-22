【原型模式】指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。调用者不需要知道任何创建细节，不调用构造函数。
                   适用于以下场景：
                     1、类初始化消耗资源较多。
                     2、new产生的一个对象需要非常繁琐的过程（数据准备、访问权限等） 
                     3、构造函数比较复杂。
                     4、循环体中生产大量对象时。
                原型模式缺点：对克隆复杂的对象或克隆出的对象进行复杂改造时，易带来风险。深克隆、浅克隆要运用得当。
【浅克隆】只是完整复制了值类型数据，没有赋值引用对象。换言之，所有的引用对象仍然指向原来的对象。
                 方法一：简单工厂将getter、setter封装到某个方法中
                 方法二：JDK提供的实现Cloneable接口，实现快速复制。
                 <注意>当被使用super.clone()克隆的类中有引用对象时，这些克隆出来的引用对象的地址还是之前的，即浅克隆
【深克隆】内存中完成，字节码操作。单例被破坏的问题（不实现Cloneable接口；要么我们重写clone()方法，在clone方法中返回单例对象即可）
  
  public Test deepClone(){
         try{
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);
                oos.writeObject(this);

                ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bis);

                Test copy = (Test)ois.readObject();
                return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
