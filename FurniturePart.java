package main.java;

import java.util.Scanner;
/**
 * @brief Класс Компонента компьютера: является элементом, имеющим свою цену и расход электроэнергии.
 */
class ComputerComponent {
    private double price; /**< Цена компонента. */
    private int powerConsumption; /**< Расход электроэнергии компонента. */
    /**
     * @brief Инициализация данных о компоненте компьютера.
     * @param price Цена компонента.
     * @param powerConsumption Расход электроэнергии компонента.
     */
    public void init(double price, int powerConsumption) {
        this.price = price;
        this.powerConsumption = powerConsumption;
    }
    /**
     * @brief Вывод информации о компоненете компьютера.
     */
    public void display() {
        System.out.println("Цена компонента: " + price);
        System.out.println("Расход электроэнергии компонента: " + powerConsumption);
    }
    /**
     * @brief Считывание данных о компоненете компьютера с клавиатуры.
     */
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Цена компонента? - ");
        price = scanner.nextDouble();
        System.out.print("Расход электроэнергии компонента? - ");
        powerConsumption = scanner.nextInt();
    }
    /**
     * @brief Вычисление экономичности.
     * @return Экономичность.
     */
    public double efficiency() {
        return 1.0 / (price * powerConsumption);
    }
}
