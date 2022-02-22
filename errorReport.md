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
