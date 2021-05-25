import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{

    private final byte[] bytes;

    public AsciiCharSequence() {
        this(new byte[] {});
    }

    public AsciiCharSequence(byte[] sequence) {
        bytes = sequence;
    }

    public AsciiCharSequence(byte[] sequence, int start, int end) {
        bytes = Arrays.copyOfRange(sequence, start, end);
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char)bytes[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        if (start < 0 || end > bytes.length || end - start < 0) {
            throw new StringIndexOutOfBoundsException();
        }
        return ((start == 0) && (end == bytes.length)) ? this
                : new AsciiCharSequence(bytes, start, end);
    }

    @Override
    public String toString() {
        return new String(bytes); // StandardCharsets.US_ASCII не требуется
    }

}
