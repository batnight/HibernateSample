import model.City;
import model.Country;
import model.Person;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammad on 06/12/2016.
 */
public class Main {
    private static StandardServiceRegistry registry = null;
    private static SessionFactory sessionFactory = null;

    public static void main(String[] args) {
        registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        /*City city = new City(0, "Tehran");
        Student student = new Student();
        student.setFullName("Mohammad");
        student.setAverage(20);
        student.setId(0);


        create(student);
        *//*create(city);
        returnListCity();*/
        List<City> cities = new ArrayList<City>();
        cities.add(new City(0,"tehran"));
        cities.add(new City(0,"tabriz"));
        cities.add(new City(0,"shiraz"));
        cities.add(new City(0,"tehran"));
        Country country = new Country(0, "iran");
        country.setCities(cities);

        create(country);


    }


    public static void create(Object object) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save("create Object", object);

        session.getTransaction().commit();

        session.close();
    }

    public static void returnListCity() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<City> list = new ArrayList<City>();
        list = session.createNativeQuery("select id,cityname from model.City", City.class).list();

        for (City city : list) {
            System.out.println("id : " + city.getId() + " name : " + city.getCityName());
        }

        session.getTransaction().commit();
        session.close();
    }
}
