//package com.luv2code.hibernate.demo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import com.luv2code.hibernate.demo.entity.Players;
//import com.luv2code.hibernate.demo.entity.*;
//
//
//public class CreatePlayersDemo {
//
//	public static void main(String[] args) {
//		
//		
//		
//		
//		//create session factory
//		SessionFactory factory = new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Players.class)
//				.buildSessionFactory();
//		
//		//create session
//		Session session = factory.getCurrentSession();
//		
//		try {
//			//create player object
//			System.out.println("Creating a new player object...");
//			Players tempPlayer = new Players();
//			
//			//start a transaction
//			session.beginTransaction();	
//			
//			//save player object
//			System.out.println("Saving the player...");
//			session.save(tempPlayer);
//			
//			//commit transaction
//			session.getTransaction().commit();
//			System.out.println("Done!");
//			
//			
//			
//		}
//		finally {
//			factory.close();
//		}
//		
//		
//
//	}
//
//}
