package bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	static int id = 0;
	int tranactionId;
	String type;
	LocalDateTime transDate;
	float amount;
	String remark;

	public Transaction(int tranactionId, String type, LocalDateTime transDate, float amount, String remark) {
		super();
		this.tranactionId = tranactionId;
		this.type = type;
		this.transDate = transDate;
		this.amount = amount;
		this.remark = remark;
	}

	public int getTranactionId() {
		return tranactionId;
	}

	public void setTranactionId(int tranactionId) {
		this.tranactionId = tranactionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getTransDate() {
		return transDate;
	}

	public void setTransDate(LocalDateTime transDate) {
		this.transDate = transDate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = transDate.format(formatter);
		return tranactionId + " . " + type + " " + formattedDate + " Remark: " + remark + " RS: " + amount;
	}

	public static int generateID() {
		id++;
		return id;
	}

}
