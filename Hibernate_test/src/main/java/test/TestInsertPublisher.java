package test;

import dao.impl.PublisherDAOimpl;
import entities.publisher;

public class TestInsertPublisher {
	public static void main(String[] args) {
		publisher p = new publisher();
		p.setPubId("sf313");
		p.setPubName("Nhà xuất bản bộ giáo dục");
		p.setActive(1);
		
		boolean bl = new PublisherDAOimpl().insertPublisher(p);
		if (bl) {
			System.out.println("Insert thành công");
		}else {
			System.out.println("Insert thất bại p !!!");
		}
	}

}
