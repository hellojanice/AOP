
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;


@Aspect
public class AspectDemo {

    @Pointcut("execution(* com.ta.test.IAspectMethod+.*(..))")
//    @Pointcut("execution(public * com.ringcentral.ta.glip.test.AspectMethod.*(..))")
    private void anyMethod(){}
//
//    @Before("anyMethod() && args(name,name2)")
//    public void doAccessCheck(int name,String name2){
//        System.out.println(name);
//        System.out.println("before advice with args");
//    }
//    @Before("anyMethod()")
//    public void doAccessCheck(){
//        System.out.println("before advice");
//    }

    @AfterReturning("anyMethod()")
    public void doAfter(){
        System.out.println("after return advice");
    }

    @After("anyMethod()")
    public void after(JoinPoint joinPoint){
        String methodName = ((MethodSignature)joinPoint.getSignature()).getMethod().getName();
        System.out.println("after");
        System.out.println(methodName);
    }

    @AfterThrowing("anyMethod()")
    public void doAfterThrow(JoinPoint joinPoint){
        String methodName = ((MethodSignature)joinPoint.getSignature()).getMethod().getName();
        System.out.println(methodName);
        System.out.print("Exception");
    }

    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
        String methodName = ((MethodSignature)pjp.getSignature()).getMethod().getName();
        System.out.println("around "+methodName);
        Object object = pjp.proceed();
        System.out.println("quit "+methodName);
        return object;
    }



}
