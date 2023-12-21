// Доданий клас SportsComplex з вкладеним класом ComplexDemo
public class SportsComplex {
    private String name;

    SportsComplex(String name) {
        this.name = name;
    }

    void displaySportsInfo(Football football, Basketball basketball) {
        System.out.println("Sports Complex Name: " + name);
        System.out.println("Sports Information:");
    }

    // Вкладений клас для спортивного комплексу
    class ComplexDemo {
        void showComplexName() {
            System.out.println("Complex Name: " + name);
        }

        void testMethod(Football football, Basketball basketball) {
            System.out.println("Complex Demo Test Method");
            displaySportsInfo(football, basketball);
            football.displayFootballInfo();
            basketball.displayBasketballInfo();
        }
    }

    // Метод для тестування вкладеного класу через метод test()
    void testComplexDemo(Football football, Basketball basketball) {
        ComplexDemo complexDemo = new ComplexDemo();
        complexDemo.showComplexName();
        complexDemo.testMethod(football, basketball);
    }
}
