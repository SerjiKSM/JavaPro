package net.ukr.ksm;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

//        CatalagTrain catalagTrain = new CatalagTrain();
//
//        catalagTrain.add(new Train(1, "Kiev", "Donetsk", new Date(), "15:05"));
//        catalagTrain.add(new Train(2, "Lviv", "Donetsk", new Date(), "19:05"));
//
//        try {
//            File file = new File("D://test//TrainTimetable.xml");
//
//            JAXBContext jaxbContext = JAXBContext.newInstance(CatalagTrain.class);
//            Marshaller marshaller = jaxbContext.createMarshaller();
//
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//            marshaller.marshal(catalagTrain, file);
//
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }



        Foo foo = new Foo(new Date());

        try {
            File file = new File("D://test//TrainTimetable.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Foo.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(foo, file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }

}
