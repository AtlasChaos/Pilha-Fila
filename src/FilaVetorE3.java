
public class FilaVetorE3<T> extends FilaVetor<T> {

    public FilaVetorE3(int tam) {
        super(tam);
    }

    public String toString() {

        String str = "[ ";
        for (int i = 0; i < this.vet.length; i++) {
            if(this.vet != null){
            str += this.vet[i] + ", ";
            }else{ break;}
        }
        str = str.substring(0, str.length() - 2) + "]";
        return str;
    }

    public Fila<T> concatenar(Fila outra) throws Exception {

        Fila<T> filaVetor = new FilaVetorE3<T>(this.tam);
       
        
        filaVetor.insere((T) outra);

        return filaVetor;
    }

}
