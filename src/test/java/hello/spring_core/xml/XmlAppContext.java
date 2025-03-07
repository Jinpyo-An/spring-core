package hello.spring_core.xml;

import hello.spring_core.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class XmlAppContext {

    @Test
    void xmlAppContext() {
        final ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        final MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
