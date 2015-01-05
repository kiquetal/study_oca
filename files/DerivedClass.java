class BaseClass {

    public  void print() {
        System.out.println("In Parent Class , Print Method");
    }

    public static void display() {
        System.out.println("In Parent Class, Display Method");
    }

}


class DerivedClass extends BaseClass {

    public  void print() throws RuntimeException {
        System.out.println("In Derived Class, Print Method");
    }

    public static void display() {
        System.out.println("In Derived Class, Display Method");
    }

  public static void main(String args[])
{

new DerivedClass().print();
}

}
