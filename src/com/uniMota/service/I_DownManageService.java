package com.uniMota.service;

public interface I_DownManageService {
	/**�U���ɮסA�U�����\=>�^��sn�A����=>-1*/
	public abstract int Download(int fk_product,int fk_account);
	/**�C�X�U������*/
	public abstract <List>TbDownloads findDownedByAccount(int fk_account);
}
