package com.niit.OnlineBackend.dao;

import java.util.List;
import com.niit.OnlineBackend.model.category;

public interface categoryDAo 
{
  List<category> list();
  
  boolean add(category category);
  boolean Update(category category);
  boolean delete(category category);
}