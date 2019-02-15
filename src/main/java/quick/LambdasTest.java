@RunWith(JUnitParamsRunner.class)
public class LambdasTest(){

	// public static void main(String[] args) {
	// 	List <String> someList = Arrays.asList("some", "string", "is", "here");
	// 	Collections.sort(someList, (String a,String b) -> b.compareTo(a));
	// 	}


TestingClassName testingClassName;


//możemy sprawdzac nasze exceptiony


public ExpectedException thrown = ExcpectedExpetion.none();

@Before // given
public ReturnType setUp(arguments s)
{
testingClassName = new TestingClassName;
}


@Test
@Parameters
public ReturnType someTestingMethod(Arguments a){
	double someType = testingClassName.testingMethodName(agruments ect)
	Assert.assertEquals(result, a);
	thrown.expect(SomeExttenions.class);
	thrown.expectMessage("Here must be the same excepiton as in testing method class");


	//we can test like this

	try{
		//some methods
	}
	catch(Exception e){
		System.out.println("U have exception");
	}
}

private Object[] parametersForSomeTestingMethod()
{
return new Object[]{someParameter, someparameter},
new Object[]{someAnotherParamterWithOutQuotes,wpisujemyBezUszu},
new Object[]{Integer.MAX_VALUE,Integer.MIN_VALUE};

}



@After
public void closeMethod(){
	System.out.println("metoda zamykająca");
}

}