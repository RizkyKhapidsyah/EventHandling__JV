public class ContohException {
    public static void main(String[] args) {
        try {
            System.out.println(args[1]);
        } catch (ArrayIndexOutOfBoundsException PesanError) {
            System.out.println("Perangkap Exception: " + PesanError + "!");
        }
    }
}
