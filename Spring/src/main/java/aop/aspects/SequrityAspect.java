package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SequrityAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSequrityAdvice: check " + "book/magazine");
    }
}
