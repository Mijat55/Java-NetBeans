/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Grupa;
import edunova.model.Osoba;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.hibernate.Session;

/**
 *
 * @author Marko
 */
public class PocetniInsert {

    /**
     *
     */
    public static void izvedi(){
        Session session = HibernateUtil.getSession();
        Faker faker = new Faker();
        
        Osoba o;
        session.beginTransaction();
        for(int i=0;i<100;i++){
            o = new Osoba();
            o.setIme(faker.name().firstName());
            o.setPrezime(faker.name().lastName());
            o.setPrimanja(new BigDecimal(faker.number().randomNumber()));
            o.setDatumRodenja(faker.date().birthday());
            o.setAktivan(faker.bool().bool());
            
            session.persist(o);
            
        }
        session.getTransaction().commit();
        
    
        
        
        
    }
    
    public static void izvediSmjer (){
         Session session = HibernateUtil.getSession();
        Faker faker = new Faker();
        
        Smjer s;
        session.beginTransaction();
        for(int i=0;i<100;i++){
            s = new Smjer();
            s.setNaziv(faker.name().name());
            s.setCijena(new BigDecimal(faker.number().randomNumber()));
            s.setUpisnina(new BigDecimal(faker.number().randomNumber()));
            s.setTrajanje(faker.number().numberBetween(1, 5));
            s.setCertificiran(faker.bool().bool());
            session.persist(s);
        }
        session.getTransaction().commit();
        
    }
    
    
    public static void izvediPredavaca (){
        Session session = HibernateUtil.getSession();
        Faker faker = new Faker();
        
        Predavac p;
        session.beginTransaction();
        for(int i=0;i<100;i++){
            p = new Predavac();
            p.setIban(faker.code().imei());
            
            session.persist(p);
        }
         session.getTransaction().commit();
    }
    public static void izvediPolaznika (){
       Session session = HibernateUtil.getSession();
        Faker faker = new Faker();
        
        Polaznik k;
        session.beginTransaction();
        for(int i=0;i<100;i++){
            k = new Polaznik();
            k.setBrojUgovora(new BigDecimal(faker.number().randomNumber()));
           
            session.persist(k);
        }
        session.getTransaction().commit();
    }
    public static void izvediGrupu (){
       Session session = HibernateUtil.getSession();
        Faker faker = new Faker();
        
        Grupa g;
         session.beginTransaction();
        for(int i=0;i<100;i++){
            g = new Grupa();
            g.setNaziv(faker.name().name());
            g.setDatumPocetka(faker.date().future(i, TimeUnit.DAYS));
            
            session.persist(g);
        }
        session.getTransaction().commit();
        
    }
    
}


