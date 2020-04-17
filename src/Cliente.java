public class Cliente
{
    private String nome;
    private int cnpj;
    private float divida;//valor da divida
    private int numerode_parceas_divida;
    private int inicio_do_pagamento;//numero do mes que se inicia as parcelas
    private int fim_pagamento;//numero do mes que se finaliza parcelas
    private float credito;
    private int numero_aeleatorio;//numero do cliente

    public int getNumero_aeleatorio() {
        return numero_aeleatorio;
    }

    public void setNumero_aeleatorio(int numero_aeleatorio) {
        this.numero_aeleatorio = numero_aeleatorio;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public float getDivida() {
        return divida;
    }

    public void setDivida(float divida) {
        this.divida = divida;
    }

    public int getNumerode_parceas_divida() {
        return numerode_parceas_divida;
    }

    public void setNumerode_parceas_divida(int numerode_parceas_divida) {
        this.numerode_parceas_divida = numerode_parceas_divida;
    }

    public int getInicio_do_pagamento() {
        return inicio_do_pagamento;
    }

    public void setInicio_do_pagamento(int inicio_do_pagamento) {
        this.inicio_do_pagamento = inicio_do_pagamento;
    }

    public int getFim_pagamento() {
        return fim_pagamento;
    }

    public void setFim_pagamento(int fim_pagamento) {
        this.fim_pagamento = fim_pagamento;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}
