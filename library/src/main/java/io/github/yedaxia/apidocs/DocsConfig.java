package io.github.yedaxia.apidocs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yeguozhong yedaxia.github.com
 */
public class DocsConfig {

    String projectPath; // must set
    List<String> javaSrcPaths = new ArrayList<>(); //multi modules support
    String docsPath; // default equals projectPath
    String codeTplPath; // if empty, use the default resources
    String mvcFramework; //spring, play, jfinal, generic, can be empty

    String rapHost;
    String rapLoginCookie;
    String rapProjectId;
    String rapAccount;
    String rapPassword;

    List<IPluginSupport> plugins = new ArrayList<>();

    List<IPluginSupport> getPlugins() {
        return plugins;
    }

    /**
     * add your own plugin, example:
     * @see io.github.yedaxia.apidocs.plugin.rap.RapSupportPlugin
     * @param plugin
     */
    public void addPlugin(IPluginSupport plugin) {
        this.plugins.add(plugin);
    }

    boolean isSpringMvcProject(){
        return mvcFramework != null && mvcFramework.equals("spring");
    }

    boolean isPlayProject(){
        return mvcFramework != null && mvcFramework.equals("play");
    }

    boolean isJfinalProject(){
        return mvcFramework != null && mvcFramework.equals("jfinal");
    }

    boolean isGeneric(){
        return mvcFramework != null && mvcFramework.equals("generic");
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public void setDocsPath(String docsPath) {
        this.docsPath = docsPath;
    }

    public void setCodeTplPath(String codeTplPath) {
        this.codeTplPath = codeTplPath;
    }

    public void setMvcFramework(String mvcFramework) {
        this.mvcFramework = mvcFramework;
    }

    public String getRapHost() {
        return rapHost;
    }

    public void setRapHost(String rapHost) {
        this.rapHost = rapHost;
    }

    public String getRapLoginCookie() {
        return rapLoginCookie;
    }

    /**
     * use http://rap.yedaxia.me , just set account and password would be better
     *
     * @param rapLoginCookie
     */
    @Deprecated
    public void setRapLoginCookie(String rapLoginCookie) {
        this.rapLoginCookie = rapLoginCookie;
    }

    public String getRapProjectId() {
        return rapProjectId;
    }

    public void setRapProjectId(String rapProjectId) {
        this.rapProjectId = rapProjectId;
    }

    public String getRapAccount() {
        return rapAccount;
    }

    public void setRapAccount(String rapAccount) {
        this.rapAccount = rapAccount;
    }

    public String getRapPassword() {
        return rapPassword;
    }

    public void setRapPassword(String rapPassword) {
        this.rapPassword = rapPassword;
    }

    public List<String> getJavaSrcPaths() {
        return javaSrcPaths;
    }

    /**
     * if cannot find the java file from other module, you can try to config the java src path yourself.
     *
     * @param javaSrcPath
     */
    public void addJavaSrcPath(String javaSrcPath){
        javaSrcPaths.add(javaSrcPath);
    }
}
