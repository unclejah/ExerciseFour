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

        //Dop Exercise 1
        for(int h =1; h<=30; h++){
            if(h % 3 == 0 && h % 5 == 0 ){
                System.out.println(h+" ping pong");
            }else if(h % 3 == 0){
                System.out.println(h+" ping");
            }else if(h % 5 == 0){
                System.out.println(h+" pong");
            }else{
                System.out.println(h);
            }
        }

        //Dop Exercise 2
        int f = 0;
        int s = 1;
        int fib =0;
        System.out.print(f+" "+s+" ");
        for(int u = 2; u <10; u++){
            fib = f+s;
            System.out.print(fib+" ");
            f = s;
            s= fib;
        }
    }
}
