import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String[] args) {
        //Procurar pelo objeto remoto no Registry e devolver o Stub
        //stub faz o papel de servidor no client
        try {
            Ola stub = (Ola) Naming.lookup("rmi://localhost:1099/Ola"); //devolve um objeto remoto
            System.out.println(stub.digaOla());

        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
