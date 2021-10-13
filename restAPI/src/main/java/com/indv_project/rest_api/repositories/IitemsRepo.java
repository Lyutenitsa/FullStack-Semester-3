package com.indv_project.rest_api.repositories;

import com.indv_project.rest_api.models.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IitemsRepo extends JpaRepository<Item, Long> {
    Item findItemByBody(String body);

}
