package models;

public class Client {

    String nome;
    String cognome;
    float saldo;
    int Nconto;
    float prelievo;
    float versamento;
    float bilancio;



    public Client(String nome, String cognome, int Nconto, float saldo, float versamento, float prelievo){
        this.nome=nome;
        this.cognome=cognome;
        this.Nconto=Nconto;
        this.saldo=saldo;
        this.versamento=versamento;
        this.prelievo=prelievo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNconto() {
        return Nconto;
    }

    public void setNconto(int nconto) {
        Nconto = nconto;
    }

    public float getPrelievo() {
        return prelievo;
    }

    public void setPrelievo(float prelievo) {
        this.prelievo = prelievo;
    }

    public float getVersamento() {
        return versamento;
    }

    public void setVersamento(float versamento) {
        this.versamento = versamento;
    }

    public float versamento(){
        this.saldo = saldo+versamento;
        return this.saldo;
    }

    public float prelievo(){
        this.saldo = saldo-prelievo;
        return this.saldo;
    }

    public float bilancio() {
        this.bilancio = (saldo+ prelievo() + versamento())/3;
        return this.saldo;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", saldo=" + saldo +
                ", Nconto=" + Nconto +
                '}';
    }
}