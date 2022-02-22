# 문제 은행 시스템 프로젝트 (ProblemBank : 문제 - In)
2022.02 ~

## 개발 팀원
*고찬윤, 문지홍

## 개발 환경
*Spring ,Spring-boot,thymeleaf , JPA, MariaDB , OracleDB

## 개발 내용

*관리자 - 이미지, 텍스트 파일의 문제를 업로드 할 수 있고, 사용자의 점수 통계 분석 가능

*사용자 - 관리자가 업로드한 문제 응시 가능

### Memo

*시험지 이미지 업로드 시 화면에서 캡쳐한 영역을 저장, 문제 별 정답 설정 가능

*시험지 텍스트 파일, CSV 파일 업로드 시 문제/정답 별로 자동 세팅


## PATH

### BACK_END
CODE_PACKAGE : src/main/java/com/problem/bank/mjin
* CODE_PACKAGE/* : 설정
* CODE_PACKAGE/common/* : 공통 로직, 데이터 모델 , db
* CODE_PACKAGE/admin/* : 관리자
* CODE_PACKAGE/user/* : 사용자


### FRONT_END
VIEW_PACKAGE : src/main/resource
* VIEW_PACKAGE/views/admin/* : 관리자 view
* VIEW_PACKAGE/views/user/* : 사용자 view
* VIEW_PACKAGE/views/layout : 레이아웃
* VIEW_PACKAGE/views/asset : 컴포넌트

