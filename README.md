# Junit4-Hamcrest-Matchers-Custom
 We can build our own matchers to use in assertThat. <br/>
 Call it a lessThanOrEqual matcher. It should be allowed to use with any object that <br/>
can be compared so that we can use any <br/>
custom class that implements the Comparable interface. <br/>
Hamcrest recommends extending org.hamcrest.BaseMatcher. <br/> 
The assertThat method will pass the actual value to the matcher's  <br/>
matches(Object o) method, and lessThanOrEqual will accept a value  <br/>
to compare with the actual. In the matches method, we need two  <br/>
comparable objects: one passed as a parameter and the other passed to a <br/>
matcher object.<br/> 
When we create many custom matchers, then it becomes annoying to import <br/>
them all individually. Hamcrest ships with a org.hamcrest.generator.config.XmlConfigurator <br/>
command-line tool that picks up predicates annotated with the @Factory annotation and  <br/>
collects them in a Matcher classfor easy importing. <br/>
Hamcrest supports creating customized assertion matchers ('Hamcrest' is an anagram of 'matchers'),  <br/>
allowing match rules to be defined declaratively. <br/> 

Parameterized tests are used for multiple iterations over a single input to stress the <br/> 
object in test. The primary reason is to reduce the amount of test code. <br/>  
If the dataset returns an empty collection, the test doesn't fail;nothing happens. <br/> 
If the number of parameters in the object array and the constructor argument don't match,  <br/> 
then a java.lang.IllegalArgumentException: wrong number of arguments  <br/> 
exception is thrown.  <br/> 
For example, { 0, 1, 3 } will throw an exception as 3  <br/> 
arguments are passed, but constructor can accept only 2. <br/> 
If the constructor is not defined but the data set contains a value, then  <br/> 
the java.lang.IllegalArgumentException: wrong number of arguments exception is thrown. <br/> 

The ErrorCollector rule allows the execution of a test to continue after the first   <br/> 
problem is found (for example, to collect all the incorrect rows in a table and report   <br/> 
them all at once)   <br/> 

Verifier's verify method is executed after each test execution. If the verify method   <br/> 
defines any assertions, and that assertion fails, then the test is marked as failed.  <br/> 

# Mockito
To install Mockito, you need to download mockito-all-1.9.5.jar not mockito-core-1.9.5 <br/>
because you will get java.lang.NoClassDefFoundError: org/objenesis/ObjenesisStd ERROR! <br/>
A mock can be created with the help of a static mock() method. <br/>
There's another alternative; you can use the @Mock annotation.<br/>
to work with the @Mock annotation, you are required to call MockitoAnnotations.initMocks( this ) before using the mocks,  <br/>
or use MockitoJUnitRunner as a JUnit runner.<br/>
The Mockito framework supports stubbing and allows us to return a given value <br/>
when a specific method is called. This can be done using Mockito.when() along with thenReturn ().<br/>
The following methods are used to represent what to do when the trigger is triggered:<br/>
• thenReturn(x): This returns the x value.<br/>
• thenThrow(x): This throws an x exception.<br/>
• thenAnswer(Answer answer): Unlike returning a hardcoded value, <br/><br/>
a dynamic user-defined logic is executed. It's more like for fake test doubles, Answer is an interface.<br/>
• thenCallRealMethod(): This method calls the real method on the mock object.<br/>

The verify method verifies the invocation of mock objects.<br/>
The following methods are used in conjunction with verify:<br/>
• times(int wantedNumberOfInvocations)<br/>
• never()<br/>
• atLeastOnce()<br/>
• atLeast(int minNumberOfInvocations)<br/>
• atMost(int maxNumberOfInvocations)<br/>
• only()<br/>
• timeout(int millis)<br/>
The verifyZeroInteractions(Object... mocks) method verifies whether no <br/>
interactions happened on the given mocks.<br/>
The verifyNoMoreInteractions(Object... mocks) method checks whether any <br/>
of the given mocks has any unverified interaction.<br/>
The Matchers.argThat(Matcher) method is used in conjunction with the verify <br/>
method to verify whether a method is invoked with a specific argument value.<br/>

