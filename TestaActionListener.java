import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Objects;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

@SuppressWarnings("serial")
public class TestaActionListener extends TelaBase implements ActionListener{
    private GridLayout grid;
    private FlowLayout flow;
    private GridLayout gridTela;
    private JPanel botoes;
    private JPanel tela, telaCima, telaBaixo;
    private static Font f = new Font("Monaco",Font.BOLD,25);
    private static JLabel lb_telaBaixo = new JLabel("0");
    private JLabel lb_telaCima = new JLabel("");

    private static boolean contemParantese = false;

    private final JButton bt7 = new JButton("7");
    private final JButton bt8 = new JButton("8");
    private final JButton bt9 = new JButton("9");
    private final JButton bt4 = new JButton("4");
    private final JButton bt5 = new JButton("5");
    private final JButton bt6 = new JButton("6");
    private final JButton bt1 = new JButton("1");
    private final JButton bt2 = new JButton("2");
    private final JButton bt3 = new JButton("3");
    private final JButton bt0 = new JButton("0");
    private final JButton btMais = new JButton("+");
    private final JButton btMenos = new JButton("-");
    private final JButton btVezes = new JButton("×");
    private final JButton btDividir = new JButton("÷");
    private final JButton btIgual = new JButton("=");
    private final JButton btAC = new JButton("AC");
    private final JButton btParenteseL = new JButton("(");
    private final JButton btParenteseR = new JButton(")");
    private final JButton btRemove = new JButton("Del");
    private final JButton btPonto = new JButton(".");

