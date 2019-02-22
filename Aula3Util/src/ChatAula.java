import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ChatAula extends UnicastRemoteObject implements IChatAula {
	
	private static final long serialVersionUID = 7004671466388954207L;

	public ChatAula() throws RemoteException {
		super();
	}
	
	@Override
	public void sendMessage(Message msg) throws RemoteException {
		Message.setLstMessage(msg);
	}
	
	@Override
	public List<Message> retrieveMessage() throws RemoteException {
		return Message.getLstMessage();
	}

}
