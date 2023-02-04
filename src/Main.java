public class Main {
    public static void main(String[] args)
                public static void task1() {
                    System.out.println("Задача 1");
                    int depositTotal = 2_459_000; //вводим условия задачи
                    int depositMonth = 15_000;
                    int deposit = 0;
                    int month = 0;
                    while (deposit <= depositTotal) { //цикл для расчета накоплений
                        deposit += depositMonth;
                        month = ++month;
                        System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
                    }
                }


                public static void task2() {
                    System.out.println("Задача 2");
                    int count = 1;
                    while (count <= 10) {
                        System.out.println(count);
                        count = ++count;
                    }
                    int count1 = 10;
                    for (; count1 >= 1; count1 = --count1) {
                        System.out.println(count1);


                    }
                }

                public static void task3() {
                    System.out.println("Задача 3");
                    int population = 12000000;

                    for (int i = 1; i <= 10; i = i + 1) {
                        population = (int) (population + population * 0.017 - population * 0.008);

                        System.out.println("Год " + i + " численность населения составляет " + population);
                    }
                }

                public static void task4() {
                    System.out.println("Задача 4");
                    int deposit = 15000;
                    int i = 1;
                    for (; deposit <= 12000000; i++) {
                        deposit = (int) (deposit + deposit * 0.07);
                        System.out.println(deposit);
                    }
                    System.out.println(i);
                }

                public static void task5() {
                    System.out.println("Задача 5");
                    int deposit = 15000;
                    int i = 1;
                    for (; deposit <= 12000000; i++) {
                        deposit = (int) (deposit + deposit * 0.07);
                        if (i % 6 == 0) {
                            System.out.println(i + "  " + deposit);
                        }
                    }
                }

                public static void task6() {
                    System.out.println("Задача 6");
                    int deposit = 15000;
                    int i = 1;
                    for (; i <= 54; i++) {
                        deposit = (int) (deposit + deposit * 0.07);
                        if (i % 6 == 0) {
                            System.out.println(i + "  " + deposit);
                        }
                    }
                }

                public static void task7() {
                    System.out.println("Задача 7");
                    int friday = 2;
                    for (; friday <= 31; friday = friday + 7) {
                        System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                    }
                }

                public static void task8() {
                    System.out.println("Задача 8");
                    int year = 0;
                    int currentYear = 1786;
                    int startYear = currentYear - 200;
                    int finalYear = currentYear + 100;
                    for (; year >= 0; year += 79) { //условие цикла - год не может быть отрицательным (по условиям с нуля отсчет)
                        if (year >= startYear && year <= finalYear) { //условный оператор ограничивает выборку годов
                            Syste  m.out.println(year);
                        }
                    }
                }
                public static void task8_1() {
                    System.out.println("Задача 8_1");
                    int n = 0;
                    int currentYear = 1786;
                    int startYear = currentYear - 200;
                    if (startYear % 79 != 0)
                        n = 79 - (startYear % 79);
                    System.out.print((startYear + n) + " " + (startYear + n + 79) + " " + (startYear + n + 79*2));
                    if ((currentYear + 100) > (startYear + n + 79*3))
                        System.out.println(" " + (startYear + n + 79 * 3));
                    else System.out.println();
                }

                public static void task8_2() {
                    System.out.println("Задача 8_2");
                    int currentYear = 1786;
                    int startYear = currentYear - 200;
                    int finalYear = currentYear + 100;
                    for (int i = startYear; i <= finalYear; i++) { //условие цикла - год не может быть отрицательным (по условиям с нуля отсчет)
                        if (i % 79 == 0) { //условный оператор ограничивает выборку годов
                            System.out.println(i);
                        }
                    }
                }
            }

