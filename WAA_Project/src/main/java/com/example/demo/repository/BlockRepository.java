package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Block;

@Repository
public interface BlockRepository extends JpaRepository<Block, Integer> {

	@Query(value="select distinct b.* "
			+ "from Block b "
			+ "inner join block_session bs on b.id = bs.block_id "
			+ "where bs.session >= :entryDate order by b.begin_date", nativeQuery=true)
	List<Block> getBlockByEntryDate(Date entryDate);
}
