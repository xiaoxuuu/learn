package live.xiaoxu.design.pattern.filter.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 03:03
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}