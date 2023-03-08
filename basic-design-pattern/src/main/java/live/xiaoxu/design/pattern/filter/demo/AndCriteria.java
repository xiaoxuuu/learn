package live.xiaoxu.design.pattern.filter.demo;

import java.util.List;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 03:04
 */
public class AndCriteria implements Criteria {

    private final Criteria criteria;

    private final Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {

        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}