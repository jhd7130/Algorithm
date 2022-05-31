import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// 추상 클래스를 만들어서 메서드가 아니고 추상 클래스가 내부 클래스로 들어가있을 수 있다.
// 또한 잘못된 것은 추상 메서드가 없다고 추상 클래스를 선언하지 못하는 것은 아니다.
public abstract class Pizza {

    // 내부에 클래스가 두개인 것이다. enum 클래스와 추상 클래스가 두개가 존재할 수 있다.
    public enum Topping {HAM,MUSHROOM, ONION, PEPPER, SAUSAGE};

    // 이건 왜 package-private 이지?
    final Set<Topping> toppings;


    abstract static class Builder <T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }


    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }


}
