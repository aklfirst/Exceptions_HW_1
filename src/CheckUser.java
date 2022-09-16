public class CheckUser {

    public static void checkUser(userId userId) {

        boolean b = false;
        try {
            userId.validCheck(userId.getLogin());
            userId.validCheck(userId.getPassword());
            userId.loginLengthCheck(userId.getLogin());
            userId.passwordLengthCheck(userId.getPassword());
            userId.comparePasswords(userId.getPassword(), userId.getConfirmPassword());
            b = userId.a;


        } catch (WrongLoginException e) {
            System.out.println("И Логин и Пароль должны содержать только латинские буквы или цифры или знак подчеркивания");
        } catch (WrongFieldLengthException e) {
            System.out.println("Логин может быть не более 20 символов, пароль должен быть меньше 20 символов");
        } catch (WrongPasswordException e) {
            System.out.println("Пароли должны совпадать!");
        } finally {
            System.out.println("Проверка завершена");
        }

        if (b) {
            System.out.println("Пользователь создан успешно");
        } else {
            System.out.println("Просьба исправить вводные согласно рекомендациям");
        }
    }

}
