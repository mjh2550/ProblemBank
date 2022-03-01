# 문제 은행 시스템 프로젝트 (ProblemBank : 문제 - In)
2022.02.01 ~

## 개발 팀원
*고찬윤, 문지홍

## 개발 환경
*Spring ,Spring-boot,thymeleaf , JPA, MariaDB , OracleDB

## 개발 내용

*관리자 - 이미지, 텍스트 파일의 문제를 업로드 할 수 있고, 사용자의 점수 통계 분석 가능

*사용자 - 관리자가 업로드한 문제 응시 가능

### Memo

* 시험지 이미지 업로드 시 화면에서 캡쳐한 영역을 저장, 문제 별 정답 설정 가능
* 시험지 텍스트 파일, CSV 파일 업로드 시 문제/정답 별로 자동 세팅
* 기존 패키지 구조는 컨트롤러,서비스,모델,레포지토리를 한 패키지 안에 구성하지만, 본 패키지는 다중DB 설정에 의해 레포지토리와 데이터 모델을 분리함.



## PATH

### BACK_END
* CODE_PACKAGE : src/main/java/com/problem/bank/mjin
* DB : maria , ora
* 화면
  - admin : main , upload
  - user : main 
  
* 경로
  * CODE_PACKAGE/config/* : 설정
  * CODE_PACKAGE/db/* : db 데이터 모델, 레포지토리 
  * CODE_PACKAGE/admin/* : 관리자 화면 비즈니스 로직(컨트롤러, 서비스)
  * CODE_PACKAGE/client/* : 사용자 화면 비즈니스 로직(컨트롤러, 서비스)
  

### FRONT_END
VIEW_PACKAGE : src/main/resource
* VIEW_PACKAGE/views/admin/* : 관리자 view
* VIEW_PACKAGE/views/user/* : 사용자 view
* VIEW_PACKAGE/views/layout : 레이아웃
* VIEW_PACKAGE/views/asset : 컴포넌트

### Reference
[Thymeleaf 핵심 기능](https://velog.io/@sungjin0757/Spring-MVC-Thymeleaf1-%EA%B8%B0%EB%B3%B8-%EA%B8%B0%EB%8A%A5)

[Thymeleaf ajax](https://chung-develop.tistory.com/8)

[JPA 쿼리문 작성하는법](https://jforj.tistory.com/90)

[Java 직렬화(Serializable) 란?](https://haranglog.tistory.com/4)

