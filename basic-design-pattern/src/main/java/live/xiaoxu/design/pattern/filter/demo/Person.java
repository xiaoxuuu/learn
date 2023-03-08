package live.xiaoxu.design.pattern.filter.demo;

import lombok.Getter;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 03:03
 */
@Getter
public class Person {

    private final String name;

    private final String gender;

    private final String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {

        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}