package UNI_11.Principal_III.locacao.servico;

import UNI_11.Principal_III.locacao.Locacao;

public class ServicoDeLocacao {
    public void confirmarLocacao(Locacao locacao) {
//        double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria() * locacao.getQuantidadeDiarias();

//        double totalDiarias = locacao.getValorDiaria() * locacao.getQuantidadeDiarias();

        double totalDiarias = locacao.calcularTotalDiarias();

        locacao.reservarVeiculo();
    }
}
