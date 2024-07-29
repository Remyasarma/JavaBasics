package com.shristi.overloading;

public class VarargsDemo {
	
String name; 
    
   
    VarargsDemo()
    {
        this.name = "Guest";
    }
    
    VarargsDemo(String name)
    {
        this.name = name;
    }
    
    void greetUser(String... messages) 
    {
        for (String message : messages) 
        {
            System.out.println(message + " " + name);
        }
    }

    void sayHello(String... names) 
    {
        for (String name : names) 
        {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        VarargsDemo demo = new VarargsDemo("Ram");
        demo.greetUser("Welcome", "Great day");
        demo.greetUser("Good Day", "Have Tea");
        
        VarargsDemo demo1 = new VarargsDemo();
        demo1.sayHello("Sri");
        demo1.sayHello("Sri", "Priya", "Reena", "Rohan");
        demo1.sayHello("Jo", "Roni");
    }

}
