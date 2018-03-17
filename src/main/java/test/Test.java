package test;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
  
public static void main(String[] args) {  
	
    ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");  
      
    DaoDb dao=(DaoDb)ctx.getBean("edao");  
    int status=dao.saveEmployee(new employee(105,"Amit"));  
    System.out.println(status);  
          
    int status1=dao.updateEmployee(new employee(102,"Sonoo")); 
    System.out.println(status1); 
      
          
    /*Employee e=new Employee(); 
    e.setId(102); 
    int status=dao.deleteEmployee(e); 
    System.out.println(status);*/  
      
}  
  
} 