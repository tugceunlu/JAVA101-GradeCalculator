import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int music, math,turkish, history,phys, chem;
        Scanner input = new Scanner(System.in);
        System.out.print("Grade/Music:");
        music = input.nextInt();
        System.out.println(music);
        System.out.print("Grade/Math:");
        math = input.nextInt();
        System.out.println(math);
        System.out.print("Grade/History:");
        history = input.nextInt();
        System.out.println(history);
        System.out.print("Grade/Phys:");
        phys = input.nextInt();
        System.out.println(phys);
        System.out.print("Grade/Chem:");
        chem = input.nextInt();
        System.out.println(chem);
        System.out.print("Grade/Turkish:");
        turkish = input.nextInt();
        System.out.println(turkish);

        int average;
        average = (math + music + history + phys + turkish + chem)/6;

        System.out.println(average>=60? "Ortalama= "+average+ '\n' + "Sınıfı Geçti":"Ortalama= "+average+ + '\n' + "Sınıfta Kaldı");



    }

}


