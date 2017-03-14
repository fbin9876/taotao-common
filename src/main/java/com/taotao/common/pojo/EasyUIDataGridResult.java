package com.taotao.common.pojo;

import java.util.List;

/**
 * EasyUIDataGridResult包装类
 * <p>
 * Title: EasyUIDataGridResult
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: www.taotao.com
 * </p>
 * 
 * @author fb
 * @date 2017年3月2日 下午8:45:27
 * @version 1.0
 */
public class EasyUIDataGridResult {

	private long total;
	private List<?> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
