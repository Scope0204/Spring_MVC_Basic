package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger; // slf4j 인터페이스를 사용한다
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); //롬북의 Slf4j에 의해 자동으로 추가

    @RequestMapping("/log-test")
    public String logTest(){
        String name ="Spring";

        System.out.println("name = " + name); // 무조건 출력됨

        log.trace("trace log={},{}",name);
        log.debug("debug log={},{}",name);
        log.info("info log={}", name);
        log.warn("warn log={},{}",name);
        log.error("error log={},{}",name);

        log.info("info log=" + name); // + 써도 작동은되나, 자바언어의 특징상 + 연산자가 우선적으로 실행되어 출력레벨과 관계없이 쓸모없이 리소스를 사용하게 됨
        // , 는 name 이라는 파라미터를 넘기기 때문에 출력레벨에 걸리게되면 사용하지 않음


        return "ok";
    }
}
