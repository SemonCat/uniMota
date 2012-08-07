package com.uniMota.service;

import java.util.List;

public interface I_AccountService {
	/**�s�W�b���A�s�W���\=>�^��sn�A����=>-1*/
	public abstract int insertAccount(TbAccount insertData);
	/**�ק�b��(EMail�A�K�X)*/
	public abstract boolean updateAccountBySn(int sn,String email,String pwd);
	/**�R���b��*/
	public abstract boolean deleteAccountBySn(int sn);
	/**�C�X�b��BySn*/
	public abstract TbAccount findAccountBySn(int sn);
	/**�C�X�b��*/
	public abstract List<TbAccount> findAccountAll();	
	/**�j�MByEmail*/
	public abstract TbAccount findAccountByEMail(String email);		

}
