package com.shopping.mall.Repository;

import com.shopping.mall.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mallRepo extends JpaRepository<User,Integer>{

}
