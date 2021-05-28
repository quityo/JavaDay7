package hrsm.hrsm.adapters;

import java.rmi.RemoteException;


import hrsm.hrsm.business.Abstracts.UserCheckService;
import hrsm.hrsm.entities.Concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

	public class MernisServiceAdapter implements UserCheckService{

		@Override
		
		public boolean checkIfRealPerson(JobSeeker jobSeeker) {

			

			KPSPublicSoapProxy client = new KPSPublicSoapProxy();

			try {
				return client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalyIdentity()), jobSeeker.getFirstName().toUpperCase(),
						jobSeeker.getLastName().toUpperCase(), jobSeeker.getBirthDate());

			} catch (RemoteException e) {
				e.printStackTrace();
			}

			return false;

		}
		
	}
