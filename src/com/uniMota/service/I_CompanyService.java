package com.uniMota.service;

import java.util.List;

public interface I_CompanyService {
	/**�s�W�t�P�A�s�W���\=>�^��sn�A����=>-1*/
	public abstract int insertCompany(TbCompany insertData);
	/**�R���t�PBySn*/
	public abstract boolean deleteCompanyBySn(int sn);
	/**�ק�t�PBySn(NAME)*/
	public abstract boolean updateCompanyBySn(int sn,String name);
	/**�C�X�t�P���������*/
	public abstract List<TbCompany> findCompanyAll();
	/**�C�X�t�PBySn*/
	public abstract TbCompany findCompanyBySn(int sn);
}
