package lab_4.override.втораячасть;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum SubjectType {

    LAMP("Лампа"),
    BIRD("Птица"),
    CAT("Кошка"),
    DOG("Собака");

    private final String name;
}
