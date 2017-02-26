package hellomaven;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hellomaven.HelloBaseListener;
import java.util.logging.Logger;

/**
 *
 * @author Joan
 */
public class SimpleListener extends HelloBaseListener {

    private static final Logger LOG = Logger.getLogger(SimpleListener.class.getName());
    
    @Override
    public void enterR(hellomaven.HelloParser.RContext ctx) {
        LOG.info("enterR...");
        LOG.info(ctx.getText());
    }

    @Override
    public void exitR(hellomaven.HelloParser.RContext ctx) {
        LOG.info("exit...");
        LOG.info(ctx.getText());
    }

}
