import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;
public class Funçao
{
    Scanner teclado = new Scanner(System.in);

    ArrayList<Funcionario> x = new ArrayList<>();//armazena funcionarios
    Funcionario y = new Funcionario();//temporario de funcionarios

    ArrayList<Pedidos> Demanda_Produtos =new ArrayList<>();//contem todos os pedidos de produtos
    Pedidos temped =new Pedidos();//armazena temporariamente  todos os pedidios

    ArrayList<Cliente>vetor_cliente=new ArrayList<>();//vetor de clientes
    Cliente temp_cliente=new Cliente();//temporaria de clientes
    int mes;//inicio da parcela


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
     float divida=0;//valor da divida
     int numerode_parceas_divida=0;
     int inicio_do_pagamento=0;//numero do mes que se inicia as parcelas
     int fim_pagamento=0;//numero do mes que se finaliza parcelas
    int numero_cliente;
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
            System.out.println("digite o numero do cliete");
            numero_cliente=teclado.nextInt();
            confere_existecia_clienete(numero_cliente);

        }

    }
    public void dividas_cliente()
    {
        System.out.println("digite a divida do cliente");
        divida=teclado.nextFloat();
        if(divida==0)
        {
            System.out.println("pagamento avista comcluido");
        }else
            {
                System.out.println("digite o valor da deivida");
                divida=teclado.nextInt();
                System.out.println("digite o numero de parselas");
                numerode_parceas_divida=teclado.nextInt();
                System.out.println("digite o numero do mes de inicio de pagamento");
                inicio_do_pagamento=teclado.nextInt();
                Calendar hoje=Calendar.getInstance(); // iniciando calendario
                mes=hoje.get(Calendar.MONTH)+1;//mes começa pelo 0
                    inicio_do_pagamento=mes;
                        fim_pagamento=inicio_do_pagamento+numerode_parceas_divida;
                if(fim_pagamento>12)
                {
                    fim_pagamento=fim_pagamento-12;

                }
        }
    }
    public void cadrastro_cliente()
    {
        teclado.nextLine();
        int numero_cliente;//recenbe funçaao random
        System.out.println("digite o nome do cliente");
        nome_cliente=teclado.nextLine();
        temp_cliente.setNome(nome_cliente);

        System.out.println("digite o cnpj");
        cnpj=teclado.nextInt();
        temp_cliente.setCnpj(cnpj);
        numero_cliente=numeroaleatorio_cliente();
        System.out.println("o numero do cliente e "+numero_cliente);
        temp_cliente.setNumero_aeleatorio(numero_cliente);

        //variaveis modifcadas na funçao divida cliente
        temp_cliente.setFim_pagamento(fim_pagamento);
        temp_cliente.setDivida(divida);
        temp_cliente.setNumerode_parceas_divida(numerode_parceas_divida);
        vetor_cliente.add(temp_cliente);



    }
    public int numeroaleatorio_cliente()
    {
        Random ale=new Random();
        int numeroale;
        int compara = 0;
        do {
            numeroale =ale.nextInt(100);

            for (int i = 0; i < this.vetor_cliente.size(); i++)
            {
                this.temp_cliente = (Cliente) this.vetor_cliente.get(i);
                if (this.temp_cliente.getNumero_aeleatorio() == numeroale)
                {
                    compara = 1;

                }
            }

        }while (compara==1);

        return numeroale;

    }
    public void confere_existecia_clienete(int numero_cliente)
    {
        int existe_clienete=0;

        for(int i=0;i<this.vetor_cliente.size();i++)
        {
            this.temp_cliente=(Cliente)this.vetor_cliente.get(i);
            if(this.temp_cliente.getNumero_aeleatorio()==numero_cliente)
            {

                existe_clienete=1;

            }


        }
        if(existe_clienete==1)
        {//o cliente existe
            dividas_cliente();

        }else
            {//o cliente nao existe
                System.out.println("cliente inexistente");
                System.out.println("cadrestre o cliente");
                cadrastro_cliente();

            }


    }
    public void mostra_divida(int numero)
    {
        for(int i=0;i<vetor_cliente.size();i++)
        {
            temp_cliente=(Cliente)this.vetor_cliente.get(i);
            if(temp_cliente.getNumero_aeleatorio()==numero)
            {
                System.out.println("divida "+temp_cliente.getDivida());
                System.out.println(" parcelas "+temp_cliente.getNumerode_parceas_divida());
                System.out.println("inicio do pagamento "+temp_cliente.getInicio_do_pagamento());
                System.out.println(" fim do pagamento "+temp_cliente.getFim_pagamento());


            }

        }
    }
    public void menu()
    {

        do
        {


            System.out.println("digite 1----CADRASTRO");
            System.out.println("digite 2----Demiçao");
            System.out.println("digite 3----Pedido");
            System.out.println("digite 4----cadrastro de cliente");
            System.out.println("digite 5----mostrar a divida");
            System.out.println("digite 6----estooque");
            System.out.println("digite 7----Sair");

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

                    System.out.println("digite o numero do cliente");
                    mostra_divida(teclado.nextInt());
                    break;
                case 6:

                    break;

            }

        }while(numeromenu!=7);

    }

}
