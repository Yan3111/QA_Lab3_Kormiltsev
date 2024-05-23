package main.java;

import java.util.Scanner;
/**
 * @brief Класс, представляющий совокупность нескольких компонентов.
 */
class Computer {
    private ComputerComponent component1 = new ComputerComponent();/**< Первая компонента. */
    private ComputerComponent component2 = new ComputerComponent();/**< Вторая компонента. */
    private ComputerComponent component3 = new ComputerComponent();/**< Третья компонента. */
    private double auxiliaryEquipmentCost;/**< Общая стоимость вспомогательного оборудования. */
    /**
     * @brief Инициализация данных об элементах.
     * @param price1 Цена первой компоненты.
     * @param power1 Расход электороэнергии первой компоненты.
     * @param price2 Цена второй компоненты.
     * @param power2 Расход электороэнергии второй компоненты.
     * @param price3 Цена третьей компоненты.
     * @param power3 Расход электороэнергии третьей компоненты.
     * @param auxiliaryCost Общая стоимость вспомогательного оборудования.
     */
    public void init(double price1, int power1, double price2, int power2, double price3, int power3, double auxiliaryCost) {
        component1.init(price1, power1);
        component2.init(price2, power2);
        component3.init(price3, power3);
        auxiliaryEquipmentCost = auxiliaryCost;
    }
    /**
     * @brief Вывод информации о компоненетах компьютера и стоимости вспомогательного оборудования.
     */
    public void display() {
        System.out.println("Компонент 1");
        component1.display();
        System.out.println("Компонент 2");
        component2.display();
        System.out.println("Компонент 3");
        component3.display();
        System.out.println("Стоимость вспомогательного оборудования: " + auxiliaryEquipmentCost + "\n");
    }
    /**
     * @brief Считывание данных о компонентах компьютера и стоимости вспомогательного оборудования с клавиатуры.
     */
    public void read() {
        component1.read();
        component2.read();
        component3.read();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Стоимость вспомогательного оборудования: ");
        auxiliaryEquipmentCost = scanner.nextDouble();
        System.out.println();
    }
    /**
     * @brief Вычисление общей стоимости компьютера.
     * @return Общая стоимость.
     */
    public double totalCost() {
        double totalEfficiency = component1.efficiency() + component2.efficiency() + component3.efficiency();
        return auxiliaryEquipmentCost / totalEfficiency;
    }
    /**
     * @brief Вычисление самой экономичной компоненты компьютера.
     * @return самая экономичная компонента компьютера.
     */
    public ComputerComponent mostEfficientComponent() {
        double efficiency1 = component1.efficiency();
        double efficiency2 = component2.efficiency();
        double efficiency3 = component3.efficiency();

        double maxEfficiency = Math.max(efficiency1, Math.max(efficiency2, efficiency3));

        if (maxEfficiency == efficiency1) {
            return component1;
        }
        if (maxEfficiency == efficiency2) {
            return component2;
        }
        if (maxEfficiency == efficiency3) {
            return component3;
        }
        return null;
    }
}
