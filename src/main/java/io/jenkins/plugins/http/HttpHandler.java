 package io.jenkins.plugins.http;

 import static java.util.Objects.requireNonNull;
 import hudson.Extension;
 import hudson.model.RootAction;
 import io.jenkins.plugins.model.MyJsonObject;
 import net.sf.json.JSONObject;
 import org.kohsuke.stapler.QueryParameter;
 import org.kohsuke.stapler.WebMethod;
 import org.kohsuke.stapler.json.JsonHttpResponse;
 import org.kohsuke.stapler.verb.GET;
 import edu.umd.cs.findbugs.annotations.CheckForNull;

 @Extension
 public class HttpHandler implements RootAction {

    @CheckForNull
    @Override
    public String getIconFileName() {
        return null;
    }

    @CheckForNull
    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getUrlName() {
        return "custom-api";
    }

    @GET
    @WebMethod(name="get-example")
     public JsonHttpResponse getExample() {
        JSONObject response = JSONObject.fromObject(new MyJsonObject("I am jenkins", 10));
        return new JsonHttpResponse(response, 200);
    }

    @GET
    @WebMethod(name="get-example-param")
    public JsonHttpResponse getWithParams(@QueryParameter(required = true) String paramValue){
        requireNonNull(paramValue);
        MyJsonObject myJsonObject = new MyJsonObject("I am jenkins" + paramValue);
        JSONObject response = JSONObject.fromObject(myJsonObject);
        return new JsonHttpResponse(response, 200);
    }
 }
