# <코틀린을 다루는 기술>

이 저장소는 <코틀린을 다루는 기술>의 소스 코드를 담고 있습니다.

## 소스 코드 실행 방법

소스 코드는 다음과 같이 실행할 수 있습니다.

- 터미널에서 그레이들 명령 실행(Running Gradle commands in a terminal)
- Eclipse에서 임포트하기(Importing in Eclipse - with limitations)
- 인텔리J에서 임포트하기(Importing in IntelliJ)

## 소스 코드 다운로드 방법 

소스 코드는 다음 두 가지 방법으로 다운로드할 수 있습니다.

- [코틀린을 다루는 기술](https://github.com/gilbutITbook/080208) 페이지에서 _Download ZIP_ 버튼을 클릭하하여 아카이브를 다운로드한 다음, 다운로드한 디렉토리에서 압축을 풉니다.
- Git을 사용하여 소스 코드를 복제 할 수 있습니다. 이 방법을 사용하려면 PC에 Git이 설치되어 있어야 합니다.

## 인텔리J에서 임포트하기

IntelliJ는 Kotlin 개발을위한 최고의 지원과 완전한 Gradle 통합을 제공합니다. IntelliJ가없는 경우 [젯브레인스](https://www.jetbrains.com/idea/download) 사이트에서 커뮤니티 버전을 무료로 다운로드하세요. 무료 버전만으로도 이 책에 나온 예제를 사용하고 연습문제를 푸는 데 충분합니다.


To import the project into IntelliJ:
 
 - open the _File_ menu and select _New_ > _Project from exisiting sources_. 
 
 - In the file chooser dialog box, select the _fpinkotlin-parent_ directory and click _OK_
 
 - in the new dialog box, check the _Import project from external model option_, select _Gradle_ and click _Next to get the following dialog box:
 
![Import project](graphics/ImportProject.png)
 
 - Click _Finish_ and wait until import is complete

### 테스트 방법

Each exercise as has a corresponding test that will fail until you implement a valid solution. To test you solution, simply run the corresponding test:

- Open the test file. For each exercise in the `src/main/kotlin` diretory, the test in the `src/test/kotlin` directory using the exact same package.

- Right click on the little green circle left to the class name an select _Run <test name>.

## 그레이들로 테스트하는 방법

If you do not want to use IntelliJ, you can use any text editor to create an implementation for an exercise. Then you can run the corresponding test using Gradle from the command line. If you chose this solution, I suppose you will already have Gradle setup. If not, just download the current version from the Gradle site and install it.

### 단일 테스트 실행

The command to use to run all tests with Gradle is:

    gradle test

However, this is not what you'll want since it would take to much time and it would run tests for exercises you have not solved yet, and these tests would fail.

Let's say you just solved `exercise01` in the `fpinkotlin-advancedlisthandling-exercises` module. The name of the test class is `ListTest`. To run this single test, use the following command:

    gradle :fpinkotlin-advancedlisthandling-exercises:test --tests com.fpinkotlin.advancedlisthandling.exercise01.ListTest

If the test fails, you will get something like:

    com.fpinkotlin.advancedlisthandling.exercise01.ListTest > ListTest.length FAILED
        java.lang.AssertionError
    
    1 test completed, 1 failed
    :fpinkotlin-advancedlisthandling-exercises:test FAILED
    
    FAILURE: Build failed with an exception.
    
    * What went wrong:
    Execution failed for task ':fpinkotlin-advancedlisthandling-exercises:test'.
    > There were failing tests. See the report at: file://<PATH_TO_PROJECT>/fpinkotlin-parent/fpinkotlin-advancedlisthandling-exercises/build/reports/tests/index.html

Fix your solution and try again.

On the other hand, if the test succeeds, you get something like:

    ...
    
    :fpinkotlin-advancedlisthandling-exercises:test
    
    BUILD SUCCESSFUL
    
    Total time: 15.67 secs

If you think some information is missing, I will agree. You can use the `--info` option to get a -little- lot more information:

gradle :fpinkotlin-advancedlisthandling-exercises:test --info --tests com.fpinkotlin.advancedlisthandling.exercise01.ListTest

    ...
    
    Successfully started process 'Gradle Test Executor 1'
    Gradle Test Executor 1 started executing tests.
    Gradle Test Executor 1 finished executing tests.
    Finished generating test XML results (0.029 secs) into: /media/KINGSTON2/fpinkotlin/fpinkotlin/fpinkotlin-parent/fpinkotlin-advancedlisthandling-exercises/build/test-results
    Generating HTML test report...
    Finished generating test html results (0.024 secs) into: /media/KINGSTON2/fpinkotlin/fpinkotlin/fpinkotlin-parent/fpinkotlin-advancedlisthandling-exercises/build/reports/tests
    :fpinkotlin-advancedlisthandling-exercises:test (Thread[main,5,main]) completed. Took 3.192 secs.
    
    BUILD SUCCESSFUL
    
    Total time: 16.222 secs

Here is the report for a failed test:

![Failed Test 1](graphics/failedTest01.png)

You may click on the test name to get detailed about what happened:

![Failed Test 2](graphics/failedTest02.png)

Once the problem is fixed, the test succeeds and you get the following report:

![Successful Test](graphics/successTest03.png)

## 연습문제 실행

For each chapter, you will find two modules called `chaptername-exercises` and `chaptername-solutions` . Go to the first exercise in
the `src/main/kotlin` hierarchy. Here, you will find some code with either a comment saying "To be implemented" or function(s) with the
implementation replaced with a single line throwing a runtime exception. Just implement the missing code.

Note that code is often duplicated from one exercise to the another, so you should not look at the code for exercise 2 before doing exercise 1,
since exercise 2 will often contain the solution to exercise one.

## 해법 보기

If you don't find the correct solution to an exercise, you can look at the corresponding `chaptername-solutions` module. You may run the solution
test to verify that the solution is working.

## Remarks

Lots of code is duplicated. This is done so that all exercises are made as independent as possible. However, code reused from previous chapters
is copied to the `fpinjava-common` module and should be used from there.

## Module names

Code modules are generally named after the chapter titles, and not the chapter numbers, which sometimes make them difficult to find. Here is the list of the modules:

* Chapter 1: fpinkotlin-introduction

* Chapter 2: This chapter has no corresponding module

* Chapter 3: fpinkotlin-functions

* Chapter 4: fpinkotlin-recursion

* Chapter 5: fpinkotlin-lists

* Chapter 6: fpinkotlin-optionaldata

* Chapter 7: fpinkotlin-handlingerrors

* Chapter 8: fpinkotlin-advancedlisthandling

* Chapter 9: fpinkotlin-Workingwithlaziness

* Chapter 10: fpinkotlin-trees

* Chapter 11: fpinkotlin-advancedtrees

* Chapter 12: fpinkotlin-effects

* Chapter 13: fpinkotlin-actors

* Chapter 14: fpinkotlin-commonproblems

## 부록용 코드

The code examples for appendix A & B are to be found in the
[kotlingradle repository](https://github.com/pysaumont/fpinkotlin/tree/master/examples/kotlingradle)

