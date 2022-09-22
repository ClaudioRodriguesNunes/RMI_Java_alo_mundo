import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.createRegistry(1099); //Criar uma instância no Registry
            Naming.rebind("rmi://localhost:1099/Ola", new OlaImpl()); //responsável em criar o skeleton

            /* Vincular o Rebind a implementação do ojeto remoto no Registry usando o Naming
            Rebind e Rebind = Bind registra o objeto no servidor registro e caso já tenha algum já registrado, daria erro.
            no cso do Rebind substiui
            parabmetros name: Local do objeto remoto.
            parametros objts: Instancia do objeto remoto.
             */

            System.out.println("Sevidor levantou");
        } catch (RemoteException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
        /* rmi.registro é um servidor que fica rodando na máquina é responsável em guardar os objetos remotos
        O cliente busca o esboço do objeto remoto no servidor registro. E  necessario instanciar o servidor registro.
        A classe locateRegistry chama o metodo createRegistry (levanta o servidor RMI Registro) pede a porta de acesso do servidor RMI.*/
    }
}
