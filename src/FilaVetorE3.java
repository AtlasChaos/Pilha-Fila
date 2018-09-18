
public class FilaVetorE3<T> extends FilaVetor<T> {

    public FilaVetorE3(int tam) {
        super(tam);
    }

    @Override
    public String toString() {
        String str = "";
        for (T vet1 : this.vet) {
            if (vet1 != null) {
                str += vet1 + ", ";
            } else {
                break;
            }
        }
        str = str.substring(0, str.length() - 2) + " ";
        return str;
    }

    @Override
    public Fila<T> concatenar(Fila outra) throws Exception {

        Fila<T> filaVetor = new FilaVetorE3<>(this.tam);
        int posVetor = this.inicio;
        for (int i = 0; i < this.qtdElem; i++) {
            T aRetornar = vet[posVetor];
            filaVetor.insere((T) aRetornar);
            posVetor = (posVetor + 1) % tam;
        }
        filaVetor.insere((T) outra);
        return filaVetor;
    }

}
