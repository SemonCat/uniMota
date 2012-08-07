package com.uniMota.service;

import java.util.List;

public interface I_CountryService {
	/**新增Country，新增成功=>回傳sn，失敗=>-1*/
	public abstract int insertCountry(TbCountry insertData);
	/**刪除CountryBySn*/
	public abstract boolean deleteCountryBySn(int sn);
	/**修改CountryBySn(NAME)*/
	public abstract boolean updateCountryBySn(int sn,String name);
	/**列出Country全部的資料*/
	public abstract List<TbCountry> findCountryAll();
	/**列出CountryBySn*/
	public abstract TbCountry findCountryBySn(int sn);
}
