package com.uniMota.service;

import java.util.List;

public interface I_ProductService {
	/**新增產品，新增成功=>回傳sn，失敗=>-1*/
	public abstract int insertProduct(TbProduct insertData);
	/**修改產品(NAME,CHARGE)*/
	public abstract boolean updateProductBySn(TbProduct updateData);
	/**刪除產品*/
	public abstract boolean deleteProductBySn(int sn);
	/**列出產品 BySn*/
	public abstract TbProduct findProductBySn(int sn);
	/**列出產品 By種類*/
	public abstract TbProduct findProductByType(int type);
	/**列出產品 By廠牌*/
	public abstract TbProduct findProductByCompany(int type);
	/**列出產品*/
	public abstract List<TbProduct> findProductAll();
}
