package yewer.factorymethod;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XmlUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File("src//main//java//yewer//factorymethod//config.xml"));

            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue().trim();
            // 通过类名生成实例对象
            Class<?> c = Class.forName(cName);
            Object obj = c.getDeclaredConstructor().newInstance();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
