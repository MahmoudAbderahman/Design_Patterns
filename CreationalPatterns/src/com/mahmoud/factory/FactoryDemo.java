package com.mahmoud.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Website site = WebsiteFactory.getWebsite("blog");
		
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite("shop");
		
		System.out.println(site.getPages());
	}

}
