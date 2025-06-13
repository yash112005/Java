public class interfaces {
    interface client1{
        void print();// it is public
        void show();
    }
    interface client2{
        void print();
        void show();
    }
     static class dev implements client1,client2{
        public void print(){// it is default by default
            System.out.println("bill");
        }
        public  void show(){
            System.out.println("heloooooo");
        }
    }
    public static void main(String[] args) {
        dev d = new dev();
        d.print();
        d.show();

    }
}
