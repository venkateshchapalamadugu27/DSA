public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        String s=Integer.toBinaryString(n);
//        System.out.println(s);
//        String res="";
//        for(char c:s.toCharArray()){
//            if(c=='1'){
//                res+='0';
//            }
//            else{
//                res+='1';
//            }
//        }
//        System.out.println(res);
//        int resnum=Integer.parseInt(res,2);
//        System.out.println(resnum);

        HotelManagemant.Hotel hotel = new HotelManagemant.Hotel();
        hotel.listGuests();
        hotel.checkIn("Alice", 101);
        hotel.checkIn("Bob", 102);
        hotel.checkIn("Charlie", 103);

        hotel.listGuests();

        hotel.checkOut("Bob");

        hotel.listGuests();
    }
}