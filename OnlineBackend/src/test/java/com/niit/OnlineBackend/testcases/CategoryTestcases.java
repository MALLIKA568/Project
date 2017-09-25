package com.niit.OnlineBackend.testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.OnlineBackend.dao.categoryDAo;
import com.niit.OnlineBackend.model.category;


public class CategoryTestcases
{
private static AnnotationConfigApplicationContext context;
private static categoryDAo categoryDAO;
private category category;

@BeforeClass
public static void intit()
{
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.OnlineBackend");
	context.refresh();
	categoryDAO=(categoryDAo)context.getBean("categoryDAO");
}
@Test
public void testAddCategory()
{
	category=new category();
	category.setName("television");
	category.setDescription("desrcription about tv");
	category.setImageURL("cat_106.png");
	assertEquals("successfully added a category inside table",true,categoryDAO.add(category));
}
@Test
public void testUpdateCategory()
{
	category=new category();
	category.setName("television");
	category.setDescription("desrcription about tv");
	category.setImageURL("cat_106.png");
	assertEquals("successfully added a category inside table",true,categoryDAO.Update(category));
}
@Test
public void testdeleteCategory()
{
	category=new category();
	category.setName("television");
	category.setDescription("desrcription about tv");
	category.setImageURL("cat_106.png");
	assertEquals("successfully added a category inside table",true,categoryDAO.delete(category));
}
}