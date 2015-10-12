package util;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Utilities {

	public static <T> void print(T o, Class<T> type) throws JAXBException {
		Marshaller jaxbMarshaller = JAXBContext.newInstance(type).createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(o, System.out);
	}

	public static <T> void printList(List<T> list, Class<T> type) throws JAXBException {
		Marshaller jaxbMarshaller = JAXBContext.newInstance(type).createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		for (T o : list) {
			jaxbMarshaller.marshal(o, System.out);
		}
	}

}
