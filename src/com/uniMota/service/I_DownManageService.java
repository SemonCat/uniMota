package com.uniMota.service;

public interface I_DownManageService {
	/**下載檔案，下載成功=>回傳sn，失敗=>-1*/
	public abstract int Download(int fk_product,int fk_account);
	/**列出下載紀錄*/
	public abstract <List>TbDownloads findDownedByAccount(int fk_account);
}
