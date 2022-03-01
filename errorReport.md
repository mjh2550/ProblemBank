# 1. template parsing error
상황 : Controller에서 ModelandView 객체를 리턴하였는데 view를 찾지 못하고 'template parsing error' 출력

원인 : thymeleaf 경로 설정 오류

해결 : thymeleaf 설정 파일에서 경로설정 시 '/WEB-INF/templates' 내용을 'classpath:/views/' 로 변경

    @Bean
    public SpringResourceTemplateResolver thymeleafTemplateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        //templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setPrefix("classpath:/views/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("UTF-8");
        return templateResolver;
    }



# 2. The dependencies of some of the beans in the application context form a cycle(중복성 순환 참조)
상황 : 스프링 Bean 컨테이너의 의존성 주입 시 문제 발생

원인 : 순환 종속성 또는 순환 참조 문제는 둘 이상의 Bean이 생성자를 통해 서로를 주입하려고할 때 발생한다.
        -> @Autowired 가 두개이상 일 때 발생하는 문제!!

해결  
시도 1 : @RequiredArgsConstructor 사용
        -> 생성자 순환참조 방지, final 객체를 알아서 생성자에 넣어줌
        => 실패, 같은문제 출력

원인 2 : 다중DB설정 시 basePackage의 경로는 항상 고정이기 때문에 dbpackage 상위에 소스가 존재해야 함

시도 2 : BasePackage 구조 변경, 가장 상위 패키지에 maria, ora 등의 DB패키지 형성
        => 상관없는 듯
        
시도 3 : Repository의 메서드 명을 getAllList에서  findAll(기존에 있던 메서드) 로 변경 
        => 


# 3. Ajax 시 Controller 400 error
상황 : ajax 통신 중 컨트롤러 호출 시 에러 발생

원인 : @RestController 대신 @Controller 사용
 -> @RestController는 @Controller와 @ResponseBody의 조합이다.

해결 : 변경

Reference : [@RestController 와 @Controller의 차이](https://dncjf64.tistory.com/288)


