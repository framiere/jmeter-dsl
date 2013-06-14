package com.jaxio.jmeter;

import static com.google.common.collect.Lists.newArrayList;

import java.io.File;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.junit.Test;

import com.google.common.collect.Lists;

public class JmeterTest {

	@Test
	public void p() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("src/test/resources/index.xml");
		Document document = (Document) builder.build(xmlFile);
		recurse(document.getRootElement(), 0);
	}

	private void recurse(Element element, int depth) {
		String pad = StringUtils.leftPad(" ", depth);
		String name = element.getName();

		
		System.out.println(pad + "new " + StringUtils.capitalize(name) + "() //");
		for (Attribute attribute : element.getAttributes()) {
			System.out.println(pad + "." + attribute.getName() + "(\"" + attribute.getValue() + "\") //");
		}
		List<Element> children = element.getChildren();
		if (!children.isEmpty()) {
			System.out.println(pad + ".add( //");
			int size = children.size();
			int i = 0;
			for (Element child : children) {
				if ("objProp".equals(child.getName())) {
					return;
				}
				recurse(child, depth + 1);
				i++;
				if (i != size) {
					System.out.println(pad + ",");
				}
			}
			System.out.println(pad + ") //");
		}
	}
}