    TestaActionListener() {
        /* Configurações da interface gráfica **/
        this.setTitle("Calculadora");
        this.botoes = new JPanel();
        this.tela = new JPanel();
        this.grid = new GridLayout(5,4,2,2);
        this.gridTela = new GridLayout(2,1);
        this.flow = new FlowLayout(FlowLayout.RIGHT);

        this.telaCima = new JPanel();
        this.telaBaixo = new JPanel();
        telaCima.setLayout(flow);
        telaBaixo.setLayout(flow);
        telaCima.add(lb_telaCima);
        telaBaixo.add(lb_telaBaixo);

        botoes.setLayout(grid);
        tela.setLayout(gridTela);

        tela.add(telaCima);
        tela.add(telaBaixo);

        botoes.add(btParenteseL);
        botoes.add(btParenteseR);
        botoes.add(btRemove);
        botoes.add(btDividir);
        botoes.add(bt7);
        botoes.add(bt8);
        botoes.add(bt9);
        botoes.add(btVezes);
        botoes.add(bt4);
        botoes.add(bt5);
        botoes.add(bt6);
        botoes.add(btMenos);
        botoes.add(bt1);
        botoes.add(bt2);
        botoes.add(bt3);
        botoes.add(btMais);
        botoes.add(bt0);
        botoes.add(btPonto);
        botoes.add(btAC);
        botoes.add(btIgual);

        this.add(tela,BorderLayout.NORTH);
        this.add(botoes,BorderLayout.CENTER);

        /* Adicionar actionListener para botões **/
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt0.addActionListener(this);
        btMais.addActionListener(this);
        btMenos.addActionListener(this);
        btVezes.addActionListener(this);
        btDividir.addActionListener(this);
        btIgual.addActionListener(this);
        btAC.addActionListener(this);
        btRemove.addActionListener(this);
        btPonto.addActionListener(this);
        btParenteseL.addActionListener(this);
        btParenteseR.addActionListener(this);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /* Adicionar evento para ação de clique **/
        if(e.getSource() == bt0) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"0");
            }
        } else if (e.getSource() == bt1) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("1");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"1");
            }
        } else if (e.getSource() == bt2) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("2");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"2");
            }
        } else if (e.getSource() == bt3) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("3");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"3");
            }
        } else if (e.getSource() == bt4) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("4");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"4");
            }
        } else if (e.getSource() == bt5) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("5");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"5");
            }
        } else if (e.getSource() == bt6) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("6");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"6");
            }
        } else if (e.getSource() == bt7) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("7");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"7");
            }
        } else if (e.getSource() == bt8) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("8");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"8");
            }
        } else if (e.getSource() == bt9) {
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("9");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"9");
            }
        } else if (e.getSource() == btAC) {
            /* redefinir tela **/
            lb_telaCima.setText("");
            lb_telaBaixo.setText("0");
        } else if (e.getSource() == btMais) {
            if (!isFinalParentL()) {
                if (isFinalNum()||isFinalParentR()) {
                    lb_telaBaixo.setText(lb_telaBaixo.getText()+"+");
                } else if (isFinalSimCalcular()) {
                    lb_telaBaixo.setText(getFuncaoMenos1());
                    lb_telaBaixo.setText(lb_telaBaixo.getText()+"+");
                }
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText() + "0+");
            }
        } else if (e.getSource() == btMenos) {
            if (!isFinalParentL()) {
                if (isFinalNum()||isFinalParentR()) {
                    lb_telaBaixo.setText(lb_telaBaixo.getText()+"-");
                } else if (isFinalSimCalcular()) {
                    lb_telaBaixo.setText(getFuncaoMenos1());
                    lb_telaBaixo.setText(lb_telaBaixo.getText()+"-");
                }
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText() + "0-");
            }
        } else if (e.getSource() == btVezes) {
            if (!isFinalParentL()) {
                if (isFinalNum()||isFinalParentR()) {
                    lb_telaBaixo.setText(lb_telaBaixo.getText()+"×");
                } else if (isFinalSimCalcular()) {
                    lb_telaBaixo.setText(getFuncaoMenos1());
                    lb_telaBaixo.setText(lb_telaBaixo.getText()+"×");
                }
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText() + "1×");
            }
        } else if (e.getSource() == btDividir) {
            if (!isFinalParentL()) {
                if (isFinalNum()||isFinalParentR()) {
                    lb_telaBaixo.setText(lb_telaBaixo.getText()+"÷");
                } else if (isFinalSimCalcular()) {
                    lb_telaBaixo.setText(getFuncaoMenos1());
                    lb_telaBaixo.setText(lb_telaBaixo.getText()+"÷");
                }
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText() + "1÷");
            }
        } else if (e.getSource() == btIgual) {
            lb_telaCima.setText(lb_telaBaixo.getText());
            if (!lb_telaBaixo.getText().contains("(")) {
                setContemParantese(false);
                try {
                    Calculate.calculate(lb_telaBaixo.getText());
                    lb_telaBaixo.setText(Calculate.getResult());
                } catch (Calculate.MyException ex) {
                    throw new RuntimeException(ex);
                }
            } else {
                setContemParantese(true);
                try {
                    Calculate.calculateWithParentese(lb_telaBaixo.getText());
                    lb_telaBaixo.setText(Calculate.getResult());
                } catch (Calculate.MyException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } else if (e.getSource() == btRemove) {
            if (!Objects.equals(getFuncaoMenos1(), "")) {
                lb_telaBaixo.setText(getFuncaoMenos1());
            } else {
                lb_telaBaixo.setText("0");
            }
        } else if (e.getSource() == btPonto) {
            if (lb_telaBaixo.getText().contains(".")) {
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+".");
            }
        } else if (e.getSource() == btParenteseL) {
            if (isFinalNum()||isFinalParentR()) {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"×");
            }
            if (Objects.equals(lb_telaBaixo.getText(), "0")) {
                lb_telaBaixo.setText("(");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"(");
            }
        } else if (e.getSource() == btParenteseR) {
            if (isFinalSimCalcular()) {
                lb_telaBaixo.setText(getFuncaoMenos1());
            }
            if (lb_telaBaixo.getText() == "0") {
                lb_telaBaixo.setText(")");
            } else if (isFinalParentL()) {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+"0");
                lb_telaBaixo.setText(lb_telaBaixo.getText()+")");
            } else {
                lb_telaBaixo.setText(lb_telaBaixo.getText()+")");
            }
        }

    }
    private static void InitGlobalFont(Font font) {
        /* Inicialize fontes para todos os componentes **/
        FontUIResource fontRes = new FontUIResource(font);
        for (Enumeration<Object> keys = UIManager.getDefaults().keys(); keys.hasMoreElements();) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource) {
                UIManager.put(key, fontRes);
            }
        }
    }

    public String getFuncaoMenos1() {
        /* Obter o texto depois de remover um dígito **/
        return lb_telaBaixo.getText().substring(0,lb_telaBaixo.getText().length()-1);
    }

    public boolean isFinalNum() {
        /* Verifique se o último dígito é um número **/
        String str = lb_telaBaixo.getText().substring(lb_telaBaixo.getText().length()-1);
        return str.matches("\\d");
    }

    public boolean isFinalParentL() {
        /* Verifique se o último dígito é ( **/
        String str = lb_telaBaixo.getText().substring(lb_telaBaixo.getText().length()-1);
        return str.matches("\\(");
    }

    public boolean isFinalParentR() {
        /* Verifique se o último dígito é ) **/
        String str = lb_telaBaixo.getText().substring(lb_telaBaixo.getText().length()-1);
        return str.matches("\\)");
    }

    public boolean isFinalSimCalcular() {
        /* Verifique se o último dígito é simbolo de culcular **/
        String str = lb_telaBaixo.getText().substring(lb_telaBaixo.getText().length()-1);
        return str.matches("[+\\-×÷]");
    }

    public static boolean isContemParantese() {
        return contemParantese;
    }

    public void setContemParantese(boolean contemParantese) {
        TestaActionListener.contemParantese = contemParantese;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InitGlobalFont(f);
        lb_telaBaixo.setFont(f);
        new TestaActionListener();
    }
}