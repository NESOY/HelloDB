package csemall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by NESOY on 2017-01-29.
 */
public class MainApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans/beans.xml");

        OfferDAO offer = (OfferDAO) context.getBean("offerDAO");

        System.out.println("The Record Count is " + offer.getRowCount());
        System.out.println(offer.getOffer("Alice"));
        List<Offer> offerList = offer.getOffers();
        for(Offer offerTemp: offerList){
            System.out.println(offerTemp);
        }

        Offer offerTemp2 = new Offer("Nesoy","kyoje11@gmail.com","nesoy Spring Frame Work");
        if(offer.insert(offerTemp2) == true){
            System.out.println("Object inserted");
        }
        else{
            System.out.println("Object Inserted Fail");
        }
        Offer offerTemp3 = offer.getOffer("Nesoy");
        System.out.println(offerTemp3);

        offerTemp3.setName("NESOY");
        if(offer.update(offerTemp3)) {
            System.out.println("Update Object : " + offerTemp3);
        }
        else{
            System.out.println("Fail Update Object");
        }

        if(offer.delete(15)){
            System.out.println("Delete Object Success ");
        }
        else{
            System.out.println("Fail to Delete Object");
        }
    }
}
