package Decorator;

class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressed = compress(data);
        System.out.println("[CompressionDecorator] Compressing data...");
        super.writeData(compressed);
    }

    @Override
    public String readData() {
        String data = super.readData();
        System.out.println("[CompressionDecorator] Decompressing data...");
        return decompress(data);
    }

    private String compress(String data) {
        return data.replaceAll("([a-zA-Z])\\1+", "$1"); // Basic compression: collapse repeats
    }

    private String decompress(String data) {
        return data;
    }
}