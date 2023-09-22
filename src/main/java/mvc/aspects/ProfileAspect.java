package mvc.aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProfileAspect  {
//   Advice	(point cut)
// WHEN to apply code ( WHO do you apply code to)
	
	@Before("within(mvc.service.LoginBusiness)")
	public void commonCode() throws Throwable{
		System.out.println( " in aspect ");
	}
	/*
	@Around("within(mvc.service.LoginBusiness)")
	public boolean commonCode(ProceedingJoinPoint jp) throws Throwable{
		System.out.println( " in aspect ");
		boolean res=(boolean)jp.proceed();
		System.out.println( " in aspect again");
		return res;
	}
	*/
	
	/*
	@Around("within(com.spring.beans.CartBean)")
	public String getResponseTime(ProceedingJoinPoint  joinPoint) throws Throwable{
		System.out.println(" aspect code before");
		String s=(String)joinPoint.proceed();
		System.out.println("aspect code after");
		return s;
	}
	*/	
}
