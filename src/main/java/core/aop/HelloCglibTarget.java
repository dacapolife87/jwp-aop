package core.aop;

public class HelloCglibTarget {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayHi(String name) {
        return "Hi " + name;
    }

    public String sayThankYou(String name) {
        return "Thank You " + name;
    }

    public String pingPong(String name) {
        return "Pong " + name;
    }
}