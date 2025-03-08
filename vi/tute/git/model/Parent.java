package vi.tute.git.model;

class Parent {
    public void t1(){
        System.out.println("parent show t1");
    }

    public void t3(){
        System.out.println("parent show t3");
    }
}

class Child extends Parent{
     public void t1(){
        System.out.println("child show t1");

    }
    public void t2(){
        System.out.println("child show t2");
    }
}

// public > protected > default > private
