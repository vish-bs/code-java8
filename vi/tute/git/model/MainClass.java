package vi.tute.git.model;

public class MainClass {
    public static void main(String[] args) {
        Child p = new Child();
        p.t2();

        Parent p1 = new Child();
        p1.t1();

        Parent p2 = new Parent();
        p2.t1();

        Parent pq = new Child();
        pq.t3();

    }


}
