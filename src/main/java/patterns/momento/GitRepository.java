package patterns.momento;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.toUnmodifiableSet;

public class GitRepository {

    private final Map<Integer, Project.ProjectCommit> history;

    private final AtomicInteger version;

    public GitRepository() {
        history = new HashMap<>();
        version = new AtomicInteger(1);
    }

    public void push(Project.ProjectCommit projectCommit) {
        history.put(version.getAndIncrement(), projectCommit);
    }

    public Set<Project.ProjectCommit> log() {
        return history.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .collect(toUnmodifiableSet());
    }

    public Project.ProjectCommit getLastVersion() {
        return getByVersion(version.get());
    }

    public Project.ProjectCommit getByVersion(int version) {
        return history.get(version);
    }

}
