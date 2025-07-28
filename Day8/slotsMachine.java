
import java.util.Random;
import java.util.Scanner;

public class slotsMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet, payout;
        String[] row;
        String again;

        System.out.println("*******************");
        System.out.println("CHÀO MỪNG ĐẾN VỚI MÁY SLOT JAVA");
        System.out.println("Biểu tượng: 🍒 🍇 🍈 🍉 🍊 🍋 🍌");
        System.out.println("*******************");

        do {
            while (balance > 0) {
                System.out.println("Số dư hiện tại: $" + balance);
                System.out.print("Nhập số tiền cược: ");
                bet = scanner.nextInt();

                if (bet > balance) {
                    System.out.println("KHÔNG ĐỦ TIỀN");
                    continue;
                } else if (bet <= 0) {
                    System.out.println("Tiền cược phải lớn hơn 0");
                    continue;
                }

                balance -= bet;
                System.out.println("Đang quay...");
                row = spinRow();
                printRow(row);
                payout = getPayout(row, bet);

                if (payout > 0) {
                    System.out.println("Bạn thắng $" + payout);
                    balance += payout;
                } else {
                    System.out.println("Rất tiếc, bạn đã thua ván này");
                }

                if (balance <= 0) {
                    System.out.println("Bạn đã hết tiền.");
                    break;
                }

                System.out.print("Bạn có muốn chơi tiếp không? (Y/N): ");
                again = scanner.next().toUpperCase();
                if (!again.equals("Y")) {
                    break;
                }
            }

            System.out.print("Bắt đầu trò chơi mới với $100? (Y/N): ");
            again = scanner.next().toUpperCase();
            if (again.equals("Y")) {
                balance = 100;
            }

        } while (again.equals("Y"));

        System.out.println("Kết thúc trò chơi!");
    }


    static String[] spinRow(){

        String[] symbols = {"🍒", "🍇", "🍈", "🍉", "🍊", "🍋", "🍌"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < row.length; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println("*******************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*******************");
    }

    static int getPayout(String[] row, int bet){
        if((row[0].equals(row[1])) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet*3;
                case "🍇" -> bet*4;
                case "🍈" -> bet*5;
                case "🍉" -> bet*7;
                case "🍊" -> bet*10;
                case "🍋" -> bet*15;
                case "🍌" -> bet*20;
                default -> 0;
            };
        }
        else if((row[0].equals(row[1]))){
            return switch(row[0]){
                case "🍒" -> bet*2;
                case "🍇" -> bet*3;
                case "🍈" -> bet*4;
                case "🍉" -> bet*5;
                case "🍊" -> bet*6;
                case "🍋" -> bet*7;
                case "🍌" -> bet*10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet*2;
                case "🍇" -> bet*3;
                case "🍈" -> bet*4;
                case "🍉" -> bet*5;
                case "🍊" -> bet*6;
                case "🍋" -> bet*7;
                case "🍌" -> bet*10;
                default -> 0;
            };
        }
        return 0;
    }
}
