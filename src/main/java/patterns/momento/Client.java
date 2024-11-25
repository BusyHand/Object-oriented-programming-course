package patterns.momento;

public class Client {

    public static void main(String[] args) {
        GitRepository gitRepository = new GitRepository();
        Project project = new Project();

        project.setCode("Изначальный код");
        gitRepository.push(project.commit());

        project.setCode("Добавлена функция A");
        gitRepository.push(project.commit());

        project.setCode("Исправлены ошибки в функции A");
        gitRepository.push(project.commit());

        project.setCode("Добавлена функция B");
        gitRepository.push(project.commit());

        System.out.println("История коммитов:");
        gitRepository.log().forEach(commit -> {
            System.out.println("Код коммита: " + commit.getCode());
        });

        System.out.println("\nВозвращение проекта к версии 1:");
        project.checkout(gitRepository.getByVersion(1));
        System.out.println("Текущий код: " + project.getCode());

        System.out.println("\nВозвращение проекта к версии 2:");
        project.checkout(gitRepository.getByVersion(2));
        System.out.println("Текущий код: " + project.getCode());

        System.out.println("\nВозвращение проекта к версии 3:");
        project.checkout(gitRepository.getByVersion(3));
        System.out.println("Текущий код: " + project.getCode());
    }

}
