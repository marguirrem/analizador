package com.umg.lexer;


public class Token {

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    private Tipos tipo;
    private String valor;

    enum Tipos {
        NUMERO ("[0-9]+"),
        OPERADOR_ARITMETICO("[*|/|+|-]+"),
        OPERADOR_IGUALACION("[=|==]+"),
        OPERADOR_INCREMENTO("[++]+"),
        OPERADOR_DECREMENTO("[--]+"),
        OPERADOR_COMPRACION("[<|>|<=|>=]+"),
        TIPO_ENTERO("[int]+"),
        TIPO_DOUBLE("[double]+"),
        TIPO_FLOAT("[float]+"),
        SIMBOLOS("[;|]+"),
        ESTRUCTURAS_CONTROL("[if|else|if else]+"),
        INICIO_BLOQUE("[(|{]+"),
        FIN_BLOQUE("[)|}]+"),
        CICLOS("[while|for|]+");

        public final String patron;
        Tipos(String s) {
            this.patron = s;
        }
    }

}