package mvc.aspects;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProfileAspect  {
	
	@Before("within(mvc.service.LoginBusiness)")
	public void getResponseTime( ) throws Throwable{
		System.out.println( " this is the common aspect code");
	}
	
	
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
