import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;




public class ProgMain {
    public static void main(String[] args) {
        String fileName = args[0];
        File file = new File(fileName);
        FileInputStream f = null;

        try {
            f = new FileInputStream(file);
            ANTLRInputStream input = new ANTLRInputStream(f);
			progLexer lexer = new progLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            progParser parser = new progParser(tokens);
            ParseTree tree = parser.start();
			
			Visitor visitor=new Visitor();
			visitor.visit(tree);
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}