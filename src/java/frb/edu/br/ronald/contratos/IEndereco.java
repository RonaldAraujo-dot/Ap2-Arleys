
package frb.edu.br.ronald.contratos;

import frb.edu.br.ronald.entidades.EnderecoDto;
import java.util.List;


public interface IEndereco {
    boolean incluir(EnderecoDto endereco);
    boolean alterar(EnderecoDto endereco);
    boolean deletar(int id);
    EnderecoDto getRegistroPorId(int id);
    List<EnderecoDto> getListaTodos();
}
