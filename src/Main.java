public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        // radius là 10, color là yellow và quạt ở trạng thái bật.
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        // Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
