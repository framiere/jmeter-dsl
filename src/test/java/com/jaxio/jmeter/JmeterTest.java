package com.jaxio.jmeter;

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
		System.out.println(recurse(document.getRootElement(), 0) + ";");
	}

	private String recurse(Element element, int depth) {
		String ret = "";
		String name = element.getName();
		String pad = StringUtils.leftPad(" ", depth);

		ret += pad + "new " + StringUtils.capitalize(name) + "() //\n";
		for (Attribute attribute : element.getAttributes()) {
			ret += pad + "." + attribute.getName() + "(\"" + attribute.getValue() + "\") //\n";
		}
		List<Element> children = element.getChildren();
		if (!children.isEmpty()) {
			List<String> childrenValues = Lists.newArrayList();
			for (Element child : children) {
				if ("objProp".equals(child.getName())) {
					continue;
				} else if ("stringProp".equals(child.getName())) {
					ret += pad + ".add(\"" + child.getAttribute("name").getValue() + "\", \"" + child.getValue().replace("\\", "\\\\").replace("\"", "\\\"") + "\") //\n";
				} else if ("boolProp".equals(child.getName()) || "longProp".equals(child.getName()) || "intProp".equals(child.getName())) {
					ret += pad + ".add(\"" + child.getAttribute("name").getValue() + "\", " + child.getValue() + ") //\n";
				} else {
					childrenValues.add(recurse(child, depth + 1));
				}
			}
			if (!childrenValues.isEmpty()) {
				ret += pad + ".add( //\n";
				boolean first = true;
				for (String s : childrenValues) {
					if (!first) {
						ret = StringUtils.removeEnd(ret, "//\n") + ",//\n";
					}
					first = false;
					ret += pad + s;
				}
				ret += pad + ") //\n";
			}
		}
		return ret.toString();
	}
}
