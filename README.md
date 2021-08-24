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
To install Mockito, you need to download mockito-all-1.9.5.jar not mockito-core-1.9.5 because you will get java.lang.NoClassDefFoundError: org/objenesis/ObjenesisStd ERROR!
