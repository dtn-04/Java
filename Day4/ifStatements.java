
import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        //Group1

        System.out.print("名前を入力してください");
        name = scanner.nextLine();

        //emoji win + ;
        if(name.isEmpty()){
            System.out.println("名前を入力しない😡");
        }
        else{
            System.out.println("初めまして，" + name + "!😘" );
        }


        //Group 2
        System.out.print("年齢を入力してください");
        age = scanner.nextInt();

        if(age>=65){
            System.out.println("老人 👴");
        }
        else if(age>=18){
            System.out.println("成人 👨‍🦰");
        }
        else if(age == 0){
            System.out.println("赤ちゃん 👶");
        }
        else if(age < 0){
            System.out.println("生まれていない ❌");
        }
        else{
            System.out.println("子供 🧒");
        }

        //Group3
        System.out.print("(true/false)");
        isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.println("学生です。🧑‍🎓");
        }
        else{
            System.out.println("学生じゃない。");
        }
    }
}
