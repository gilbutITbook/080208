# <코틀린을 다루는 기술> 

이 저장소에는 <코틀린을 다루는 기술>의 소스 코드가 담겨 있습니다.

- 이 프로젝트에서 사용한 버전은 다음과 같습니다.
     - 그레이들: 5.2.1
     - 코틀린: 1.3.61
     - 코틀린테스트: 3.4.2
     - slf4j: 1.7.28
     - junit: 5.6.0

- 그레이들 코틀린 설정 파일에서 `ext`가 작동하지 않기 때문에 `allproject { buildscript { extra ... }}}`를 사용해 추가 프로퍼티를 정의했습니다. 이에 맞춰 사용하는 부분에서도 `ext` 대신 `extra`를 사용합니다.
- `parent` 밑에 예제 및 연습문제의 소스 코드가 있습니다.
- `parent/src/main/kotlin/com.fpinkotlin.common/Result.kt`의 동반 클래스 안에 `success`와 `empty`를 추가했습니다. 
- `Result.Success`와 `Result.Empty`는 내부(`internal`) 클래스로 같이 컴파일되는 모듈 밖에서 쓸 수 없게 외부 노출을 막아뒀기 때문에 본 프로젝트 구조처럼 그레이들 모듈이 분리되어 있는 경우에 `fpinkotlin-common` 모듈 밖에서는 새로 추가한 `Result.empty`나 `Result.success`를 사용해야 합니다.

- [영문판 소스 코드](https://github.com/pysaumont/fpinkotlin)에서 JUnit4 패키지에 있는 애너테이션을 임포트해 쓰던 부분을 JUnit5로 바꿨습니다.

## 프로젝트 다운로드 방법

프로젝트를 다운로드하는 방법은 두 가지입니다. 

- 프로젝트 페이지에서 ZIP 다운로드 버튼을 클릭하여 ZIP 아카이브를 다운로드한 다음 선택한 디렉터리에서 압축을 풉니다.
- 프로젝트를 수정하거나 추가할 때 쉽게 업데이트할 수 있도록 Git을 사용하여 프로젝트를 복제할 수 있습니다. 단, PC에 Git이 설치되어 있어야 합니다.

## 프로젝트 실행 방법

IntelliJ로 프로젝트를 실행하기를 권장합니다. IntelliJ가 없다면 [JetBrains 사이트](https://www.jetbrains.com/ko-kr/idea/download/#section=windows)에서 커뮤니티 버전을 다운로드하세요. 

### IntelliJ로 프로젝트 가져오기

- 메뉴에서 _File > New > Project from exisiting sources_ 를 선택합니다.
- 파일 선택기 대화 상자에서 `parent` 디렉터리를 선택하고 _OK_ 버튼을 클릭합니다.
- 다음 대화 상자에서 _Import project from external model_ 옵션을 체크하고 _Gradle_ 을 선택한 다음 _Finish_ 버튼을 클릭합니다.

### 테스트

연습문제마다 올바른 해법을 구현할 때까지 확인할 수 있는 테스트가 들어 있습니다. 본인이 작성한 해법을 테스트하려면 해당 테스트를 실행해 보세요.

- 각 연습문제의 `src/main` 디렉터리와 동일 패키지를 사용하는 테스트 파일이 `src/test` 디렉터리에 들어 있습니다.
- 테스트 파일을 열고 클래스 이름 왼쪽의 작은 녹색 원을 클릭한 후 _Run_ 을 선택합니다.

## `parent` 하위 디렉터리

`parent` 하위 디렉터리와 본문에서 해당하는 장을 정리한 목록입니다.  

- `fpinkotlin-actors` : 13장 액터 예제코드
- `fpinkotlin-advancedlisthandling-exercises` : 8장 연습문제
- `fpinkotlin-advancedlisthandling-solutions` : 8장 해답
- `fpinkotlin-advancedtrees-exercises` : 11장 연습문제
- `fpinkotlin-advancedtrees-solutions` : 11장 해답
- `fpinkotlin-common` : 공통모듈. **앞 장에서 정리한 코드를 재사용해야 하는 경우에는 이 모듈을 임포트해 사용하십시오**
- `fpinkotlin-common-test` : 공통모듈 테스트
- `fpinkotlin-commonproblems` : 14장 예제코드
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

다음은 각 디렉터리를 장 순서로 나열한 목록입니다. 

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
- `fpinkotlin-actors` : 13장 액터 예제코드
- `fpinkotlin-commonproblems` : 14장 예제코드
- `fpinkotlin-common` : 공통모듈. **앞 장에서 정리한 코드를 재사용해야 하는 경우에는 이 모듈을 임포트해 사용하십시오**
- `fpinkotlin-common-test` : 공통모듈 테스트

부록 관련 코드는 `examples`에 있습니다.
