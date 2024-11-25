package lab_4.override.втораячасть;

public class Dog extends Cat implements SubjectTypePresentation {
    @Override
    public SubjectType getSubjectType() {
        return SubjectType.DOG;
    }

    @Override
    public Dog getChild() {
        return new Dog();
    }
}