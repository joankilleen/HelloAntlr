/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joan
 */
package hellomaven;
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
public class TestArrayInit {

    private static final Logger LOG = Logger.getLogger(TestArrayInit.class.getName());
    
    @Test
    public void testArrayInit() throws IOException {
        
        String simplestProgram = "{1,{2,3},4}​";

        
        ANTLRInputStream input = new ANTLRInputStream(new StringReader(simplestProgram));

        // create a lexer that feeds off of input CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init(); // begin parsing at init rule
        LOG.info(tree.toStringTree(parser)); // print LISP-style
    }
    
}
