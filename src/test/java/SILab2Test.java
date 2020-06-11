import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private final SILab2 siLab2 = new SILab2();

    @Test
    void everyBranch() {
        RuntimeException ex;
        RuntimeException fl = null;
        try{
        throw new RuntimeException("The user is not instantiated");
        }
        catch (RuntimeException sx){
            ex=sx;
        }
        try{
            siLab2.function(null,null);
        }
        catch (RuntimeException flex){
            fl=flex;
        }
        assert fl != null;
        assertEquals(fl.getMessage(),ex.getMessage());
        try{
            throw new RuntimeException("The user is missing some mandatory information");
        }
        catch (RuntimeException sx){
            ex=sx;
        }
        try{
            siLab2.function(new User(null,null,"martinapopovski@gmail.com"),null);
        }
        catch (RuntimeException flex){
            fl=flex;
        }
        assertEquals(fl.getMessage(),ex.getMessage());
        assertFalse(siLab2.function(new User("martinkozle","martin","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","bomb","martinapopovski@gmail.com"),null));
        assertTrue(siLab2.function(new User("martinkozle","Sk@paBruno12","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","kucekakopet","martinapopovski@gmail.com"),null));
    }

    @Test
    void everyPath(){
        RuntimeException ex;
        RuntimeException fl = null;
        try{
            throw new RuntimeException("The user is not instantiated");
        }
        catch (RuntimeException sx){
            ex=sx;
        }
        try{
            siLab2.function(null,null);
        }
        catch (RuntimeException flex){
            fl=flex;
        }
        assert fl != null;
        assertEquals(fl.getMessage(),ex.getMessage());
        try{
            throw new RuntimeException("The user is missing some mandatory information");
        }
        catch (RuntimeException sx){
            ex=sx;
        }
        try{
            siLab2.function(new User(null,null,"martinapopovski@gmail.com"),null);
        }
        catch (RuntimeException flex){
            fl=flex;
        }
        assertEquals(ex.getMessage(),fl.getMessage());
        assertFalse(siLab2.function(new User("martinkozle","bomb","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","martin","martinapopovski@gmail.com"),null));
        assertTrue(siLab2.function(new User("martinkozle","Sk@paBruno12","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","Sk@paBruno","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","sk@pabruno","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","skapabruno","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","SkapaBruno12","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","skapabruno12","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","ska@abruno12","martinapopovski@gmail.com"),null));
        assertFalse(siLab2.function(new User("martinkozle","SkapaBruno12","martinapopovski@gmail.com"),null));

    }


}
