package hellomaven;

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
import org.antlr.v4.runtime.tree.ParseTreeWalker;
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
        
        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new SimpleListener(), tree);
        System.out.println(); // print a \n after translation
        
        

    }

}
