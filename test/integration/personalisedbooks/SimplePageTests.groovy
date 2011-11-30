package personalisedbooks

import grails.test.*

class SimplePageTests extends GroovyPagesTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testSomething() {

      String output = applyTemplate(new File("grails-app/views/index.gsp").text , [:])
      
      println output

    }
}
