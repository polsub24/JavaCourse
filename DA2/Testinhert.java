package da3;
class A {
    void dispA() {
        System.out.println("Inside A");
    }
    
    static void staticA() {
        System.out.println("Inside static A");
    }
    
    void defaultA() {
        System.out.println("Inside default A");
    }
}
class B extends A {
    void dispB() {
        System.out.println("Inside B");
    }
    
    static void staticB() {
        System.out.println("Inside static B");
    }
    
    void defaultB() {
        System.out.println("Inside default B");
    }
}
class C extends B {
    void dispC() {
        System.out.println("Inside C");
    }
    
    static void staticC() {
        System.out.println("Inside static C");
    }
    
    void defaultC() {
        System.out.println("Inside default C");
    }
}
class D extends C {
    void dispD() {
        System.out.println("Inside D");
    }
    
    static void staticD() {
        System.out.println("Inside static D");
    }
    
    void defaultD() {
        System.out.println("Inside default D");
    }
    class E {
        void dispE() {
            System.out.println("Inside E");
        }

        void defaultE() {
            System.out.println("Inside default E");
        }
    }
}
class F extends D {
    void dispF() {
        System.out.println("Inside F");
    }
    
    static void staticF() {
        System.out.println("Inside static F");
    }
    
    void defaultF() {
        System.out.println("Inside default F");
    }
}
class G extends D {
    void dispG() {
        System.out.println("Inside G");
    }
    
    static void staticG() {
        System.out.println("Inside static G");
    }
    
    void defaultG() {
        System.out.println("Inside default G");
    }
}
public class Testinhert {
    public static void main(String[] args) {
        F objF = new F();
        objF.dispA();
        objF.defaultA();
        objF.dispB();
        objF.defaultB();
        objF.dispC();
        objF.defaultC();
        objF.dispD();
        objF.defaultD();
        objF.dispF();
        objF.defaultF();
        F.staticF();
        
        G objG = new G();
        objG.dispA();
        objG.defaultA();
        objG.dispB();
        objG.defaultB();
        objG.dispC();
        objG.defaultC();
        objG.dispD();
        objG.defaultD();
        objG.dispG();
        objG.defaultG();
        G.staticG();
        D objD = new D();
        D.E objE = objD.new E();
        objE.dispE();
        objE.defaultE();
    }
}
