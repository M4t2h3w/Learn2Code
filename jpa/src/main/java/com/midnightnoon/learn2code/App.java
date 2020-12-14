package com.midnightnoon.learn2code;

import com.midnightnoon.learn2code.model.*;
import com.midnightnoon.learn2code.model.enmus.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {

        Message message = new Message("Sprava");
        logger.error("First error");
        logger.error("Second error");
        logger.error("Third error");
        logger.debug("First debug");
        logger.debug("Second debug");
        logger.debug("Third debug");

//        String hodnota = "hodnota";
//        String hodnota2 = "hodnota2";
//        String hodnota3 = "hodnota3";
//        logger.debug("Hello world from logger");
//        logger.debug("Debug value {}", hodnota);
//        Object[] parametre = {hodnota, hodnota2, hodnota3};
//        logger.debug("Parameter 1: {}, Parameter 2: {}, Parameter 3: {}", parametre);

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.midnightnoon.learn2code.jpa");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        //odoslanie dát do databázy
//        entityManager.getTransaction().begin(); //vytvorenie spojenia s db
//        entityManager.persist(new Message("Prva sprava"));
//        entityManager.persist(new Message("Druha sprava"));
//        entityManager.getTransaction().commit();    //potvrdenie zmien v db

//        //získanie dát z db
//        entityManager.getTransaction().begin();
//        //vytiahnutie vsetkych dat z Message do listu result
//        List<Message> result = entityManager.createQuery("from Message", Message.class).getResultList();
//
//        for(Message msg : result){
//            System.out.println("Správa " + msg.getMessage() + " id " + msg.getId()
//                                + " Dátum " + msg.getCREATE_DATE());
//        }
//        entityManager.getTransaction().commit();

        //createOsoba(entityManager);

        //printOsoba(entityManager);

        //addAdresauOsobe(entityManager);

//        AdresaRepository adresaRepository = new AdresaRepository(entityManager);
//
//        Adresa adresa = new Adresa();
//        adresa.setUlica("Novozamocka 1");
//        adresa.setMesto("Bratislava");
//        adresa.setPsc("098 65");
//
//        Adresa adresa2 = new Adresa();
//        adresa2.setUlica("Novozamocka 3");
//        adresa2.setMesto("Bratislava");
//        adresa2.setPsc("098 65");
//
//        adresaRepository.create(adresa);
//        adresaRepository.create(adresa2);
//        //--------------------------------------------
//        Adresa adresaZDb = adresaRepository.read(Adresa.class, 1L);
//        System.out.println(adresaZDb.getUlica() + "\n");
//        //--------------------------------------------
//        Adresa adresaMoja = new Adresa();
//        adresaMoja.setId(1L);
//        adresaMoja.setUlica("Menim adresu 10");
//        adresaRepository.update(adresaMoja);
        //--------------------------------------------
//        adresaRepository.delete();
        //--------------------------------------------

//        entityManager.getTransaction().begin();
//
//        Film film = entityManager.find(Film.class, 4L);
////        DetailFilmu detailFilmu = entityManager.find(DetailFilmu.class, 4L);
//        System.out.println(film.getNazov());
////        detailFilmu.setPopisFilmu("Dajaky film.");
////        detailFilmu.setFilm(film);
////        entityManager.persist(detailFilmu);
//
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
    }

    private static void nativeQuery(EntityManager entityManager) {
        entityManager.getTransaction().begin();

        List<Object[]> cisla = entityManager.createNativeQuery("select id, cislo from Telefon").getResultList();

        for(Object[] cislo : cisla){
            Integer id = (Integer) cislo[0];
            String telefon = (String) cislo[1];
            System.out.printf("ID = %d, CISLO = %s", id, telefon);
            System.out.println();
        }

        entityManager.getTransaction().commit();
    }

    private static void addAdresauOsobe(EntityManager entityManager){
        entityManager.getTransaction().begin();

        Osoba osoba = entityManager.find(Osoba.class, 8L);

        Adresa adresa = new Adresa();
        adresa.setUlica("Dajaka ulica");
        adresa.setMesto("Dajake mesto");
        adresa.setPsc("000 00");
        adresa.setOsoba(osoba);

        entityManager.persist(adresa);

        entityManager.getTransaction().commit();
    }

    private static void removeSkupina(EntityManager entityManager){
        entityManager.getTransaction().begin();

        SkupinaKontaktov skupina = entityManager.find(SkupinaKontaktov.class, 1L);
        entityManager.remove(skupina);

        entityManager.getTransaction().commit();
    }

    private static void loadSkupina(EntityManager entityManager){
        entityManager.getTransaction().begin();

        SkupinaKontaktov skupina = entityManager.find(SkupinaKontaktov.class, 2L);
        System.out.println(skupina);

        entityManager.getTransaction().commit();
    }

    private static void saveSkupinuAOsoby(EntityManager entityManager){
        entityManager.getTransaction().begin();

        Osoba osoba = entityManager.find(Osoba.class, 8L);
        Osoba osoba2 = entityManager.find(Osoba.class, 9L);
        Osoba osoba3 = entityManager.find(Osoba.class, 10L);

        SkupinaKontaktov skupina = new SkupinaKontaktov();
        skupina.setNazovSkupiny("Skupina 1");
        skupina.getOsobyVSkupine().add(osoba);
        skupina.getOsobyVSkupine().add(osoba2);

        SkupinaKontaktov skupina2 = new SkupinaKontaktov();
        skupina2.setNazovSkupiny("Skupina 2");
        skupina2.getOsobyVSkupine().add(osoba);
        skupina2.getOsobyVSkupine().add(osoba3);

        entityManager.persist(skupina);
        entityManager.persist(skupina2);

        entityManager.getTransaction().commit();
    }

    private static void saveOsobuTelefony2(EntityManager entityManager){
        entityManager.getTransaction().begin();

        Osoba osoba = new Osoba();
        osoba.setPohlavie(Pohlavie.MUZ);
        osoba.setMeno(new Meno(null, null, "Janko", null, "Beno"));
        osoba.setCisloOp("AB123456");

        Telefon telefon = new Telefon();
        telefon.setCislo("0908765432");
//        telefon.setOsoba(osoba);

        Telefon telefon1 = new Telefon();
        telefon1.setCislo("090713456");
        //telefon1.setOsoba(osoba);

        osoba.addTelefon(telefon);
        osoba.addTelefon(telefon1);

        //toto by som musel pouzit ak by som nemal vytvorene metody
//        osoba.getTelefony().add(telefon);
//        osoba.getTelefony().add(telefon1);

        //ak chcem persistovať len takto jednoducho, musim pridat kaskádu
        //ináč by som musel persistovať každú položku samostatne
        entityManager.persist(osoba);

        entityManager.getTransaction().commit();
    }

    private static void nacitajOsobuPridajTelefon(EntityManager entityManager){
        entityManager.getTransaction().begin();

        Osoba osoba = entityManager.find(Osoba.class, 8L);

        Telefon telefon = new Telefon();
        telefon.setCislo("0900000001");
        telefon.setOsoba(osoba);

        osoba.getTelefony().add(telefon);

        entityManager.persist(telefon);

        entityManager.getTransaction().commit();
    }

    private static void saveMoreNumbersToOne(EntityManager entityManager){
        entityManager.getTransaction().begin();

        Osoba osoba = entityManager.find(Osoba.class, 8L);

        Telefon telefon1 = new Telefon();
        telefon1.setCislo("0987654");
        telefon1.setOsoba(osoba);
        entityManager.persist(telefon1);

        Telefon telefon2 = new Telefon();
        telefon2.setCislo("0908746321");
        telefon2.setOsoba(osoba);
        entityManager.persist(telefon2);

        Telefon telefon3 = new Telefon();
        telefon3.setCislo("0900876123");
        telefon3.setOsoba(osoba);
        entityManager.persist(telefon3);

        entityManager.getTransaction().commit();
    }

    private static void getTelefon(EntityManager entityManager){
        entityManager.getTransaction().begin();

        Telefon telefon = entityManager.find(Telefon.class, 1L);
        System.out.println(telefon);


        entityManager.getTransaction().commit();
    }

    private static void saveTelefonKOsobe(EntityManager entityManager) {
        entityManager.getTransaction().begin();

        Osoba osoba1 = new Osoba();
        osoba1.setPohlavie(Pohlavie.ZENA);
        osoba1.setMeno(new Meno("Ing.", "Phd.", "Danka", null, "Dlhomenná."));
        osoba1.setCisloOp("XY876187");
        entityManager.persist(osoba1);

        Telefon telefon = new Telefon();
        telefon.setOsoba(osoba1);
        telefon.setCislo("0905123456");
        entityManager.persist(telefon);

        entityManager.getTransaction().commit();
    }

    private static void createOsoba(EntityManager entityManager) {
        Osoba osoba1 = new Osoba();
        osoba1.setPohlavie(Pohlavie.ZENA);
        osoba1.setMeno(new Meno("Ing.", "Phd.", "Janka", null, "Dlhomenná."));
        osoba1.setCisloOp("XY876187");

        entityManager.getTransaction().begin();
        entityManager.persist(osoba1);
        entityManager.getTransaction().commit();
    }

    private static void printOsoba(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        List<Osoba> result = entityManager.createQuery("from Osoba", Osoba.class).getResultList();
        for(Osoba osoba : result){
            System.out.println("Osoba id: " + osoba.getId()
                                + "\tPohlavie: " + osoba.getPohlavie()
                                + "\tPohlavie kod: " + osoba.getPohlavie().getKod()
                                + "\tMeno: " + osoba.getMeno()
                                + "\tCislo OP: " + osoba.getCisloOp());
        }
        entityManager.getTransaction().commit();
    }
}
