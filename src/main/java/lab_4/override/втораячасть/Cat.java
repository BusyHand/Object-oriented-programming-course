package lab_4.override.втораячасть;

public class Cat implements SubjectTypePresentation {
    @Override
    public SubjectType getSubjectType() {
        return SubjectType.CAT;
    }

    public Cat getChild() {
        return new Cat();
    }
}