/**
 * 2015年10月23日
 *author:
 *description:收款单PO
 */
package po;

import java.io.Serializable;

/**
 * @author 谭期友
 *
 */
public class MoneyOutListPO extends ListPO implements Serializable{
	/**
	 * 日期
	 */
	private String date;
	
	/**
	 * 金额
	 */
	private double money;
	
	/**
	 * 付款人
	 */
	private String payer;
	
	/**
	 * 银行账号
	 */
	private String accountNum;
	
	/**
	 * 条目
	 */
	private String clause;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 构造方法
	 * @param date
	 * @param money
	 * @param payer
	 * @param accountNum
	 * @param clause
	 * @param note
	 */
	public MoneyOutListPO(String date,double money,String payer,String accountNum,
			String clause,String note){
		this.date = date;
		this.money = money;
		this.payer = payer;
		this.accountNum = accountNum;
		this.clause=clause;
		this.note=note;
	}

	public String getDate() {
		return date;
	}

	public double getMoney() {
		return money;
	}

	public String getPayer() {
		return payer;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getClause() {
		return clause;
	}
	public String getNote(){
		return note;
	}
}