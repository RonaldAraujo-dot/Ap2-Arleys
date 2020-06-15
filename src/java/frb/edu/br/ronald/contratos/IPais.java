
package frb.edu.br.ronald.contratos;

import frb.edu.br.ronald.entidades.PaisDto;
import java.util.List;


public interface IPais {
    boolean incluir(PaisDto pais);
    boolean alterar(PaisDto pais);
    boolean deletar(int id);
    PaisDto getRegistroPorId(int id);
    List<PaisDto> getListaTodos();
}
