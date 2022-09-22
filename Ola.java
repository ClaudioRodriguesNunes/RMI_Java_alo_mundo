import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Ola extends Remote {  /*Interface remota define os metodos remotos e que vai ser implmentada no nosso objeto remoto.
                                        Então todos os métodos são públicos.
                                        Define tb quais os metodos poderá ser requisitados.
                                        // interface é um tipo de classe que obriga os metodos que devem ser implementadas*/
    String digaOla () throws RemoteException; /*throws é a palavra reservada para lançar execções.
                                                RemoteExceptiion que é uma exceção da API java RMI. É abstrato (não tem corpo)*/
}

/*
Definir interface remota
Definir servidor
Definir cliente
Implementação da interface remota
 */