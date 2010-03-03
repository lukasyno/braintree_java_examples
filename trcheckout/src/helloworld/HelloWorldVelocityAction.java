package helloworld;

import org.ztemplates.actions.ZMatch;
import org.ztemplates.web.ZTemplates;

@ZMatch("/helloworld/velocity")
public class HelloWorldVelocityAction {
    public void after() throws Exception {
        ZTemplates.getServletService().render(new HelloWorldVelocity());
    }
}