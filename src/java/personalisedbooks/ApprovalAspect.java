package personalisedbooks;

import org.aspectj.lang.JoinPoint;

public class ApprovalAspect {
  
  
  public void doBefore(JoinPoint jp){
    System.out.println("Do Before"); 
  }
  
}