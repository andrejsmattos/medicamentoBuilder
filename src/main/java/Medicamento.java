public class Medicamento {

    private String nome;
    private Integer dosagem;
    private String unidadeDosagem;
    private String nomeLaboratorio;
    private String bula;

    public Medicamento() {
    }

    public Medicamento(String nome, Integer dosagem, String unidadeDosagem, String nomeLaboratorio, String bula) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.unidadeDosagem = unidadeDosagem;
        this.nomeLaboratorio = nomeLaboratorio;
        this.bula = bula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDosagem() {
        return dosagem;
    }

    public void setDosagem(Integer dosagem) {
        this.dosagem = dosagem;
    }

    public String getUnidadeDosagem() {
        return unidadeDosagem;
    }

    public void setUnidadeDosagem(String unidadeDosagem) {
        this.unidadeDosagem = unidadeDosagem;
    }

    public String getNomeLaboratorio() {
        return nomeLaboratorio;
    }

    public void setNomeLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
    }

    public String getBula() {
        return bula;
    }

    public void setBula(String bula) {
        this.bula = bula;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nome='" + nome + '\'' +
                ", dosagem=" + dosagem +
                ", unidadeDosagem='" + unidadeDosagem + '\'' +
                ", nomeLaboratorio='" + nomeLaboratorio + '\'' +
                ", bula='" + bula + '\'' +
                '}';
    }

    public Medicamento getDipirona() {
        StringBuilder bulaDipirona = new StringBuilder();
        bulaDipirona.append("Para que serve Dipirona Sódica?\n");
        bulaDipirona.append("Como a Dipirona Sódica tem ação analgésica e antipirética, ela serve para aliviar dores e também reduzir a febre no paciente. Além disso, é importante ressaltar que o remédio é bastante indicado para dor com intensidade leve e moderada.\n");
        bulaDipirona.append("Esse remédio também serve para tratar dores de dentes, além de cólicas menstruais e outras condições. Por ser acessível, ele pode ser encontrado nas mais diferentes redes de farmácias.\n");

        return new MedicamentoBuilder()
                .comNome("Dipirona Sódica 500mg")
                .comDosagem(500)
                .comUnidadeDosagem("mg")
                .comNomeLaboratorio("EMS")
                .comBula(bulaDipirona.toString())
                .build();
    }
}