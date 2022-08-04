public class Triangle {
    int a,b,c;

    static void area(int a,int b,int c){
        double p = (a + c + b) >> 1;
        double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(result);
    }
}
