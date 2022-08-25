public class Main {
    public static void main(String[] args) {
        //Exercise 1
        int i = 1;
        while (i <= 10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (i = 10; i>=1; i--){
            System.out.print(i+" ");
        }

        //Exercise 2
        System.out.println();
        int friday = 1;
        for(int j=friday; j<=31; j=j+7){
            System.out.println("Сегодня пятница, "+j+"-е число. Необходимо подготовить отчет.");

        }

        //Exersice 3
        int currentYear = 2017;
        int yearBefor = currentYear - 200;
        int yearAfter = currentYear + 100;
        for(int g = yearBefor+79; g<yearAfter; g = g+79){
            System.out.println(g);
        }

    }
}
