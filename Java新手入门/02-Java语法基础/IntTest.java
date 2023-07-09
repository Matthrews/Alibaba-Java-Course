public class IntTest {
    public static void main(String[] args) {
        // Type mismatch: cannot convert from int to byteJava(16777233)
        // byte num = 200;
        byte num = (byte) 200;  // -56 数据溢出
        System.out.println("num" + num);
    }
}