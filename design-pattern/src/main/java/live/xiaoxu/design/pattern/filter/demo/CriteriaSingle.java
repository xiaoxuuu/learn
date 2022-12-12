package live.xiaoxu.design.pattern.filter.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 03:04
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}