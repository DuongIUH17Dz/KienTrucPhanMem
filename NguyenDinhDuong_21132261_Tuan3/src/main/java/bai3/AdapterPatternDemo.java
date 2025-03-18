package bai3;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Hệ thống hỗ trợ JSON
        DataProcessor jsonProcessor = new JsonProcessor();
        jsonProcessor.processData("{\"name\":\"John\",\"age\":30}");

        System.out.println("\n====================\n");

        // Hệ thống hỗ trợ XML thông qua Adapter
        XmlProcessor xmlProcessor = new XmlProcessor();
        DataProcessor adapter = new JsonToXmlAdapter(xmlProcessor);
        adapter.processData("{\"title\":\"Hello\",\"message\":\"World\"}");
    }
}