Mockito provides a method called thenThrow(Throwable); this method throws  <br/>
an exception when the stubbed method is invoked.<br/>

The varargs version of thenReturn(objects...) takes comma-separated return <br/>
values and returns the arguments in order such that if we pass two arguments to the <br/>
thenReturn method, then the first call to the stubbed method will return the first <br/>
argument.<br/>

Stubbed methods return a hardcoded value but cannot return an on the fly result. <br/>
The Mockito framework provides the callbacks to compute the on the fly results.<br/>
Mockito allows stubbing with the generic Answer interface.<br/>

The syntax of Answer is when(mock.someMethod()).thenAnswer(new Answer() {…}); <br/>
or when(mock.someMethod()).then(answer);, which is similar to  thenReturn() and thenThrow().<br/>

A Mockito spy object allows us to use real objects instead of mocks by replacing <br/>
some of the methods with the stubbed ones. This behavior allows us to test the <br/>
legacy code; one cannot mock a class that needs to be tested. Legacy code comes with <br/>
methods that cannot be tested, but other methods use them; so, these methods need <br/>
to be stubbed to work with the other methods. A spy object can stub the nontestable <br/>
methods so that other methods can be tested easily.<br/>
Spy is also known as partial mock; <br/>

Stubbing void methods<br/>

The doNothing() API does nothing.(used for consecutive calls on a void method).<br/>
The doCallRealMethod() API is used when you want to call the real <br/>
implementation of a method on a mock or a spy object.<br/>
The doReturn() method is similar to stubbing a method and returning an expected <br/>
value. This is used only when when(mock).thenReturn(return) cannot <br/>
be used.<br/>
example: when(spy.get(0)).thenReturn("not reachable"); //IndexOutofBoundsException<br/>
This can be protected using doReturn() as shown in the following code:<br/>
doReturn("now reachable").when(spy).get(0);<br/>
assertEquals("now reachable", spy.get(0));<br/>

Mockito allows us to change the default settings. <br/>
The following are the allowed settings: <br/>
• RETURNS_DEFAULTS: This is the default setting. It returns null for object, false for Boolean, and so on. <br/>
• RETURNS_SMART_NULLS: This returns spy of a given type. <br/>
(Unstubbed methods often return null. If your code uses the object returned by an unstubbed call you get a NullPointerException. <br/>
This implementation of Answer returns SmartNull instead of null. <br/>
SmartNull gives nicer exception message than NPE because it points out the line where unstubbed method was called. <br/>
You just click on the stack trace.) <br/>
• RETURNS_MOCKS: This returns mocks for objects and the default value for primitives. <br/>
• RETURNS_DEEP_STUBS: This returns a deep stub. (Verification only works with the last mock in the chain.)<br/>
• CALLS_REAL_METHODS: This calls a real method.<br/>
A reset method clears the stubs. <br/>
Mockito.mockingDetails identifies whether a particular object is a mock or a spy. <br/>
The difference is that in mock, you are creating a complete mock or fake object while in spy, <br/>
there is the real object and you just spying or stubbing specific methods of it. <br/>

Behavior-driven development with Mockito <br/>
BDDMockito class introduces an alias so that we can stub method calls with the given(object) method. <br/>
The following methods are used in conjunction with given: <br/>
• willReturn(a value to be returned): This returns a given value. <br/>
• willThrow(a throwable to be thrown): This throws a given exception. <br/>
• will(Answer answer) and willAnswer(Answer answer): This is similar to then(answer) and thenAnswer(answer.) <br/>
• willCallRealMethod(): This calls the real method on the mock object or spy. <br/>


# Designing for testability
We cannot unit test code when testing impediments are present; we refactor the code and move the <br/>
impediments out (to another class or methods), and during testing, the impediments <br/>
are replaced with mock objects. <br/>
The following Java constructs go up against mocking the  <br/>
testing impediments:<br/>
• Constructors initialize testing impediments
• Class-level variable declaration and initialization
• The private methods
• The final methods
• The static methods
• The final classes
• Use of new
• Static variable declaration and initialization
• Static initialization blocks
