package service;

import java.util.List;

import dao.ItemDAO;
import model.Item;

public class ItemService {
	ItemDAO itemDAO = new ItemDAO();

	public List<Item> getAllItems() {
		List<Item> itemList = itemDAO.getAllUsers();
		return itemList;
	}

	public Item getItemForId(String id) {
		Item item = itemDAO.getUserForId(id);
		return item;
	}

	public Item createItem(Item item) {
		Item itemResponse = itemDAO.createUser(item);
		return itemResponse;
	}

	public Item updateItem(Item item) {
		Item itemResponse = itemDAO.updateUser(item);
		return itemResponse;
	}

	public Item deleteItem(String id) {
		Item itemResponse = itemDAO.deleteUser(id);
		return itemResponse;
	}

}
