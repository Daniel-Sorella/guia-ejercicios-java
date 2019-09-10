package Rocola;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.*;

public class RocolaTest {
    @BeforeTest
    public void setup() {
        cancion = new Canciones("Eclipse",3,"Lit Killah",Generos.Trap);
        cancion1 = new Canciones("BackInBlack",4,"ACDC",Generos.Rock);
        cancion2 = new Canciones("8Mile",3,"Eminem",Generos.HipHop);
        cancion3 = new Canciones("Loca",2,"Shakira",Generos.Pop);
        cancion4 = new Canciones("Llorare",3,"Leguizamon",Generos.Folk);
    }

}