
public class FilaListaE3<T> extends FilaListaEncadeada<T> {

    @Override
    public String toString() {

        ElementoLista<T> andarilho = ini;
        String str = "";
        while (andarilho != null) {
            str += andarilho.getInfo() + ", ";
            andarilho = andarilho.getProx();
        }
        str = str.substring(0, str.length() - 2) + " ";
        return str;
    }

    @Override
    public Fila<T> concatenar(Fila outra) throws Exception {

        Fila<T> filaListaEncadeada = new FilaListaE3<>();
        ElementoLista<T> andarilho = this.ini;
        
        while (andarilho != null) {
            filaListaEncadeada.insere((T) andarilho.getInfo());
            andarilho = andarilho.getProx();
        }

        filaListaEncadeada.insere((T) outra);

        return filaListaEncadeada;

    }

}
