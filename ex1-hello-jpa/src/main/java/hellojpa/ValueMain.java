package hellojpa;

public class ValueMain {
    public static void main(String[] args) {


        int a = 10;
        int b = a;
//        b = 20;

//        Integer a = new Integer(10);
//        Integer b = a;

//        a.setValue(20);


//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        System.out.println("a == b: " + (a == b));

        Address address1 = new Address("city", "street", "10000");
        Address address2 = new Address("city", "street", "10000");

        System.out.println("address1 == address2: " + (address1 == address2) );
        System.out.println("address1 == address2: " + (address1.equals(address2)) );
    }
}
