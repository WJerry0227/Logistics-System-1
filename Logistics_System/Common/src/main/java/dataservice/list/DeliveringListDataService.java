package dataservice.list;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.list.DeliveringListPO;
import po.list.HallArrivalListPO;

public interface DeliveringListDataService extends Remote{
	
	public static final String NAME="deliveringListDataService";
	
	public boolean add (DeliveringListPO deliveringList)throws RemoteException;
	
	public boolean delete (DeliveringListPO deliveringList)throws RemoteException;
	
	public boolean update (DeliveringListPO deliveringList)throws RemoteException;
	
	public DeliveringListPO find(String id)throws RemoteException;
	
	public ArrayList<DeliveringListPO> showAll(String time1,String time2)throws RemoteException;
}
