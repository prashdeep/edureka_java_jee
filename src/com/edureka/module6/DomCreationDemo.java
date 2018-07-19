package com.edureka.module6;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.dom4j.DocumentFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DomCreationDemo {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.newDocument();
		
		Element element = document.createElement("employee");
		element.setTextContent("Pradeep");
		document.appendChild(element);
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer tformer = tf.newTransformer();
		
		Source source = new DOMSource(document);
		Result result = new StreamResult(System.out);
		
		tformer.transform(source, new StreamResult(new File("F://file-data/employee.xml")));
		tformer.transform(source, result);
		
	}

}
