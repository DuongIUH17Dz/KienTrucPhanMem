package bai3;

class JsonToXmlAdapter implements DataProcessor {
    private XmlProcessor xmlProcessor;

    public JsonToXmlAdapter(XmlProcessor xmlProcessor) {
        this.xmlProcessor = xmlProcessor;
    }

    // Chuyển JSON thành XML và xử lý
    @Override
    public void processData(String jsonData) {
        String xmlData = convertJsonToXml(jsonData);
        xmlProcessor.processXmlData(xmlData);
    }

    // Giả lập chuyển đổi JSON → XML
    private String convertJsonToXml(String jsonData) {
        return "<xml><data>" + jsonData.replace("{", "").replace("}", "").replace("\"", "") + "</data></xml>";
    }
}
