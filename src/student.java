public class student {
    String name ;
    int age;
    public void study(){
        System.out.println("study!!");
    }
    public  void play(){
        System.out.println("play");
    }
    public static void main(String[] args) {
        student s = new student();
        s.age = 22;
        s.name = "22睡";
        s.play();
        s.study();
        System.out.println("名字和年龄是"+s.name+s.age);

    }
}
