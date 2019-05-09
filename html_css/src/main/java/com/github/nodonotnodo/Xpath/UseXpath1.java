package com.github.nodonotnodo.Xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class UseXpath1 {

    public static void main(String[] args) throws DocumentException {

        SAXReader reader = new SAXReader();
        Document document = reader.read(UseXpath1.class.getClassLoader().getResource("school"));

        String xpath = "//school/*";

        List<Element> classList = document.selectNodes(xpath);

        for(Element e : classList){
            System.out.println(e);
        }

    }

}
