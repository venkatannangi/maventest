package model.am;

import model.am.common.AppModule;

import model.vo.DcNgiZoneMasterViewImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 19 16:29:17 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }
    
    public String testBuild(String a){
        
     
     return "Test";   
    }

    /**
     * Container's getter for CpacityMgmtErrorsView1.
     * @return CpacityMgmtErrorsView1
     */
    public ViewObjectImpl getCpacityMgmtErrorsView1() {
        return (ViewObjectImpl) findViewObject("CpacityMgmtErrorsView1");
    }

    /**
     * Container's getter for DcNgiZoneMasterView1.
     * @return DcNgiZoneMasterView1
     */
    public DcNgiZoneMasterViewImpl getDcNgiZoneMasterView1() {
        return (DcNgiZoneMasterViewImpl) findViewObject("DcNgiZoneMasterView1");
    }
}

