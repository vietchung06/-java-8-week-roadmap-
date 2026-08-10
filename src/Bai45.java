public class Bai45 {
    public static void main(String[] args) {
        //tính dienj tích=dài * rong=PI * R * R
        //tính chu vi = (dài+rong)*2 = 2 * PI * R
        int chieudai = 30;
        int chieurong = 25;
        int bankinh=40;
        double S=Math.PI * bankinh*bankinh;
        double cv=2* Math.PI * bankinh;
        System.out.println(S);
        System.out.println(cv);

        int dientich=chieudai*chieurong;
        double chuvi=(chieudai+chieurong)*2;
        System.out.println(dientich);
        System.out.println(chuvi);
    }
}
