// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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

    public static void task1() {
        System.out.println("Задача 1");
        byte apple = 20;
        System.out.println("Яблок = " + apple);
        short orange = 31111;
        System.out.println("Апельсинов = " + orange);
        int strawberry = 1000000;
        System.out.println("Клубники = " + strawberry);
        long cherry = 3000003L;
        System.out.println("Вишни = " + cherry);
        float dollars = 1.55f;
        System.out.println("Доллар = " + dollars);
        double euro = 5.6587452d;
        System.out.println("Евро = " + euro);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.2F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short paper = 480;
        int studentPaper = paper / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte performance2Min = 16;
        byte performanceMin = 16 / 2;
        byte time20Min = 20;
        short timeDay = 24 * 60;
        int time3Day = 3 * timeDay;
        int timeMonth = 30 * timeDay;
        int performance20Min = performanceMin * time20Min;
        System.out.println("За " + time20Min + " мин. машина произвела " + performance20Min + " штук бутылок");
        int performanceDay = performanceMin * timeDay;
        System.out.println("За сутки машина произвела " + performanceDay + " штук бутылок");
        int performance3Day = performanceMin * time3Day;
        System.out.println("За 3 суток машина произвела " + performance3Day + " штук бутылок");
        int performanceMonth = performanceMin * timeMonth;
        System.out.println("За месяц машина произвела " + performanceMonth + " штук бутылок");
    }

        public static void task5() {
            System.out.println("Задача 5");
            byte dyeAll = 120;
            byte dyeClass = 6;
            byte whiteDye = 2;
            byte brownDye = 4;
            int allClass = dyeAll / dyeClass;
            int allWhiteDye = allClass * whiteDye;
            int allBrownDye = allClass * brownDye;
            System.out.println("В школе, где " + allClass + " классов, нужно " + allWhiteDye + " банок белой краски и " + allBrownDye + " банок коричневой краски.");
        }

    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 80;
        byte milk = 105;
        byte cream = 100;
        byte eggs = 70;
        int breakfast = (banana * 5) + (milk * 2) + (cream * 2) + (eggs * 4);
        float breakfastKg = breakfast / 1000f;
        System.out.println("Вес завтрака составляет " + breakfast + " грамм.");
        System.out.println("Вес завтрака составляет " + breakfastKg + " килограмм.");
    }

    public static void task7() {
        System.out.println("Задача 7");
        short totalWeight = 7000;
        short weightDayA = 250;
        short weightDayB = 500;
        int dayA = totalWeight / weightDayA;
        int dayB = totalWeight / weightDayB;
        System.out.println(dayA + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(dayB + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        int average = (dayA + dayB) / 2;
        System.out.println(average + " дней в среднем уйдет на похудение");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int monthMasha = 67760;
        int monthDenis = 83690;
        int monthKris = 76230;
        int promotionMasha = (monthMasha * 10) / 100;
        int promotionDenis = (monthDenis * 10) / 100;
        int promotionKris = (monthKris * 10) / 100;
        int newPayoutMasha = monthMasha + promotionMasha;
        int newPayoutDenis = monthDenis + promotionDenis;
        int newPayoutKris = monthKris + promotionKris;
        int differenceMasha = (newPayoutMasha * 12) - (monthMasha * 12);
        int differenceDenis = (newPayoutDenis * 12) - (monthDenis * 12);
        int differenceKris = (newPayoutKris *12) - (monthKris * 12);
        System.out.println("Маша теперь получает " + newPayoutMasha + "рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newPayoutDenis + "рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newPayoutKris + "рублей. Годовой доход вырос на " + differenceKris + " рублей.");

    }


    }






