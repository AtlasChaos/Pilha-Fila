
public class Calculadora {

    private Pilha<Integer> pilha;

    public Calculadora() {
        this.usarLista();
    }

    public void usarLista() {
        this.pilha = new PilhaLista();
    }

    public void usarVetor() {
        this.pilha = new PilhaVetor(99);
    }

    public int calcularFormula(String formula) throws Exception {

        int elementosACalcular = 0;

        String[] caracteres = formula.split(" ");

        for (int i = 0; i < caracteres.length; i++) {
            String carac = caracteres[i];
            System.out.println("Calculadora.calcularFormula() + " + carac + " " + elementosACalcular);
            if (elementosACalcular > 3) {
                throw new Exception("Sua fórmula está com operandos demais.");
            }
            if (isNumber(carac)) {
                int numero = Integer.parseInt(carac);
                this.pilha.push(numero);
                elementosACalcular++;
                if (elementosACalcular > 2) {
                    throw new Exception("Sua fórmula contém números demais.");
                }
            } else {
                elementosACalcular = 0;
                int operando1 = this.pilha.pop();
                int operando2 = this.pilha.pop();
                
                int resultado = this.executarOperacao(operando1, operando2, carac);
                pilha.push(resultado);
            }
        }
        if (elementosACalcular > 1) {
            throw new Exception("Sua fórmula está incompleta.");
        }
        int resultadoFinal = this.pilha.pop();
        return resultadoFinal;
    }
    

    private int executarOperacao(int operando1, int operando2, String operador) throws Exception {
        switch (operador) {
            case "+": {
                return operando1 + operando2;
            }
            case "-": {
                return operando1 - operando2;
            }
            case "/": {
                return operando1 / operando2;
            }
            case "*": {
                return operando1 * operando2;
            }
            default: {
                throw new Exception("A fórmula contém algum operador inválido.");
            }
        }
    }

    private boolean isNumber(String str) {
        try {
            int i = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
