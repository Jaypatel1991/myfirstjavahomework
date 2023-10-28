package myarithmatichomework;

public class MyDataTypes {
    public static void main(String[] args) {
        byte a = -120;
        System.out.println("a=" + a);
        short b = -32700;
        System.out.println("b=" + b);
        int c = 1147483647;
        System.out.println("c=" + c);
        long d = -9223372036854775808L;
        System.out.println("d=" + d);
        float e = 8989654585812511114545.111f;
        System.out.println("e=" + e);
        double f = -9879131313131313.111;
        System.out.println("f=" + f);
        char g = 'a';
        System.out.println("g=" + g);
        boolean h = false;
        System.out.println("h=" + h);
        boolean i= true;
        System.out.println("i=" + i);
        String j = "I am a Software tester";
        System.out.println("j="+j);
        String k = "Software";
        String l = "Testing Homework";
        System.out.println(k + l);
        int n;
//Arithmatic
        System.out.println(a+b);
        System.out.println(c-d);
        System.out.println(e*f);
        System.out.println(e/f);
        System.out.println(a%b);
//Assignment
        System.out.println(n=a+b);
        System.out.println(n+=a);
        System.out.println(n-=a);
        System.out.println(n*=a);
        System.out.println(n/=a);
        System.out.println(n%=a);
        System.out.println(n^=a);
//Relational
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
//Logical
        System.out.println(a<130 && a>123);
        System.out.println(a<140 || a>125);
        System.out.println(!(a<140 && a>125));
//Unary
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(!h);
        System.out.println(!i);

    }
}