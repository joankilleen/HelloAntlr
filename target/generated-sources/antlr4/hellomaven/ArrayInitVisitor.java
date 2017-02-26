// Generated from hellomaven\ArrayInit.g4 by ANTLR 4.0
package hellomaven;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ArrayInitVisitor<T> extends ParseTreeVisitor<T> {
	T visitInit(ArrayInitParser.InitContext ctx);

	T visitValue(ArrayInitParser.ValueContext ctx);
}