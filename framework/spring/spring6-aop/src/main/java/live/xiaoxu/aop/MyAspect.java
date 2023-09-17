package live.xiaoxu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* live.xiaoxu.service..*(..))")
    public void divPointCut() {
    }

    @Before("divPointCut()")
    public void beforeNotify() {
        System.out.println("@Before 前置通知");
    }

    @After("divPointCut()")
    public void afterNotify() {
        System.out.println("@After 后置通知");
    }

    @AfterReturning("divPointCut()")
    public void afterReturningNotify() {
        System.out.println("@AfterReturning 返回通知");
    }

    @AfterThrowing("divPointCut()")
    public void afterThrowingNotify() {
        System.out.println("@AfterThrowing 异常通知");
    }

    @Around("divPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object retVal;
        System.out.println("@Around 环绕通知之前");
        retVal = proceedingJoinPoint.proceed();
        System.out.println("@Around 环绕通知之后");
        return retVal;
    }
}