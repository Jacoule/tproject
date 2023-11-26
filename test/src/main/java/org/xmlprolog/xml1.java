package org.xmlprolog;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

import java.util.List;

/**
 * xml 用啦存储数据的 ，经常用作配置文件
 * 作为一中特殊的数据结构  在网络中进行传输
 */

public class xml1 {
    public static void main(String[] args) throws Exception {
        // 解析xml文件  Dom4j 解析 xml 的框架

        // 1、创建一个Dom4j 框架提供的解析器对象
        SAXReader saxReader = new SAXReader();
        // 2、使用 saxReader 对象把需要解析的xml文件读成一个 Document 对象
        Document document = saxReader.read("test/src/main/java/org/xmlprolog/resource/haha.xml");


        // 3、从文档对象中解析 xml 文件的全部数据了
        System.out.println("3 ========================");
        Element root = document.getRootElement(); // people
        System.out.println(root.elementText("name")); // 获取元素下指定标签的值
        System.out.println(root.getName()); // 获取元素的标签名字

        // 4、Element 获取全部一级子元素
        System.out.println("4 ========================");
        List<Element> elements1 = root.elements();
        List<Element> elements2 = root.elements("person");
        for (Element element : elements1) {
            System.out.println(element.getName()+"*==>"+element.elementTextTrim(element.getName()));
        }


        // 5、获取当前元素下的某个元素 有很多子元素默认获取第一个元素
        System.out.println("5 ========================");
        Element name = root.element("name");
        System.out.println(name.getData());

        // 6、获取元素的属性信息
        Element person = document.getRootElement();
        System.out.println(person.attribute("id"));
        Attribute id = person.attribute("id");
        System.out.println(id.getName());
        System.out.println(id.getValue());

        System.out.println("========================");
        List<Attribute> attributes = person.attributes();
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName()+"===>"+attribute.getValue());
        }




    }


}
