import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import org.stringtemplate.v4.ST;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PDrawMain {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java PDrawMain <file.pdraw>");
            System.exit(1);
        }

        try {
            // Create a CharStream that reads from the file specified in the argument:
            CharStream input = CharStreams.fromFileName(args[0]);
            // Create a lexer that feeds off of input CharStream:
            PDrawLexer lexer = new PDrawLexer(input);
            // Create a buffer of tokens pulled from the lexer:
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Create a parser that feeds off the tokens buffer:
            PDrawParser parser = new PDrawParser(tokens);
            // Begin parsing at program rule:
            ParseTree tree = parser.program();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                // Semantic analysis and code generation:
                SemanticAnalyser visitor0 = new SemanticAnalyser();
                if (visitor0.visit(tree)) {
                    PDrawCompiler visitor1 = new PDrawCompiler();
                    ST output = visitor1.visit(tree);

                    String file_name = new File(args[0]).getName().replace(".pdraw", "Compiled.py");

                    try {
                        File directory = new File("../results/");
                        if (!directory.exists()) {
                            directory.mkdirs();
                        }
                        File file = new File(directory, file_name);
                        try (FileWriter writer = new FileWriter(file, false)) {
                            writer.write(output.render());
                            System.out.println("File created/overwritten -> " + file.getName());
                            System.out.println("Execute the bash script to test the code generated -> ./run.sh " + file.getName());
                        } catch (IOException e) {
                            System.out.println("An error occurred while writing to the file.");
                            e.printStackTrace();
                            System.exit(1);
                        }
                    } catch (Exception e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                        System.exit(1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (RecognitionException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}