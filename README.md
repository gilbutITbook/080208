# <코틀린을 다루는 기술> 

이 프로젝트는 <코틀린을 다루는 기술>의 소스 코드립니다.
원서는 <Joy Of Kotlin>입니다.

[영문판 소스코드](https://github.com/pysaumont/fpinkotlin)와는 다음과 같은 차이가 있습니다.

- README.md 파일을 우리말로 작성했습니다.
- 버전을 다음과 같이 바꿨습니다.
     - 그레이들: 5.2.1 (별도 설정을 하지는 않았고 5.2.1 이상 버전을 설치해 사용하십시오. 아마 6.x에서도 될 것 같습니다.)
     - 코틀린: 1.3.61
     - 코틀린테스트: 3.3.2
     - slf4j: 1.7.28
     - junit: 5.6.0
- 그레이들 코틀린 설정 파일에서 `ext`가 작동하지 않기 때문에 `allproject { buildscript { extra ... }}}`를 사용해 추가 
프로퍼티를 정의했습니다. 이에 맞춰 사용하는 부분에서도 `ext` 대신 `extra`를 사용합니다.
- `parent` 밑에 본문 소스코드를 모아뒀습니다.
- `parent/src/main/kotlin/com.fpinkotlin.common/Result.kt`의 동반 클래스 안에 `success`와 `empty`를 추가했습니다. 
`Result.Success`와 `Result.Empty`는 내부(`internal`) 클래스로 같이 컴파일되는 모듈 밖에서 쓸 수 없게 외부 노출을 막아뒀기 때문에
본 예제 코드 구조처럼 그레이들 모듈이 분리되어 있는 경우, `fpinkotlin-common` 모듈 밖에서는 새로 추가한 `Result.empty`나 `Result.success`를 써야 합니다.

# `parent` 하위 디렉터리에 해당하는 본문

`parent`안에 있는 디렉터리 이름이 모두 영단어로만 되어있어서 본문 각 장과 연결하기가 여러울 수도 있습니다. 다음은 디렉터리와 그에 대한 설명입니다.

- `fpinkotlin-actors` : 13장 액터 예제 코드
- `fpinkotlin-advancedlisthandling-exercises` : 8장 연습문제
- `fpinkotlin-advancedlisthandling-solutions` : 8장 해답
- `fpinkotlin-advancedtrees-exercises` : 11장 연습문제
- `fpinkotlin-advancedtrees-solutions` : 11장 해답
- `fpinkotlin-common` : 공통모듈. **앞 장에서 정리한 코드를 재사용해야 하는 경우에는 이 모듈을 임포트해 사용하십시오**
- `fpinkotlin-common-test` : 공통모듈 테스트
- `fpinkotlin-commonproblems` : 14장
- `fpinkotlin-effects-exercises` : 12장 연습문제
- `fpinkotlin-effects-solutions` : 12장 해답
- `fpinkotlin-functions-exercises` : 3장 연습문제
- `fpinkotlin-functions-solutions` : 3장 해답
- `fpinkotlin-handlingerrors-exercises` : 7장 연습문제
- `fpinkotlin-handlingerrors-solutions` : 7장 해답
- `fpinkotlin-lists-exercises` : 5장 연습문제
- `fpinkotlin-lists-solutions` : 5장 해답
- `fpinkotlin-makingprogramssafer` : 1장 예제코드
- `fpinkotlin-optionaldata-exercises` : 6장 연습문제
- `fpinkotlin-optionaldata-solutions` : 6장 해답 
- `fpinkotlin-recursion-exercises` : 4장 연습문제
- `fpinkotlin-recursion-solutions` : 4장 해답
- `fpinkotlin-trees-exercises` : 10장 연습문제
- `fpinkotlin-trees-solutions` : 10장 해답
- `fpinkotlin-workingwithlaziness-exercises` : 9장 연습문제
- `fpinkotlin-workingwithlaziness-solutions` : 9장 해답 

다음은 각 디렉터리를 장별 순서로 나열한 목록입니다. 

- `fpinkotlin-makingprogramssafer` : 1장 예제코드
- `fpinkotlin-functions-exercises` : 3장 연습문제
- `fpinkotlin-functions-solutions` : 3장 해답
- `fpinkotlin-recursion-exercises` : 4장 연습문제
- `fpinkotlin-recursion-solutions` : 4장 해답
- `fpinkotlin-lists-exercises` : 5장 연습문제
- `fpinkotlin-lists-solutions` : 5장 해답
- `fpinkotlin-optionaldata-exercises` : 6장 연습문제
- `fpinkotlin-optionaldata-solutions` : 6장 해답 
- `fpinkotlin-handlingerrors-exercises` : 7장 연습문제
- `fpinkotlin-handlingerrors-solutions` : 7장 해답
- `fpinkotlin-advancedlisthandling-exercises` : 8장 연습문제
- `fpinkotlin-advancedlisthandling-solutions` : 8장 해답
- `fpinkotlin-workingwithlaziness-exercises` : 9장 연습문제
- `fpinkotlin-workingwithlaziness-solutions` : 9장 해답 
- `fpinkotlin-trees-exercises` : 10장 연습문제
- `fpinkotlin-trees-solutions` : 10장 해답
- `fpinkotlin-advancedtrees-exercises` : 11장 연습문제
- `fpinkotlin-advancedtrees-solutions` : 11장 해답
- `fpinkotlin-effects-exercises` : 12장 연습문제
- `fpinkotlin-effects-solutions` : 12장 해답
- `fpinkotlin-actors` : 13장 액터 예제 코드
- `fpinkotlin-commonproblems` : 14장 예제코드
- `fpinkotlin-common` : 공통모듈. **앞 장에서 정리한 코드를 재사용해야 하는 경우에는 이 모듈을 임포트해 사용하십시오**
- `fpinkotlin-common-test` : 공통모듈 테스트



