package yewer.chartfactory;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XmlUtil {
    public static String getCharType() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("src//main//java//yewer//chartfactory//config.xml"));

            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
