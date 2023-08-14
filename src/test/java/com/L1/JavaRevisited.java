package com.L1;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.*;

import static org.junit.Assert.*;

public class JavaRevisited {

    @BeforeClass
    public static void runOnesPerClassBeforeAnyTests(){
        System.out.println("@BeforeClass");
    }

    @Before
    public void runBeforeAnyTests(){
        System.out.println("@Before every test");
    }

    @AfterClass
    public static void runOnesPerClassAfterAnyTests(){
        System.out.println("@AfterClass");
    }

    @After
    public void runAfterAnyTests(){
        System.out.println("@After every test");
    }

    @Test
    public void variableNaming(){
        String $aString = "bob";
        float lowed = 10F;
        int aMount = 4;
        long Amount = 5;
        String A012345667888f = "ugh";
        assertEquals(4,aMount);
        assertEquals(5,Amount);
        assertEquals(10.0F,lowed,0);
        assertEquals("bob",$aString);
        assertEquals("ugh",A012345667888f);
    }

    @Test
    public void BooleanType(){
        boolean truthy = true;
        boolean falsey = false;
        assertTrue(truthy);
        assertFalse(false);
        falsey = Boolean.TRUE;
        truthy = Boolean.FALSE;
        assertTrue(falsey);
        assertFalse(truthy);
    }

    @Test
    public void IntegerType(){
        byte aByte;
        short aShort;
        int aInt;
        long aLong;
        System.out.println("* 'byte' range: " + Byte.MIN_VALUE + " to " +  Byte.MAX_VALUE);
        System.out.println("* 'short' range: " + Short.MIN_VALUE + " to " +  Short.MAX_VALUE);
        System.out.println("* 'integer' range: " + Integer.MIN_VALUE + " to " +  Integer.MAX_VALUE);
        System.out.println("* 'long' range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);


        aLong = 0;
        assertEquals(0,aLong);
        aByte = 0xA;
        assertEquals(10,aByte);
        aInt = 010;
        assertEquals(8,aInt);
        aShort = 0b0010;
        assertEquals(2,aShort);
        aLong = 9_000_000_000L;
        assertEquals(9000000000L,aLong);
    }

    @Test
    public void FloatingPointTypes(){
        float single32bit;
        double double64bit;

        System.out.println("* 'float' range: " + Float.MIN_VALUE + " to " +  Float.MAX_VALUE);
        System.out.println("* 'double' range: " + Double.MIN_VALUE + " to " +  Double.MAX_VALUE);

        single32bit = 10.05F;
        assertEquals(10F,single32bit,0.5);
        double64bit = 20.0;
        assertEquals(20D,double64bit,0);
    }

    @Test
    public void CharType(){
        char ch= '\u0026';
        assertEquals(ch,'&');
    }

    @Test
    public void traditionalOperators(){
        assertEquals(4, 2 + 2);
        assertEquals(5L, 10L - 5L);
        assertEquals(25.0F, 12.5f * 2f, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcd","ab" + "cd");
        assertEquals(1,9 % 2);
    }

    @Test
    public void incrementDecrementOperatorExplored(){
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }

    @Test
    public void booleanOperators(){
        assertTrue(4 == 4);
        assertTrue(4 != 5);
        assertTrue(3 < 4);
        assertTrue(5 > 4);
        assertTrue(4 >= 4);
        assertTrue(4 <= 4);
        assertTrue(4 <= 7);
        assertTrue(!false);
        boolean truthy = true;
        assertFalse(!truthy);
    }

    @Test
    public void conditionalOperators(){
        assertTrue(true && true);
        assertTrue(true || false);
        assertTrue(false || true);
        assertFalse(false || false);
        assertFalse(false && false);
    }

    @Test
    public void ternaryOperator(){
        int x;
        x = 4 > 3 ? 2 : 1;
        assertEquals(2,x);
        assertTrue(5 >= 4 ? true:false);
    }

    @Test
    public void someStringMethods(){
        String aString = "abcdef";
        assertEquals(6,aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(aString.contains("bcd"));
        assertTrue(aString.startsWith("abc"));
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }

    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero", "one", "two", "three"};
        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void simpleCollectionExample(){
        String[] numbers0123 = {"zero", "one", "two", "three"};
        List<String> numbers0123List = Arrays.asList(numbers0123);
        for (String numberText : numbers0123List) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void simpleDynamicCollectionExample(){
        List<String> numbers0123List = new ArrayList<>();
        numbers0123List.add("zero");
        numbers0123List.add("one");
        numbers0123List.add("two");
        numbers0123List.add("three");
        for (String numberText : numbers0123List) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123List.get(0));
        assertEquals("three", numbers0123List.get(numbers0123List.size() - 1));
    }

    @Test
    public void setDoesntAllowDuplicates(){
        Set workdays = new HashSet();
        workdays.add("monday");
        workdays.add("monday");
        workdays.add("monday");
        workdays.add("monday");
        workdays.add("monday");
        assertEquals(1, workdays.size());
    }

    @Test
    public void catchPointerPointerException(){
        Integer age = null;
        String ageAsString = "";
        String yourAge;
        try {
            ageAsString = age.toString();
        } catch (NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        } finally {
            yourAge = "You are " + ageAsString + " years old.";
        }
    }

    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";
        url = url.startsWith("http") ? url : addHttp(url);
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    @Test
    public  void ifElseNested(){
        String url = "seleniumsimplified.com";
        if (url.startsWith("http"));
        else {
            if (!url.startsWith("www"))
                url = "www." + url;
            url =addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public  void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    private String likelyGenderIs(String title) {
        String likelyGender;
        switch (title.toLowerCase()){
            case "sir":
            case "ms":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }

    @Test
    public void inheritanceExample1(){
        EmptyUser em = new EmptyUser();
        assertEquals("username", em.getUserName());
        assertEquals("password", em.getPassword());
    }

    @Test
    public void inheritanceExample2(){
        var aUser = new User();
        assertEquals("normal", aUser.getPermission());

    }

    @Test
    public void inheritanceExample3(){
        var anAdminUser = new AdminUser("adminUser", "pwd123");
        assertEquals("adminUser", anAdminUser.getUserName());
        assertEquals("pwd123", anAdminUser.getPassword());
        assertEquals("elevated", anAdminUser.getPermission());
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void checkSecurity() throws InvalidPassword {
        expected.expect(InvalidPassword.class);
        var anAdminUser = new AdminUser("adminUser", "pwd123");
        assertEquals("userName=" + anAdminUser.getUserName() + ", password=" + anAdminUser.getPassword() + ", permission=" + anAdminUser.getPermission(), anAdminUser.getInfo("fdgjh"));
    }


}
