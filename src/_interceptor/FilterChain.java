package _interceptor;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private final List<Filter> filters = new ArrayList<>();
    private final Http target;

    public FilterChain(Http target) {
        this.target = target;
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute() {
        filters.forEach(filter -> filter.filter(target));
        target.execute();
    }
}
