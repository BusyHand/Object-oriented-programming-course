package patterns.momento;


import lombok.Data;
import lombok.Getter;

@Data
public class Project {

    private String code;

    public ProjectCommit commit() {
        return new ProjectCommit();
    }

    public void checkout(ProjectCommit projectCommit) {
        this.code = projectCommit.getCode();
    }

    @Getter
    public class ProjectCommit {
        private final String code;

        public ProjectCommit() {
            this.code = Project.this.code;
        }
    }

}
