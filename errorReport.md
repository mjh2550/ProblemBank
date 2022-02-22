# 1. template parsing error
상황 : Controller에서 ModelandView 객체를 리턴하였는데 template parsing error 출력
원인 : thymeleaf경로 설정 오류
해결 : thymeleaf설정 파일에서 경로설정 시 '/WEB-INF/templates' 내용을 'classpath:/templates/' 로 변경
