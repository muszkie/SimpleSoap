package DefaultNamespace;

public class SimpleSoapMethodsProxy implements DefaultNamespace.SimpleSoapMethods {
  private String _endpoint = null;
  private DefaultNamespace.SimpleSoapMethods simpleSoapMethods = null;
  
  public SimpleSoapMethodsProxy() {
    _initSimpleSoapMethodsProxy();
  }
  
  public SimpleSoapMethodsProxy(String endpoint) {
    _endpoint = endpoint;
    _initSimpleSoapMethodsProxy();
  }
  
  private void _initSimpleSoapMethodsProxy() {
    try {
      simpleSoapMethods = (new DefaultNamespace.SimpleSoapMethodsServiceLocator()).getSimpleSoapMethods();
      if (simpleSoapMethods != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)simpleSoapMethods)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)simpleSoapMethods)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (simpleSoapMethods != null)
      ((javax.xml.rpc.Stub)simpleSoapMethods)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.SimpleSoapMethods getSimpleSoapMethods() {
    if (simpleSoapMethods == null)
      _initSimpleSoapMethodsProxy();
    return simpleSoapMethods;
  }
  
  public java.lang.String date() throws java.rmi.RemoteException{
    if (simpleSoapMethods == null)
      _initSimpleSoapMethodsProxy();
    return simpleSoapMethods.date();
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (simpleSoapMethods == null)
      _initSimpleSoapMethodsProxy();
    return simpleSoapMethods.sayHello(name);
  }
  
  public int calcAdd(int num1, int num2) throws java.rmi.RemoteException{
    if (simpleSoapMethods == null)
      _initSimpleSoapMethodsProxy();
    return simpleSoapMethods.calcAdd(num1, num2);
  }
  
  
}