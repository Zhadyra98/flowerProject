package model;

import java.io.*;
import java.util.Vector;

public class Database {
    public static Vector<Bouqet> allBouqets = new Vector<>();
    static FileInputStream fis;
    static FileOutputStream fos;
    static ObjectOutputStream oos;
    static ObjectInputStream oin;
    public static void desBouqets() throws IOException, ClassNotFoundException{
        fis = new FileInputStream("bouqets");
        oin = new ObjectInputStream(fis);
        allBouqets = (Vector<Bouqet>) oin.readObject();
    }
    public static void serBouqets()throws IOException{
        fos = new FileOutputStream("bouqets");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(allBouqets);
        oos.close();
    }
}
