# db logic

controller <-> service <-> repository 

controller : 진입점
service : 로직 처리
repository : db. 데이터 저장소

@Service : 여기는 서비스가 들어가는 빈의 영역이다. db의 영역임을 나타냄

@RequiredArgsConstructor : 생성자 메소드로 채워줘

@Configuration : 여기는 설정하는 곳이야. 앱이 실행될 때 configuration을 찾아 bean context에 객체로 만들어 둠. @Service를 못하는 곳에서 사용할 수 있음

@Bean : 넌 이제 bean으로 만들어져서 spring이 관리할꺼야

```
@Bean
public UserRepository userRepository(){
    return new UserRepository();
}
```

@Autowired: bean context에 있는 여러 객체들 중 해당하는 녀셕을 주입해 줌
bean context에 들어가기 위해선 @service, @bean 등 여러 방식이 있다.