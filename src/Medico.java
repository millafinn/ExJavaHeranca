public abstract class Medico {
    private String nome, CRM;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCRM(String CRM){
        this.CRM = CRM;
    }

    public String getCRM(){
        return CRM;
    }
}
