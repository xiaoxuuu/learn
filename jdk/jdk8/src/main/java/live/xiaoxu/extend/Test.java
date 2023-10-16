package live.xiaoxu.extend;

public class Test {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.a = "-parent";
        ChildOne childOne = new ChildOne();
        childOne.a = "-childOne";
        ChildTwo childTwo = new ChildTwo();
        childTwo.a = "-childTwo";
        System.out.println(((Parent) parent).a);
        System.out.println(((Parent) childOne).a);
        System.out.println(((Parent) childTwo).a);

        System.out.println(((Parent) parent).getTwo());
        System.out.println(((Parent) childOne).getTwo());
        System.out.println(((Parent) childTwo).getTwo());

        System.out.println(((ChildOne) parent).a);
        System.out.println(((ChildOne) parent).getTwo());
    }
}