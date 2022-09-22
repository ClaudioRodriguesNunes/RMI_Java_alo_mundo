import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OlaImpl extends UnicastRemoteObject implements Ola{ /*classe implements cria objetios e estes são remotos.
Primeiramente se estende, depois coloca herança e depois implmenta*/
    private static final long serialVersionUID = 1L; /*Serialização.  Controle para diferença entre bojetos por causa das trocas.*/

    protected OlaImpl() throws RemoteException {
        super();
    }

    @Override
    public String digaOla() throws RemoteException {
        return "Ola Mundo!";
    }
}