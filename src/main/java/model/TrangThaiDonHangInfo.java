package model;

import java.util.List;

import com.example.demo.entities.Food;
import com.example.demo.entities.Order;

public class TrangThaiDonHangInfo {
	
	private Integer orderCount;
	private Integer receivedCount;
	private Integer packedCount;
	private Integer paidCount;
	private Integer deliveriedCount;
	private Integer cancelCount;
	
	private Integer foodCount;
	private Integer incomingMoney;
	
	public void Sumary(List<Order> orders, List<Food> foods)
	{
		this.orderCount = 0;
		this.receivedCount = 0;
		this.packedCount = 0;
		this.paidCount = 0;
		this.deliveriedCount = 0;
		this.cancelCount = 0;
		this.incomingMoney = 0;
		
		
		for (Order o : orders) {
			this.orderCount++;
			switch (o.getStatus())
			{
			case RECEIVED:
				this.receivedCount++;
				break;
			case PACKED:
				this.packedCount++;
				break;
			case PAID:
				this.paidCount++;
				break;
			case DELIVERIED:
				this.deliveriedCount++;
				break;
			case CANCEL:
				this.cancelCount++;
				break;
			}
		}			
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Integer getReceivedCount() {
		return receivedCount;
	}

	public void setReceivedCount(Integer receivedCount) {
		this.receivedCount = receivedCount;
	}

	public Integer getPackedCount() {
		return packedCount;
	}

	public void setPackedCount(Integer packedCount) {
		this.packedCount = packedCount;
	}

	public Integer getPaidCount() {
		return paidCount;
	}

	public void setPaidCount(Integer paidCount) {
		this.paidCount = paidCount;
	}

	public Integer getDeliveriedCount() {
		return deliveriedCount;
	}

	public void setDeliveriedCount(Integer deliveriedCount) {
		this.deliveriedCount = deliveriedCount;
	}

	public Integer getCancelCount() {
		return cancelCount;
	}

	public void setCancelCount(Integer cancelCount) {
		this.cancelCount = cancelCount;
	}

	public Integer getFoodCount() {
		return foodCount;
	}

	public void setFoodCount(Integer foodCount) {
		this.foodCount = foodCount;
	}

	public Integer getIncomingMoney() {
		return incomingMoney;
	}

	public void setIncomingMoney(Integer incomingMoney) {
		this.incomingMoney = incomingMoney;
	}
	
	public TrangThaiDonHangInfo(Integer orderCount, Integer receivedCount, Integer packedCount, 
			Integer paidCount, Integer deliveriedCount, Integer cancelCount, Integer incomingMoney, Integer foodCount)
	{
		super();
		this.orderCount = orderCount;
		this.receivedCount = receivedCount;
		this.packedCount = packedCount;
		this.paidCount = paidCount;
		this.deliveriedCount = deliveriedCount;
		this.cancelCount = cancelCount;
		this.foodCount = foodCount;
		this.incomingMoney = incomingMoney;
	}
	
	public TrangThaiDonHangInfo()
	{
		super();
	}
}
