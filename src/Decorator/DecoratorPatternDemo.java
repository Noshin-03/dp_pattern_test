package Decorator;
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        String data = "Helloooooo World!!";

        DataSource file = new FileDataSource("data.txt");

        DataSource compressed = new CompressionDecorator(file);

        DataSource encrypted = new EncryptionDecorator(compressed);

        encrypted.writeData(data);

        System.out.println("\n--- Reading from Decorated Source ---");
        String result = encrypted.readData();
        System.out.println("Final Output: " + result);
    }
}

