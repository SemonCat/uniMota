package com.uniMota.service;

import java.util.List;

public interface I_ProductService {
	/**�s�W���~�A�s�W���\=>�^��sn�A����=>-1*/
	public abstract int insertProduct(TbProduct insertData);
	/**�קﲣ�~(NAME,CHARGE)*/
	public abstract boolean updateProductBySn(TbProduct updateData);
	/**�R�����~*/
	public abstract boolean deleteProductBySn(int sn);
	/**�C�X���~ BySn*/
	public abstract TbProduct findProductBySn(int sn);
	/**�C�X���~ By����*/
	public abstract TbProduct findProductByType(int type);
	/**�C�X���~ By�t�P*/
	public abstract TbProduct findProductByCompany(int type);
	/**�C�X���~*/
	public abstract List<TbProduct> findProductAll();
}
