package com.cricket.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.app.beans.TeamBean;

public interface TeamRepository  extends JpaRepository<TeamBean, Integer> {

}
