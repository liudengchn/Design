package template;

public class TestTemplate {
    public static void main(String[] args) {
        Template template = new Tea();
        Template template1 = new Coffee();
        template.menu();
        template1.menu();
    }
}
