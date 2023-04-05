package h_11;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TÓth Milán
 */
public class H_11 {

    public static void main(String[] args) {

        Integer[] szamok = {1, 2, 3};
        Integer a = null;

        try {
            System.out.println(szamok[3]);
            a++;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.err.println("Túl indexeltem valamit");
        } catch (NullPointerException npi) {
            System.err.println("Null értékre hivatkoztam");
        } catch (Exception e) {
            System.err.println("Valami egyéb volt");
        } finally {
            System.out.println("Bármi más");
        }

        try {
            System.out.println(fuggveny(a));
        } catch (Exception ex) {
            Logger.getLogger(H_11.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Integer fuggveny(Integer szam) throws Exception {
        if (szam > 0) {
            return szam++;
        } else {
            throw new Exception();
        }
    }

}
