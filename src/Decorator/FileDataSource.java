package Decorator;

class FileDataSource implements DataSource {
    private String filename;
    private String storage = "";

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        this.storage = data;
        System.out.println("[FileDataSource] Writing to " + filename + ": " + data);
    }

    @Override
    public String readData() {
        System.out.println("[FileDataSource] Reading from " + filename);
        return storage;
    }
}