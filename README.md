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
