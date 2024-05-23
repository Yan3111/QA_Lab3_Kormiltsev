package main.java;
/**
 * @brief Главный класс программы.
 */
public class Main {
    /**
     * @brief Точка входа в программу.
     * @param args Аргументы командной строки.
     * \image html computer.png width=450cm
     * \f[
     * |I_2|=\left| \int_{0}^T \psi(t)
     * \left\{
     * u(a,t)-
     * \int_{\gamma(t)}^a
     * \frac{d\theta}{k(\theta,t)}
     * \int_{a}^\theta c(\xi)u_t(\xi,t)\,d\xi
     * \right\} dt
     * \right|
     * \f]
     *
     */
    public static void main(String[] args) {
        // Создание объекта класса ComputerComponent
        ComputerComponent component = new ComputerComponent();
        // Создание объекта класса Computer
        Computer computer = new Computer();
        double totalCost;
        // Ввод данных о компонентах компьютера
        computer.read();
        // Вывод данных о компонентах компьютера
        computer.display();
        totalCost = computer.totalCost();
        // Вывод данных общей стоимости компьютера
        System.out.println("Общая стоимость компьютера: " + totalCost);
        // Вывод самой экономичной компоненты
        component = computer.mostEfficientComponent();
        System.out.println("Самый экономичный компонент:");
        component.display();
    }
}
