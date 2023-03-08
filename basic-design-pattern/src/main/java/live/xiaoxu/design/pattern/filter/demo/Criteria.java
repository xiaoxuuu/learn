package live.xiaoxu.design.pattern.filter.demo;

import java.util.List;

/**
 * @author Xiao Xu
 * @date 2021/9/23 下午 03:03
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}