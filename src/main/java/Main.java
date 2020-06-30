import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public static class AsciiCharSequence implements CharSequence {
        //Твой код здесь
        private byte[] a1;

        public AsciiCharSequence(byte[] bytes){
            // Конструктор класса
            this.a1 = bytes;
        }
        @Override
        public int length(){
            return this.a1.length;
        }
        @Override
        public char charAt(int index) {
            return (char)this.a1[index];
        }

        public CharSequence subSequence(int start, int end){
            return new AsciiCharSequence(Arrays.copyOfRange(this.a1, start, end));
        }
        @Override
        public String toString(){
            return new String(this.a1, StandardCharsets.ISO_8859_1);
        }
    }
}
