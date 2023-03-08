package live.xiaoxu.design.pattern.filter.demo;

import java.util.List;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 03:04
 */
public class OrCriteria implements Criteria {

    private final Criteria criteria;

    private final Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {

        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}