public class Eksepsi_1 {
    public static void main(String[] args) {
        Integer[] array_integer = new Integer[4];
        try {
            array_integer[2] = 11;
            array_integer[3] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        finally {
            System.out.println("clean up code...");
        }
    }
}
