package com.pts.DAO;

import com.pts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountDAO extends JpaRepository<Account,String> {

    @Query("select p from Account p where p.tps_Username =?1")
    Account laytk(String username);


}
