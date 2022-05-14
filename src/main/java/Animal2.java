public abstract class Animal2 {

    void playLoad(){
        System.out.println("hi~~");
        System.out.println("잘했어~~");
        play();
        runsomething();
    }

    abstract void play();

    void runsomething(){
        System.out.println("이거 오버라이딩 할꺼야 ");
    }
}
