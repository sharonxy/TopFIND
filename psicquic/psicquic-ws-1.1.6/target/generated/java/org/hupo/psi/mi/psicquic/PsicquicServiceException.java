
package org.hupo.psi.mi.psicquic;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.3
 * Wed Oct 10 16:44:26 PDT 2012
 * Generated source version: 2.2.3
 * 
 */

@WebFault(name = "psicquicFault", targetNamespace = "http://psi.hupo.org/mi/psicquic")
public class PsicquicServiceException extends Exception {
    public static final long serialVersionUID = 20121010164426L;
    
    private org.hupo.psi.mi.psicquic.PsicquicFault psicquicFault;

    public PsicquicServiceException() {
        super();
    }
    
    public PsicquicServiceException(String message) {
        super(message);
    }
    
    public PsicquicServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PsicquicServiceException(String message, org.hupo.psi.mi.psicquic.PsicquicFault psicquicFault) {
        super(message);
        this.psicquicFault = psicquicFault;
    }

    public PsicquicServiceException(String message, org.hupo.psi.mi.psicquic.PsicquicFault psicquicFault, Throwable cause) {
        super(message, cause);
        this.psicquicFault = psicquicFault;
    }

    public org.hupo.psi.mi.psicquic.PsicquicFault getFaultInfo() {
        return this.psicquicFault;
    }
}