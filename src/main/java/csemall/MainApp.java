package csemall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by NESOY on 2017-01-29.
 */
public class MainApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans/beans.xml");

        OfferDAO offer = (OfferDAO) context.getBean("offerDAO");

        System.out.println("The Record Count is " + offer.getRowCount());

        context.close();
    }
}
