package live.xiaoxu.innerClass;

public class InnerClassFinalTest {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        outerClass.user.name = "name1";
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.send();
    }
}