import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @version: V2.0
 * @author: Chaoli Wang
 * @className: Calculate
 * @description: O princípio de cálculo desta class:
 *            defina uma fórmula complexa como uma fórmula de adição composta por múltiplas fórmulas de multiplicação,
 *            primeiro execute a operação de multiplicação, armazene o resultado na stack e, em seguida,
 *            faz a soma dos resultados armazenada em stack para obter o resultado.
 *            Ex: (1+2)*3-4 para 3*3-4 para 9-4 para 5
 * @data: 2022-08-21 17:38
 **/

public class Calculate {
    private static String result = "";

    public static String calculate(String str) throws MyException {
        String[] listCalcular = funcToArray(str);
        String result = calcula(listCalcular);
        return result;
    }

    public static String calculateWithParentese(String str) throws MyException {
        String[] listCalcular = funcToArray(str);
        String result = calcula(listCalcular);
        return result;
    }

    public static String calcula(String[] listCalcular) throws MyException {
        //calcula
        Stack<Double> stack = new Stack<>();
        Double m = Double.parseDouble(listCalcular[0]);
        stack.push(m);                              //coloque o primeiro número na stack
        for(int i = 1; i < listCalcular.length; i++) {
            if(i%2==1) {
                /* Execute operações de acordo com diferentes símbolos de operação
                    e armazene os números resultantes na stack **/
                if(listCalcular[i].equals("+"))
                    stack.push(Double.parseDouble(listCalcular[i+1]));
                if(listCalcular[i].equals("-"))
                    stack.push(-Double.parseDouble(listCalcular[i+1]));
                if(listCalcular[i].equals("×")) {
                    Double d = stack.peek();
                    stack.pop();
                    stack.push(d*Double.parseDouble(listCalcular[i+1]));
                }
                if(listCalcular[i].equals("÷")) {
                    double help = Double.parseDouble(listCalcular[i+1]);
                    if(help == 0)
                        throw new MyException("Voce nao pode dividir com 0");
                    double d = stack.peek();
                    stack.pop();
                    stack.push(d/help);
                }
            }
        }

        double d = 0;

        while(!stack.isEmpty()) {
            d += stack.peek();                      //Soma os números armazenados na stack
            stack.pop();
        }

        return result = String.valueOf(d);
    }

    public static String[] funcToArray(String str) throws MyException {
        String[] l = str.split("");                     //Dividir cada digido da funcao
        List<String> listA = Arrays.asList(l);
        List<String> listB = new ArrayList<String>(listA);    //Converter array estático em array dinâmico

        for (int i=0;i<listB.size()-1;i++){
            //Concatenar números únicos em números completos(de "1,2,5" para "125")
            if(listB.get(i).matches("\\d+")&&listB.get(i+1).matches("\\d")) {
                String num = "";
                num += listB.get(i).replaceAll("[\\,\\[\\]]", "");
                num += listB.get(i+1).replaceAll("[\\,\\[\\]]", "");
                listB.set(i,num);
                listB.remove(i+1);
                i--;
            }
        }

        for (int i = 0; i < listB.size() - 1; i++) {            //Concatenar partes fracionárias
            if (listB.get(i).matches("\\.") && listB.get(i + 1).matches("\\d+")) {
                String num = "";
                num += listB.get(i - 1).replaceAll("[\\,\\[\\]]", "");
                num += listB.get(i).replaceAll("[\\,\\[\\]]", "");
                num += listB.get(i + 1).replaceAll("[\\,\\[\\]]", "");
                listB.set(i-1, num);
                listB.remove(i);
                listB.remove(i);
                i--;
            }
        }

        if (TestaActionListener.isContemParantese()) {
            /* Se houver parênteses na fórmula, o cálculo entre parênteses será executado primeiro **/
            int countL = 0;
            int countR = 0;
            for (int i=0;i<listB.size();i++) {
                if (listB.get(i).matches("\\(")) {
                    countL++;
                } else if (listB.get(i).matches("\\)")) {
                    countR++;
                }
            }
            if (countR!=countL) {
                throw new MyException("A quantidade de parênteses não igual");
            }

            while (countL!=0) {
                List<String> listC = new ArrayList<>();
                String num = "";
                int indexL = listB.lastIndexOf("(");
                int indexR = listB.indexOf(")");
                for (int i=indexL;i<indexR+1;i++) {
                    listC.add(listB.get(i));
                }
                for (int i=indexR;i>indexL-1;i--) {
                    listB.remove(i);
                }
                num = listC.toString().replaceAll("[\\s\\,\\[\\]\\(\\)]", "");
                num = calculate(num);
                listB.add(indexL,num);
                countL--;
            }
        }

        String[] listCalcular = new String[listB.size()];
        for (int i=0;i<listB.size();i++) {
            listCalcular[i] = listB.get(i);
        }

        return listCalcular;
    }

    public static String getResult() {
        return result;
    }

    static class MyException extends Exception{
        public MyException() {
            super();
        }
        public MyException(String message) {
            super(message);
        }
    }
}
