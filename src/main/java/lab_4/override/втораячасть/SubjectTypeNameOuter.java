package lab_4.override.втораячасть;

public class SubjectTypeNameOuter {


    public void outputSubjectTypeName(SubjectTypePresentation subjectTypePresentation){
        SubjectType subjectType = subjectTypePresentation.getSubjectType();
        System.out.print(subjectType.getName());
    }
}
