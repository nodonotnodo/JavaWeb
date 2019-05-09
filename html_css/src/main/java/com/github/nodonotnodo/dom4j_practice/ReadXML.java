package com.github.nodonotnodo.dom4j_practice;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.print.attribute.standard.DocumentName;

public class ReadXML {

    public static void main(String[] args) throws DocumentException {

        //1.创建解析器
        SAXReader reader = new SAXReader();

        //2.解析器读取指定XML文件
        Document document = reader.read(ReadXML.class.getClassLoader().getResource("school"));

        //3.获取XML文件的节点和Text，创建对象
        MyClass class1 = new MyClass();

        //school.xml的根节点
        Element rootET = document.getRootElement();
        Element element = rootET.element("school").element("institutes").element("institute").element("majors").element("major");

        class1.setSchool(rootET.element("school").elementText("name"));
        class1.setInstitute(rootET.element("school").element("institutes").element("institute").elementText("institutename"));
        class1.setMajor(rootET.element("school").element("institutes").element("institute").element("majors").element("major").elementText("majorname"));
        class1.setClassName(element.element("majorClasses").element("majorClass").elementText("className"));
        class1.setNumerOfStudent(element.element("majorClasses").element("majorClass").elementText("numerOfStudent"));
        class1.setClassID(element.element("majorClasses").element("majorClass").attributeValue("id"));

        System.out.println(class1);

    }

}
