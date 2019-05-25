package resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Item;
import service.ItemService;

@Path("/itemInfo")
public class ItemResource {
	ItemService itemService = new ItemService();

	// CRUD -- CREATE operation
	@POST
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Item createItem(@FormParam("id") String id,@FormParam("name") String 
                                                          name,@FormParam("age") int price)      
        {
		Item item = new Item();
		item.setId(id);
		item.setName(name);
		item.setPrice(price);
		Item itemResponse = itemService.createItem(item);
		return itemResponse;
	}

	// CRUD -- READ operation
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Item> getAllUsers() {
		List<Item> itemList = itemService.getAllItems();
		return itemList;
	}


	// CRUD -- UPDATE operation
	@PUT
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Item updateUser(@FormParam("id") String id,@FormParam("name") String 
                                                         name,@FormParam("age") int price)
       {
		Item item = itemService.getItemForId(id);
		item.setName(name);
		item.setPrice(price);
		Item itemResponse = itemService.updateItem(item);
		return itemResponse;
	}

	// CRUD -- DELETE operation
	@DELETE
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Item deleteeUser(@FormParam("id") String id) {
		Item itemResponse = itemService.deleteItem(id);
		return itemResponse;
	}
}