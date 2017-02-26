/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Joan
 */
public class TestHello {

    private static final Logger LOG = Logger.getLogger(TestHello.class.getName());

    @Test
    public void testHello() throws IOException {
        String simplestProgram = "hello parrt";

        CharStream inputCharStream = new ANTLRInputStream(new StringReader(simplestProgram));
        HelloLexer lexer = new HelloLexer(inputCharStream);
        TokenSource tokenSource = new HelloLexer(inputCharStream);
        CommonTokenStream inputTokenStream = new CommonTokenStream(tokenSource);
        HelloParser parser = new HelloParser(inputTokenStream);
        ParseTree tree = parser.r();
       
        LOG.info(tree.toStringTree(parser));
        
        /* // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        // create a lexer that feeds off of input CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree*/
        

    }

}
