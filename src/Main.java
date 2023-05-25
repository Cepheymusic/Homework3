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
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g);
    }
    public static void task3 () {
        System.out.println("Задача3");
        byte classLudmila = 23;
        byte classAnna = 27;
        byte classEkaterina = 30;
        short totalSheets = 480;
        int totalStudents = classLudmila + classAnna + classEkaterina;
        int perStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика расчитано " + perStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача4");
        byte bottles1 = 16;
        byte time1 = 2;
        int inOneMinute = bottles1 / time1;
        byte time2 = 20;
        int time3 = 24 * 60;
        int time4 = time3 * 3;
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
        float milk = 200f;
        short weightOneHundredMlOfMilk = 105;
        byte iceCream = 2;
        short weightOneIceCream = 100;
        byte eggs = 4;
        byte weightOneEggs = 70;
        int weightBananas = bananas * weightOfOneBanana;
        float weightMilk = milk / 100 * weightOneHundredMlOfMilk;
        int weightIceCream = iceCream * weightOneIceCream;
        int weightEggs = eggs * weightOneEggs;
        float breakfastWeightGr = weightBananas + weightMilk + weightIceCream + weightEggs;
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
        System.out.printf("%.2f дней в среднем потребуется для достижения результата \n", averageDays);
    }
    public static void task8 () {
        System.out.println("Задача8");
        byte amountOfTime = 1;
        int numberOfMonths = amountOfTime * 12;
        int masha = 67760;
        float mashaSalary = masha * 0.1f + masha;
        int mashaNewSalary = masha * numberOfMonths;
        int salaryForTheYearMasha = (int)mashaSalary * numberOfMonths;
        int differenceMasha = salaryForTheYearMasha - mashaNewSalary;
        System.out.println("Маша теперь получает " + (int)mashaSalary + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        int denis = 83690;
        float denisSalary = denis * 0.1f + denis;
        int denisNewSalary = denis * numberOfMonths;
        int salaryForTheYearDenis = (int)denisSalary * numberOfMonths;
        int differenceDenis = salaryForTheYearDenis - denisNewSalary;
        System.out.println("Денис теперь получает " + (int)denisSalary + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        int christina = 76230;
        float christinaSalary = christina * 0.1f + christina;
        int christinaNewSalary = christina * numberOfMonths;
        int salaryForTheYearChristina = (int)christinaSalary * numberOfMonths;
        int differenceChristina = salaryForTheYearChristina - christinaNewSalary;
        System.out.println("Кристина теперь получает " + (int)christinaSalary + " рублей. Годовой доход вырос на " + differenceChristina + " рублей");
    }
}