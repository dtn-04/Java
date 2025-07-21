public class stringMet {
    public static void main(String[] args){
        String name = "        Do Thi     Ngan";

        int length = name.length();

        //chu xuat hien
        char letter = name.charAt(0);

        //dung thu may
        int index = name.indexOf("o");

        //dung vi tri cuoi la
        int lastIndex = name.lastIndexOf("n");

        //in hoa
        name = name.toUpperCase();
        System.out.println(name);

        //in thuong
        name = name.toLowerCase();
        System.out.println(name);

        //cat tia
        name = name.trim();
        System.out.println(name);

        //thay the
        name = name.replace("i", "u");
        System.out.println(name);

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name.isEmpty());
        if(name.isEmpty()){
            System.out.println("Your name is empty.");
        }else
            System.out.println("hello, " + name);
        
        //cantain: chua
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name doesn't contain any space");
        }

        //so sanh
        if(name.equals("password")){
            System.out.println("Your name can't be password");
        }else{
            System.out.println("Hello, " + name);
        }

        //so sanh bo qua in hoa, in thuong
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello, "+ name);
        }
    }
}
