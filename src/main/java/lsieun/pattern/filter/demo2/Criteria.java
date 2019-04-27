package lsieun.pattern.filter.demo2;

import java.util.List;

interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
