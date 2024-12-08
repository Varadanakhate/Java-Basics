package FunctionalInterface;
//lambdas represent implementation of the fucntional interfaces(has only one abstract method)
//greeting message is the one functional interface having an abstract method called greet
@FunctionalInterface
public interface GreetingMesssage {

    public abstract void greet(String name);
}
