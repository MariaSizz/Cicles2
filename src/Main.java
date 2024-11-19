public class Main {
    public static void main(String[] args) {

        int contrib = 15000;
        int total = 0;
        int mounth = 0;
        while (total < 2459000) {
            total = total + contrib;
            mounth = mounth + 1;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println(mounth);


        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number+" ");
        }
            System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        int countrY = 12000000;
        int year = 0;
        int countrYRes = 12000000;
        while (year < 10) {
            year++;
            countrYRes = countrYRes+(countrY/1000*17-countrY/1000*8);
            System.out.println("Год " + year + ", численность населения составляет " + countrYRes + ".");
        }
        System.out.println(countrYRes);

        int total1 = 15000;
        int mounth1 = 0;
        while (total1 <= 12000000) {
            total1 = total1 + (total1 * 7/100);
            mounth1++;
            System.out.println("Месяц " + mounth1 + ", сумма накоплений равна " + total1 + " рублей.");
        }
        System.out.println(mounth1);

        int total2 = 15000;
        int mounth2 = 0;
        while (total2 <= 12000000) {
            total2 = total2 + (total2 * 7/100);
            mounth2++;
            if (mounth2 % 6 == 0) {
            System.out.println("Месяц " + mounth2 + ", сумма накоплений равна " + total2 + " рублей.");
            }
        }
        System.out.println(mounth2);

        int total3 = 15000;
        int mounth3 = 0;
        while (mounth3 <= 108) {
            total3 = total3 + (total3 * 7/100);
            mounth3++;
            if (mounth3 % 6 == 0) {
                System.out.println("Месяц " + mounth3 + ", сумма накоплений равна " + total3 + " рублей.");
            }
        }
        System.out.println(mounth3);

        int friNumber=7;
        while (friNumber<= 31) {
            System.out.println("Сегодня пятница," + friNumber + "е число. Необходимо подготовить отчет");
            friNumber+=7;
            }

        for (int yeaR = 2024 - 200; yeaR < 2024 + 100; yeaR++) {
            if (yeaR % 79 ==0) {
                System.out.println(yeaR);
            }
        }
    }
}

