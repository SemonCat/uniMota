package com.uniMota.service;

import java.util.List;

public interface I_CountryService {
	/**�s�WCountry�A�s�W���\=>�^��sn�A����=>-1*/
	public abstract int insertCountry(TbCountry insertData);
	/**�R��CountryBySn*/
	public abstract boolean deleteCountryBySn(int sn);
	/**�ק�CountryBySn(NAME)*/
	public abstract boolean updateCountryBySn(int sn,String name);
	/**�C�XCountry���������*/
	public abstract List<TbCountry> findCountryAll();
	/**�C�XCountryBySn*/
	public abstract TbCountry findCountryBySn(int sn);
}
