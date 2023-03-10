package educoder.Java面向对象_封装_继承和多态.第2关_什么是继承_怎样使用继承;

public class extendsTest {
    public static void main(String args[]) {
        // 实例化一个Cat对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Cat cat=new Cat();
        cat.setName("大花猫");
        cat.setAge(6);
        cat.voice();
        cat.eat();
        System.out.println(cat.getName()+cat.getAge()+"岁");
        /********* end *********/

        // 实例化一个Dog对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Dog dog=new Dog();
        dog.setName("大黑狗");
        dog.setAge(8);
        dog.voice();
        dog.eat();
        System.out.println(dog.getName()+dog.getAge()+"岁");
        /********* end *********/

    }
}

class Animal {
    /********* begin *********/
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /********* end *********/

}

class Cat extends Animal {
    // 定义Cat类的voice()和eat()方法
    /********* begin *********/
    public void voice(){
        System.out.println(getName()+"喵喵叫");
    }
    public void eat(){
        System.out.println(getName()+"吃鱼");
    }
    /********* end *********/
}

class Dog extends Animal {
    // 定义Dog类的voice()和eat()方法
    /********* begin *********/
    public void voice(){
        System.out.println(getName()+"汪汪叫");
    }
    public void eat(){
        System.out.println(getName()+"吃骨头");
    }
    /********* end *********/
}