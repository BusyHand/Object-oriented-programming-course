package lab_4.override.втораячасть;

public class Lamp implements SubjectTypePresentation {

    @Override
    public SubjectType getSubjectType() {
        return SubjectType.LAMP;
    }
}