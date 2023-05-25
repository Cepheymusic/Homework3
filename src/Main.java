public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

        }

    public static void task1 () {
        System.out.println("Задача1");

        int double_Tree = 1;

        byte a = 5;
        System.out.println("Значение переменной с типом byte равно " + a);
        short b = 150;
        System.out.println("Значение переменной с типом short равно " + b);
        int c = 10203040;
        System.out.println("Значение переменной с типом int равно " + c);
        long d = 120500500500L;
        System.out.println("Значение переменной с типом long равно " + d);
        float e = 20.5f;
        System.out.println("Значение переменной с типом float равно " + e);
        double f = 20.145145d;
        System.out.println("Значение переменной с типом double равно " + f);


    }
    public static void task2 () {
        System.out.println("Задача2");

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        // выводить не нужно
    }
    public static void task3 () {
        System.out.println("Задача3");

        byte classLudmila = 23;
        byte classAnna = 27;
        byte classEkaterina = 30;
        short totalSheets = 480;
        int totalStudents = classLudmila + classAnna + classEkaterina;
        int perStudent = 480 / totalStudents;
        System.out.println("На каждого ученика расчитано " + perStudent + " листов бумаги");

    }
    public static void task4 () {
        System.out.println("Задача4");

        byte bottles1 = 16;
        byte time1 = 2;
        // колво за 1 минуту
        int inOneMinute = bottles1 / time1;
        byte time2 = 20;
        // минут в сутки
        int time3 = 24 * 60;
        // минут за 3 дня
        int time4 = time3 * 3;
        // минут в месяц, если в этом месяце, например 30 дней, в условиях не сказано
        int time5 = time3 * 30;
        int bottles2 = inOneMinute * time2;
        System.out.println("За " + time2 + " минут машина произвела " + bottles2 + " штук бутылок");
        int bottles3 = inOneMinute * time3;
        System.out.println("За сутки машина произвела " + bottles3 + " штук бутылок");
        int bottles4 = inOneMinute * time4;
        System.out.println("За 3 дня машина произвела " + bottles4 + " штук бутылок");
        int bottles5 = inOneMinute * time5;
        System.out.println("За месяц машина произвела " + bottles5 + " штук бутылок");

    }

    public static void task5 () {
        System.out.println("Задача5");

        byte generalPot = 120;
        byte whitePot = 2;
        byte brownPot = 4;
        int numberOfClasses = generalPot / (whitePot + brownPot);
        int generalWhitePot = numberOfClasses * whitePot;
        int generalBrownPot = numberOfClasses * brownPot;
        System.out.println("В школе где " + numberOfClasses + " классов, нужно " + generalWhitePot + " банок белой краски и " + generalBrownPot + " банок коричневой краски");

    }

    public static void task6 () {
        System.out.println("Задача6");

        byte bananas = 5;
        byte weightOfOneBanana = 80;
        short milk = 200;
        short weightOneHundredMlOfMilk = 105;
        byte iceCream = 2;
        short weightOneIceCream = 100;
        byte eggs = 4;
        byte weightOneEggs = 70;
        int weightBananas = bananas * weightOfOneBanana;
        // с молоком вопрос
        int weightMilk = milk / 100 * weightOneHundredMlOfMilk;
        int weightIceCream = iceCream * weightOneIceCream;
        int weightEggs = eggs * weightOneEggs;
        int breakfastWeightGr = weightBananas + weightMilk + weightIceCream + weightEggs;
        float breakfastWeightKg = breakfastWeightGr / 1000f;
        System.out.println("Вес спортзавтрака " + breakfastWeightGr + " грамм, или " + breakfastWeightKg + " килограмм");
    }

    public static void task7 () {
        System.out.println("Задача7");

        short weightGr1 = 250;
        short weightGr2 = 500;
        byte generalWeightKg = 7;
        int generalWeightGr = generalWeightKg * 1000;
        System.out.println("Общий вес в граммах " + generalWeightGr);
        int numberOfDays1 = generalWeightGr / weightGr1;
        System.out.println(numberOfDays1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по " + weightGr1 + " грамм");
        int numberOfDays2 = generalWeightGr / weightGr2;
        System.out.println(numberOfDays2 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по " + weightGr2 + " грамм");
        float averageDays = generalWeightGr / ((weightGr1 + weightGr2) / 2f);
        System.out.println((int)averageDays + " дней в среднем потребуется для достижения результата");


    }

    public static void task8 () {
        System.out.println("Задача8");

        // не обязательно, но всё таки))))
        byte amountOfTime = 1;
        int numberOfMonths = amountOfTime * 12;

        int Masha = 67760;
        // Доход в месяц после поднятия
        float salary1Masha = Masha * 0.1f + Masha;
        // доход за год до поднятия
        int salary2Masha = Masha * numberOfMonths;
        // доход за год после поднятия зарплаты
        int salaryForTheYearMasha = (int)salary1Masha * numberOfMonths;
        // разница дохода за год
        int differenceMasha = salaryForTheYearMasha - salary2Masha;
        System.out.println("Маша теперь получает " + (int)salary1Masha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");

        int Denis = 83690;
        float salary1Denis = Denis * 0.1f + Denis;
        // доход за год до поднятия
        int salary2Denis = Denis * numberOfMonths;
        // доход за год после поднятия зарплаты
        int salaryForTheYearDenis = (int)salary1Denis * numberOfMonths;
        // разница дохода за год
        int differenceDenis = salaryForTheYearDenis - salary2Denis;
        System.out.println("Денис теперь получает " + (int)salary1Denis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");

        int Christina = 76230;
        float salary1Christina = Christina * 0.1f + Christina;
        // доход за год до поднятия
        int salary2Christina = Christina * numberOfMonths;
        // доход за год после поднятия зарплаты
        int salaryForTheYearChristina = (int)salary1Christina * numberOfMonths;
        // разница дохода за год
        int differenceChristina = salaryForTheYearChristina - salary2Christina;
        System.out.println("Кристина теперь получает " + (int)salary1Christina + " рублей. Годовой доход вырос на " + differenceChristina + " рублей");

    }



}