package com.pu.exp_8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Student student = new Student();
       student.setRoll(1);
       student.setName("god");
       student.setMarks(100);
    	  //1. create Configuration object
       Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class);
       //2. create Session Factroy object 
       SessionFactory sessionFactory=configuration.buildSessionFactory();
       //3. Create Session object
       Session session=sessionFactory.openSession();
       //4. Begin your transaction
       Transaction transaction=session.beginTransaction();
       //5.Save your object to database
       session.save(student);
       //6/ Commit your transaction 
       transaction.commit();
       session.close();
       sessionFactory.close();
    }
}


