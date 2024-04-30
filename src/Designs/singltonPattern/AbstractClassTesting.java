package Designs.singltonPattern;
abstract class Editor {
    abstract void show();

}

abstract class Author extends Editor {
    abstract void print();

}

/**
 * InnerAbstractClassTes
 * 
 * /
 */
class Office extends Author {
    void show() {
        System.out.println("Editor Method");
    }

    void print() {
        System.out.println("Author Method");
    }

}

public class AbstractClassTesting {
    public static void main(String[] args) {
        Office office = new Office();
        office.show();
        office.print();
    }
}
