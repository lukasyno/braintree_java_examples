package helloworld;

import org.ztemplates.render.ZExpose;
import org.ztemplates.render.ZRenderer;
import org.ztemplates.render.velocity.ZVelocityRenderer;

//this tells ztemplates to use velocity as a renderer
//by default the velocity template has the same name as
//the class but with extension '.vm'
@ZRenderer(ZVelocityRenderer.class)
public class HelloWorldVelocity {

    // make a property called 'message' available to
    // the rendering engine, in this case velocity
    @ZExpose
    public String getMessage() {
        return "Hello World!";
    }
}