package util;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Utilities {

	private static <T> Marshaller getMarshaller(Class<T> type) throws JAXBException {
		Marshaller jaxbMarshaller = JAXBContext.newInstance(type).createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		return jaxbMarshaller;
	}
	
	public static <T> void print(T o, Class<T> type) throws JAXBException {
		getMarshaller(type).marshal(o, System.out);
	}

	public static <T> void printList(List<T> list, Class<T> type) throws JAXBException {
		Marshaller jaxbMarshaller = getMarshaller(type);
		for (T o : list) {
			jaxbMarshaller.marshal(o, System.out);
		}
	}

}
