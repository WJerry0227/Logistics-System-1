package dataImpl.agency;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.agency.StaffPO;
import po.system.UserPO;
import utility.UserType;
import dataservice.agency.StaffDataService;

public class StaffDataImpl implements StaffDataService {

	public void add(StaffPO staff)  {
		// TODO Auto-generated method stub

	}

	public void delete(StaffPO staff)  {
		// TODO Auto-generated method stub

	}

	public void update(StaffPO staff)  {
		// TODO Auto-generated method stub

	}

	public StaffPO find(String id){
		// TODO Auto-generated method stub
		StaffPO po=null;
		if(id.compareTo("admin")==0)
			//po = new StaffPO("admin","admin",UserType.COURIER,"无权限汪");
			po = new StaffPO(id, id, id, id, 0, id, 0, id, id);
		
		return po;
	}

	public ArrayList<StaffPO> showAll() {
		// TODO Auto-generated method stub
		return null;
	}

}