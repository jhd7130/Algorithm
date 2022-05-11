public class Driver {
    public static void main(String[] args) {
        int b = Animal.age;
    }
}

// 이거 왜이러지? 내 클래스를 만들고 해당 클래스 내부에 main 메서드를 만들어서 사용하려면 new 연산자가 필수인데 이건 필요가 없나? 왜지?
//그림을 한번 그려보자
class Animal{
    static int age = 0;

    static{
        System.out.println("Animal class ready::::::");
    }
}
