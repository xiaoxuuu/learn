package live.xiaoxu.service;

import org.springframework.stereotype.Service;

@Service
public class DoSomethingService {

    public String doSomething() {

        System.err.println("InProgress");
//        int a = 0 / 0;
        return "doSomething";
    }
}