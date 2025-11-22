package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("==== TEST 1: SELLER FINDBYID =====");
		Seller sel = sellerDao.findById(3);
		System.out.println(sel);
		System.out.println("==== TEST 2: SELLER FINDBYDEPARTMENT =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("==== TEST 3: SELLER FINDBYall =====");
		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		//System.out.println("==== TEST 4: SELLER INSERT =====");
		//Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New Id = " + newSeller.getId());

		System.out.println("==== TEST 5: SELLER UPDATE =====");
		
		//sel = sellerDao.findById(1);
		//sel.setName("Martha Whayne");
		//sellerDao.update(sel);
		
		//System.out.println("Update complete!");
		
		
		
		System.out.println("==== TEST 6: SELLER UPDATE =====");
		System.out.println("Enter ID for deleted test");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}
	
	
	
	
}