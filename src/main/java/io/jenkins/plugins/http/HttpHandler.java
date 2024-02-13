 package io.jenkins.plugins.http;

 import hudson.Extension;
 import hudson.model.RootAction;
 import io.jenkins.plugins.model.MyJsonObject;
 import net.sf.json.JSONObject;
 import org.kohsuke.stapler.WebMethod;
 import org.kohsuke.stapler.json.JsonHttpResponse;
 import org.kohsuke.stapler.verb.GET;
 import org.springframework.lang.NonNull;
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
 }
