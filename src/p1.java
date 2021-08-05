public class p1 {
    public static void main(String[] args) {
        int n=10;
        int t=10;
        int day;
        for (day=2; day<=7; day++){
            n*=1.1;
            t+=n;
        }
        System.out.println("Суммарный путь спортсмена за 7 дней " + t +" км");
    }
}
