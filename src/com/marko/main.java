package com.marko;

public class main {
    public static void main(String[] args) {
      /*  boolean isAdult = false;
        boolean isStudent = true;
        boolean isMe= true;
        System.out.println(isAdult &&  isStudent); // and
        System.out.println(isAdult ||  isStudent); // or
        System.out.println((isAdult ||  isStudent)&& !isMe);//not
        System.out.println(!isAdult==true);
*/   // logical ops
      /*
        int age = 15;
        int isAdult=18;
        String msg =age >=18 ?"Is adult":"Not adult ";
        System.out.println(msg);  //ternary operator

        //if-else
        if (age>=isAdult){
            System.out.println("Is adult ");
        }
            else {
            System.out.println("Not adult ");
        }
        */   // if-else ternary
      /*  String gender = "FEMALE";
        switch(gender){
            case "FEMALE":
                System.out.println("FEMALE");
                break;
            case "MALE":
                System.out.println("MALE");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("PREFER_NOT_SAY");
                break;
            default:
                System.out.println("UNKNOWN");
        }*/   // switch statements
      /*
      int [] nums ={1,2,3,4,5,6,7,8};
      int n= nums[nums.length-1];
      System.out.println(n);
      for (int i = nums.length; i > 0; i--) {
          System.out.println(i);
        }

        for (int num: nums){   //better for loop
            System.out.println(num);
        }
       */   // arrays loops indexes
      /*String [] names = {"matej","marko","ivan","luka","marin","robert"};
        for (String name :names) {
            if(name.equals("marko")){;
            continue; // break izadje iz petlje continue preskoci danu vrijednost
        }
            System.out.println(name);
        }*/   // break i continue
      /*  int count = 100;
        while(count>0){
            System.out.println("elo");;
            count-=20;
        }*/   // while loop - !executed at least once
      /*int count =10;
      do{
          System.out.println("borgar");
          count--;
        }while(count>0);*/   // do-while - executed at least once
      /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("name?\n");
        String username = scanner.nextLine();
        System.out.println("HELLO " + username);

        System.out.println("age?\n");
        int age = scanner.nextInt();
        int year =LocalDate.now().minusYears(age).getYear();
        System.out.println("born in "+ year);
        if(age<18){
            System.out.println("not adult man");
        }else {
            System.out.println("adult man");
        }*/   // Scanner
      /*char[] letters = {'A','A','B','C','D','D','D'};
      countLetters(letters,'Z');
        }
        public static void countLetters(char [] x, char searchLetter) {
        int count =0;
        for (char c : x) {
            if (c==searchLetter){
                count++;
            }
        }
        System.out.println(count);;*/   // Methods
      /*
      Lens lens1 = new Lens("Canon","300mm",true);
      Lens lens2 = new Lens("Nikon","150mm",true);
      Lens lens3 = new Lens("Sony","70mm",false);
        System.out.println(lens1+"\n");
        System.out.println(lens2+"\n");
        System.out.println(lens3+"\n");
    }
    static class Lens{
       String brand;
       String focalLength;
       boolean isPrime;

        @Override
        public String toString() {
            return "Lens{" +
                    "brand='" + brand + '\'' +
                    ", focalLength='" + focalLength + '\'' +
                    ", isPrime=" + isPrime +
                    '}';
        }
        Lens(String brand, String focalLength, boolean isPrime) {
          this.brand = brand;
          this.focalLength = focalLength;
          this.isPrime=isPrime;
      }*/   // Classes and Objects
      /*Passport p1 = new Passport("123","UK",LocalDate.of(2025,1,1)) ;
      Passport p2 = new Passport("1234","Germany",LocalDate.of(2025,12,12));
      System.out.println(p1);
      System.out.println(p2);

    }


   static class Passport{
        String number;
        String country;
        LocalDate expiryDate;

       @Override
       public String toString() {
           return "Passport{" +
                   "number='" + number + '\'' +
                   ", country='" + country + '\'' +
                   ", expiryDate=" + expiryDate +
                   '}';
       }
       Passport(String number, String country, LocalDate expiryDate) {
           this.number = number;
           this.country=country;
           this.expiryDate = expiryDate;

       }*/   // Classes and Objects
   }
}
