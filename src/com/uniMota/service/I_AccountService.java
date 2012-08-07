package com.uniMota.service;

import java.util.List;

public interface I_AccountService {
	/**新增帳號，新增成功=>回傳sn，失敗=>-1*/
	public abstract int insertAccount(TbAccount insertData);
	/**修改帳號(EMail，密碼)*/
	public abstract boolean updateAccountBySn(int sn,String email,String pwd);
	/**刪除帳號*/
	public abstract boolean deleteAccountBySn(int sn);
	/**列出帳號BySn*/
	public abstract TbAccount findAccountBySn(int sn);
	/**列出帳號*/
	public abstract List<TbAccount> findAccountAll();	
	/**搜尋ByEmail*/
	public abstract TbAccount findAccountByEMail(String email);		

}
