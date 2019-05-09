package com.github.nodonotnodo.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.management.Attribute;

/**
 *
 * 事件处理程序
 *
 */

public class MyHandler extends DefaultHandler {

    public MyHandler() {
    }

    //文档开始
    @Override
    public void startDocument() throws SAXException {
        System.out.println("文档开始");
    }

    //开始标签
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        StringBuilder sb = new StringBuilder();

        sb.append("<")
                .append(qName);
        for(int i=0; i<attributes.getLength(); i++){
            sb.append(" ")
                    .append(attributes.getQName(i))
                    .append("=")
                    .append(attributes.getValue(i));
        }
        sb.append(">");
        System.out.print(sb.toString());
    }

    //文档内容
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        //遇到文本：每次读取实际文档内容
        System.out.print(new String(ch,start,length));
    }

    //结束标签
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.print("</"+qName+">");
    }

    //文档结束
    @Override
    public void endDocument() throws SAXException {
        System.out.print("\n文档结束");
    }
}
