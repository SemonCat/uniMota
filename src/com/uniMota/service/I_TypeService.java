package com.uniMota.service;

import java.util.List;

public interface I_TypeService {
	/**�s�WType�A�s�W���\=>�^��sn�A����=>-1*/
	public abstract int insertDataType(TbType insertData);
	/**�ק�Type(NAME,Memo)*/
	public abstract boolean updateDataTypeBySn(int sn,String name,String memo);
	/**�R��Type*/
	public abstract boolean deleteDataTypeBySn(int sn);
	/**�C�XType BySn*/
	public abstract TbType findDataTypeBySn(int sn);
	/**�C�XType*/
	public abstract List<TbType> findDataTypeAll();
}
