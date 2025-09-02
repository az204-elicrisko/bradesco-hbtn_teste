import java.sql.Date;

public class Person {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner, pensioner, publicServer;
    private float salary;

    public Person(String name, String surname, String birthDate, boolean anotherCompanyOwner, 
        boolean pensioner, boolean publicServer) {
            this.name = name;
            this.surname = surname;
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            this.birthDate = formato.parse(birthDate);
        }

    public String fullName(){
        return name + " " + surname;
    }

    public float getSalary(){
        return salary;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }

    public float calculateYearlySalary(){
        return salary * 12;
    }

    public boolean isMEI(){
        
        return ((salary * 12) < 130000) 
            && (temMaisDe18Anos(birthDate))
            && (anotherCompanyOwner == false)
            && (pensioner == false)
            && (publicServer == false);

    }

    public static boolean temMaisDe18Anos(Date dataNascimento) {
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(dataNascimento);

        Calendar hoje = Calendar.getInstance();

        int anoNascimento = nascimento.get(Calendar.YEAR);
        int mesNascimento = nascimento.get(Calendar.MONTH);
        int diaNascimento = nascimento.get(Calendar.DAY_OF_MONTH);

        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH);
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

        int idade = anoAtual - anoNascimento;

        // Ajusta se ainda não fez aniversário este ano
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        return idade >= 18;
    }
}
