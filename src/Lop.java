import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten lop hoc");
        String name=scanner.nextLine();
        String regex="^^(C|A|P)\\d{4}(G|H|I|K|L|M)$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(name);
        if (matcher.find()){
            System.out.println("ok");
        } else {
            System.out.println("No");
        }
    }
}
