package com.uniMota.service;

import java.util.List;

public interface I_CompanyService {
	/**新增廠牌，新增成功=>回傳sn，失敗=>-1*/
	public abstract int insertCompany(TbCompany insertData);
	/**刪除廠牌BySn*/
	public abstract boolean deleteCompanyBySn(int sn);
	/**修改廠牌BySn(NAME)*/
	public abstract boolean updateCompanyBySn(int sn,String name);
	/**列出廠牌全部的資料*/
	public abstract List<TbCompany> findCompanyAll();
	/**列出廠牌BySn*/
	public abstract TbCompany findCompanyBySn(int sn);
}
