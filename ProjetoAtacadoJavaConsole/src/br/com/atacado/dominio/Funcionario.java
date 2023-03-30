package br.com.atacado.dominio;

import java.time.LocalDate;

public class Funcionario extends PessoaFisica {
    private String matricula;

    private String login;

    private String senha;

    private LocalDate dataContratacao;

    private String raca;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataContratacao() {
        return getDataContratacao();
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Funcionario(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao,
            int cpf, int rg, String naturalidade, String sexo, String raca, String matricula, String login,
            String senha, LocalDate dataContratacao) {
        super(codigoPessoa, nome, email, site, dataInclusao, matricula, login, sexo, raca, senha, naturalidade, nome,
                nome);
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
        this.dataContratacao = dataContratacao;

    }

    @Override
    public void Imprimir() {
        System.out.println("-- Detalhes Dos Funcionarios --");
        System.out.println("Matricula Da Pessoa: " + this.matricula);
        System.out.println("Login Do Funcionario" + this.login);
        System.out.println("Senha Do Usuario" + this.senha);
        System.out.println("Data De Contratação" + this.dataContratacao);
    }

    @Override
    public String toString() {
        return "Funcionario [" +
                "codigoPessoa =" + codigoPessoa +
                "nome =" + nome +
                "email =" + email +
                "site =" + site +
                "dataInclusao =" + dataInclusao +
                "sexo =" + site +
                "raca =" + raca +
                "naturalidade =" + naturalidade +
                "matricula=" + matricula +
                ", login=" + login +
                ", senha=" + senha +
                ", datacontratacao=" + dataContratacao
                + "]";
    }

}
