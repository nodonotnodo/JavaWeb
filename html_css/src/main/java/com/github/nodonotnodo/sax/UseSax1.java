package com.github.nodonotnodo.sax;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 *
 * SAX解析：针对事件解析
 * 三要素：
 *      1.事件源：xml文件
 *      2.事件监听器：
 *          遇到文档开始
 *              startDocment()
 *          遇到开始标签
 *              startElement()
 *          遇到文本内容
 *              characters()
 *          遇到结束标签
 *              endElement()
 *          遇到文档结束
 *              endDocument()
 *      3.注册事件监听器：基于事件处理程序
 *          DefaultHandler
 *
 *
 * SAX解析开发步骤:
 * 				1.创建SAX解析器对象
 * 					SAXParser：是一个抽象类，它的示例需要通过它的工程类（SAXParserFactory）来实现
 * 				2.读取指定xml文件
 * 				3.注册事件监听器，DefaultHandler：扩展此类
 * 					自定义一个类，继承DefaultHandler，覆写它的部分方法
 *
 *
 */

public class UseSax1 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        //1.创建SAX解析器对象
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();

        //2.读取指定xml文件
        parser.parse(UseSax1.class.getClassLoader().getResourceAsStream("school"), new MyHandler());

    }

}
