package Decorator;

class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encrypted = encrypt(data);
        System.out.println("[EncryptionDecorator] Encrypting data...");
        super.writeData(encrypted);
    }

    @Override
    public String readData() {
        String data = super.readData();
        System.out.println("[EncryptionDecorator] Decrypting data...");
        return decrypt(data);
    }

    private String encrypt(String data) {
        return new StringBuilder(data).reverse().toString(); // Simple reverse
    }

    private String decrypt(String data) {
        return new StringBuilder(data).reverse().toString(); // Reverse again
    }
}