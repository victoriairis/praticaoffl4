package dao;

import java.util.List;
import entidades.Alimento;

public interface AlimentoDAO<Alimento>{
    public void adicionar(Alimento a);
    public List<Alimento> listarTudo();
    public Alimento listarAlimento(int codigo);
    public List<Alimento> listar(String nome);
    public void update(int codigo,Alimento a);
    public void remove(int codigo);
}