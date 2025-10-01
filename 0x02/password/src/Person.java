public class Person {
    private String username;
    private String password;

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Usuário: mínimo 8 caracteres, sem caractere especial
    public static boolean checkUser(String username) {
        // Não pode ter caractere especial, só letras e números
        boolean semEspecial = username.matches("^[A-Za-z0-9]+$");
        boolean tamanhoMinimo = username.length() >= 8;
        return semEspecial && tamanhoMinimo;
    }

    // Senha: mínimo 8 caracteres, 1 maiúscula, 1 número, 1 especial
    public static boolean checkPassword(String password) {
        boolean tamanhoMinimo = password.length() >= 8;
        boolean temMaiuscula = password.matches(".*[A-Z].*");
        boolean temNumero = password.matches(".*\\d.*");
        boolean temEspecial = password.matches(".*[^A-Za-z0-9].*");
        return tamanhoMinimo && temMaiuscula && temNumero && temEspecial;
    }
}