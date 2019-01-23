package ua.kiev.prog;

import org.junit.Test;

public class AppConfigTest {

    //AppConfig appConfig = new AppConfig();
    AdvDAOImpl advDAOImpl = new AdvDAOImpl();


    @Test
    public void testSaveRecord() throws Exception{

        Advertisement advertisement = new Advertisement();
        //advertisement.setId(1);
        advertisement.setName("Audi 80");
        advertisement.setShortDesc("Audi");
        advertisement.setLongDesc("Audi 80 long");
        advertisement.setPrice(20500);
        advertisement.setPhone("55555555555");

        advDAOImpl.add(advertisement);
//        Advertisement advertisement1 = advDAOImpl.add(advertisement);
//
//        System.out.println(advertisement1);

//        //Записали в БД
//        Car carBMV = (Car)  service.add(car1);
//
//        //Вывели записанную в БД запись
//        System.out.println(carBMV);

    }

//    public static void main(String[] arg) throws Exception {
//
//        AppConfigTest appConfigTest = new AppConfigTest();
//
//        appConfigTest.testSaveRecord();
//
//
//
//    }

}
