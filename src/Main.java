public class Main {

    public static void main(String[] args) {
        byte[] x = new byte[]{65, 66, 67, 68, 48, 49, 50};
        AsciiCharSequence str = new AsciiCharSequence(x);
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.subSequence(1, 4));
        System.out.println(str.toString());
    }
}
