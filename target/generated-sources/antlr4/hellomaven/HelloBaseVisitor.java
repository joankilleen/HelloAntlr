// Generated from hellomaven\Hello.g4 by ANTLR 4.0
package hellomaven;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class HelloBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements HelloVisitor<T> {
	@Override public T visitR(HelloParser.RContext ctx) { return visitChildren(ctx); }
}