package org.marlonaguirre.compiladores.core;

import org.marlonaguirre.compiladores.core.sistema.*;
import java.io.File;

public class Principal {
    
    public static void main(String[] args) {
        String ruta="/home/marlon/proyectos/netbeans/Compiladores/src/org/marlonaguirre/compiladores/core/Lexer.flex";
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
