import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Funçao
{
    Scanner teclado = new Scanner(System.in);

    ArrayList<Funcionario> x = new ArrayList<>();//armazena funcionarios
    Funcionario y = new Funcionario();//temporario de funcionarios

    ArrayList<Pedidos> Demanda_Produtos =new ArrayList<>();//contem todos os pedidos de produtos
    Pedidos temped =new Pedidos();//armazena temporariamente  todos os pedidios

    ArrayList<Cliente>vetor_cliente=new ArrayList<>();//vetor de clientes
    Cliente temp_cliente=new Cliente();//temporaria de clientes


    int funcionarios;//numero de funcionarios
    float salario;
    int idade;
    String Sexo;
    String setor;//setor do funcionario
    int numerodelog;//numero unico ppara cadda funcionario
    int numeromenu=0;//variavel global

    //para classe produto

    int numero_produto;//variavel temporaria
    float valor_produto;//variavel temporaria
    String nome_produto;//variavel temporaria
    int quantidade_produto;//variavel temporaria
    //para classe cliente

    String nome_cliente;
     int cnpj;
     float divida;//valor da divida
     int numerode_parceas_divida;
     int inicio_do_pagamento;//numero do mes que se inicia as parcelas
     int fim_pagamento;//numero do mes que se finaliza parcelas
     float credito;

    public void Prenche() {
        System.out.println("digite quantos fuuncionarios sao");
        funcionarios = teclado.nextInt();
        for (int i = 0; i < funcionarios; i++) {
            System.out.println("digite a idade ");
            idade = teclado.nextInt();
            teclado.nextLine();
            this.y.setIdade(idade);
            System.out.println("digite o sexo");
            Sexo = teclado.nextLine();
            this.y.setSexo(Sexo);
            System.out.println("digite o salario");
            salario = teclado.nextFloat();
            teclado.nextLine();
            this.y.setSalario(salario);
            System.out.println("digite o setor");
            setor=teclado.nextLine();
            int numerodofuncionario=numeroaleatorio();
            System.out.println("o numero do funcionario e "+numerodofuncionario);
            numerodelog=numerodofuncionario;
            this.y.setNumerodelog(numerodofuncionario);

            x.add(y);
        }
    }
    public int numeroaleatorio()
    {
        Random ale=new Random();
        int numeroale;
        int compara = 0;
        do {
            numeroale =ale.nextInt(100);

            for (int i = 0; i < this.x.size(); i++)
            {
                this.y = (Funcionario) this.x.get(i);
                if (this.y.getNumerolog() == numeroale)
                {
                    compara = 1;

                }
            }

        }while (compara==1);

        return numeroale;


    }
    public void dados()
    {
        float soma = 0;
        for (int i = 0; i < x.size(); i++)
        {
            this.y=(Funcionario) x.get(i);
            System.out.println("os dados do funcionario "+i);
            System.out.println( ("idade ")+this.y.getIdade());
            System.out.println(("salario  ")+this.y.getSalario());
            System.out.println( ("sexo  ")+this.y.getSexo());

        }

    }
    public void media_por_grupo()
    {
        int numero_nummero_M=0,numero_H=0;
        float salario_M=0,salario_H=0;
        for(int i=0;i<x.size();i++)
        {
            this.y=(Funcionario)x.get(i);
            if((this.y.getSexo())==("M")||(this.y.getSexo())==("m"))
            {
                numero_nummero_M=numero_nummero_M+1;
                salario_M=salario_M+this.y.getSalario();
            }else
            {
                numero_H=numero_H+1;
                salario_H=salario_H+this.y.getSalario();
            }
        }
        System.out.println("a media de salario dos homens e "+salario_H/numero_H);
        System.out.println("a media de salario das mulheres e "+salario_M/numero_nummero_M);
    }
    public void menor_idade()
    {
        int menor_M=0,menor_H=0;

        for (int i=0;i<x.size();i++)
        {
            this.y=(Funcionario)x.get(i);
            if(this.y.getSexo()=="m"||this.y.getSexo()=="M")
            {
                if(this.y.getIdade()<menor_M)
                {
                    menor_M=this.y.getIdade();
                }
            }else
            {
                if(this.y.getIdade()<menor_H)
                {
                    menor_H=this.y.getIdade();
                }
            }
        }
        System.out.println("a menor idade do grupoo das mulheres e "+menor_M);
        System.out.println("a menor idade do grupo dos Homes e "+menor_H);
    }

    public void Maior60()
    {
        int cont=0;
        for(int i=0;i<x.size();i++)
        {
            this.y=(Funcionario)x.get(i);
            if(this.y.getIdade()>60&&this.y.getSalario()>1000)
            {
                cont++;

            }
        }
        System.out.println("a quantidade de Homens com 60 ou mais e  salario mair de 1000 e "+cont);
    }
    public void pedido()
    {
        System.out.println("digite quantos pedidos diferentes sao ");
        int tamanho_pedidio=teclado.nextInt();
        for(int i=0;i<tamanho_pedidio;i++)
        {
            System.out.println("digte numero do produto");
            numero_produto=teclado.nextInt();
            temped.setNumero_produto(numero_produto);

            System.out.println("digite a quantidede de produto");
            quantidade_produto=teclado.nextInt();
            temped.setQuantidade_produto(quantidade_produto);

            System.out.println("digite o nome do produto");
            nome_produto=teclado.nextLine();
            teclado.nextLine();
            temped.setNome_produto(nome_produto);

            System.out.println("digite o valor do produto");
            valor_produto=teclado.nextFloat();
            temped.setValor_produto(valor_produto);
          Demanda_Produtos.add(temped);


        }

    }
    public void dividas_cliente()
    {
        System.out.println("digite a divida do cliente");
        divida=teclado.nextFloat();
        if(divida==0)
        {

        }else{
            System.out.println("digite o numero de parselas");
        }

    }
    public void cadrastro_cliente()
    {
        System.out.println("digite o nome do cliente");
        nome_cliente=teclado.nextLine();
        temp_cliente.setNome(nome_cliente);

        System.out.println("digite o cnpj");
        cnpj=teclado.nextInt();
        temp_cliente.setCnpj(cnpj);




    }
    public int numeroaleatorio_cliente()
    {


    }
    public void menu()
    {

        do
        {


            System.out.println("digite 1----CADRASTRO");
            System.out.println("digite 2----Demiçao");
            System.out.println("digite 3----Pedido");
            System.out.println("digite 4----cadrastro de cliente");
            System.out.println("digite 5----estooque");
            System.out.println("digite 6----Sair");

            numeromenu= teclado.nextInt();

            switch (numeromenu)
            {

                case 1:
                    Prenche();
                    break;
                case 2:

                    break;
                case 3:
                    pedido();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;

            }

        }while(numeromenu!=6);

    }

}
