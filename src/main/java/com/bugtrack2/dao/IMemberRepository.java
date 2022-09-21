package com.bugtrack2.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bugtrack2.entities.MemberEntities;

@Repository
public interface IMemberRepository extends CrudRepository<MemberEntities, Long> {

}
