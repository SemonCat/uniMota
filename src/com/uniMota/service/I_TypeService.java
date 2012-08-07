package com.uniMota.service;

import java.util.List;

public interface I_TypeService {
	/**新增Type，新增成功=>回傳sn，失敗=>-1*/
	public abstract int insertDataType(TbType insertData);
	/**修改Type(NAME,Memo)*/
	public abstract boolean updateDataTypeBySn(int sn,String name,String memo);
	/**刪除Type*/
	public abstract boolean deleteDataTypeBySn(int sn);
	/**列出Type BySn*/
	public abstract TbType findDataTypeBySn(int sn);
	/**列出Type*/
	public abstract List<TbType> findDataTypeAll();
}
