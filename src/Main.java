public class Main {
    public static void main(String[] args) {
        // задача 1
        //byte a = 5;
        //short b = 10;
        //int c = 15;
        //long d = 20L;
        //float e = 20.5f;
        //double f = 25.5;
        //char g = 71;
        //boolean h = true;

        // задача 2
        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float sumBoxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общий вес двух бойцов " + sumBoxersWeight + " кг.");

        float differenceBetweenBoxersWeights = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница в весе боксёров " + differenceBetweenBoxersWeights + " кг.");

        // задача 3
        byte oneBananaWeight = 80;
        byte milk100Weight = 105;
        byte icebreakerOneWeight = 100;
        byte oneEggWeight = 70;
        float breakfastWeight = oneBananaWeight * 5 + milk100Weight * 2 +
                icebreakerOneWeight * 2 + oneEggWeight * 4;
        System.out.println("Вес завтрака " + breakfastWeight + " грамм.");
        float breakfastWeightKilo = breakfastWeight / 1000;
        System.out.println("Вес завтрака "+ breakfastWeightKilo + " кг.");

        // задание 4
        short lostWeight1 = 250;
        short lostWeight2 = 500;
        short aimLostWeight = 7 * 1000;
        int amountDays1 = aimLostWeight / lostWeight1;
        System.out.println("Спротсмен потеряет 7 кг в первом случае за " + amountDays1 + " дней.");
        int amountDays2 = aimLostWeight / lostWeight2;
        System.out.println("Спротсмен потеряет 7 кг во втором случае за " + amountDays2 + " дней.");
        int averageAmountDays = (amountDays1 + amountDays2) / 2;
        System.out.println("В среднем спортсмен сможет сбросить вес на 7 кг. за " + averageAmountDays + " день.");

        // задача 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryCristina = 76230;
        int currentEarnMasha = salaryMasha * 12;
        int currentEarnDenis = salaryDenis * 12;
        int currentEarnCristina = salaryCristina * 12;
        float futureSalaryMasha = salaryMasha * 1.1f;
        float futureSalaryDenis = salaryDenis * 1.1f;
        float futureSalaryCristina = salaryCristina * 1.1f;
        float futureEarnMasha = futureSalaryMasha * 12;
        float futureEarnDenis = futureSalaryDenis * 12;
        float futureEarnCristina = futureSalaryCristina * 12;
        float gainEarnMasha = futureEarnMasha - currentEarnMasha;
        System.out.println("Маша теперь получает " + futureSalaryMasha + " рублей. Годовой доход вырос на " + gainEarnMasha + " рублей.");
        float gainEarnDenis = futureEarnDenis - currentEarnDenis;
        System.out.println("Денис теперь получает " + futureSalaryDenis + " рублей. Годовой доход вырос на " + gainEarnDenis + " рублей.");
        float gainEarnCristina = futureEarnCristina - currentEarnCristina;
        System.out.println("Кристина теперь получает " + futureSalaryCristina + " рублей. Годовой доход вырос на " + gainEarnCristina + " рублей.");








    }
}