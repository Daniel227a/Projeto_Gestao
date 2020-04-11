public class Funcionario
{
    private int idade ;
    private float salario;
    private String Sexo;
    private String setor;
    private int numerodelog;

    public float getSalario()
    {
        return salario;
    }

    public int getIdade()
    {
        return idade;
    }

    public String getSexo()
    {
        return Sexo;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setSalario(float salario)
    {
        this.salario = salario;
    }

    public void setSexo(String sexo)
    {
        Sexo = sexo;
    }

    public void setSetor(String setor)
    {
        this.setor=setor;
    }

    public void setNumerodelog(int numerodelog)
    {
        this.numerodelog = numerodelog;
    }
    public int getNumerolog()
    {
        return numerodelog;
    }





}
