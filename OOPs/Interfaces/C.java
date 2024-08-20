package OOPs.Interfaces;
public class C {
    // nested Interface
    public interface NestedInterface {
        boolean isOdd(int num);
    }


}


class D implements C.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;   //for odd num
    }
}