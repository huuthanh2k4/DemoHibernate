package dao;

import java.util.List;

import entities.publisher;

public interface PublisherDAO {
	public List<publisher>getpuPublishers();
	public boolean insertPublisher(publisher pub);

}
