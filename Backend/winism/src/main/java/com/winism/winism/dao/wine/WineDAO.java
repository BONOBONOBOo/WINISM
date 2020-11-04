package com.winism.winism.dao.wine;

import com.winism.winism.model.wine.wineList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WineDAO  extends JpaRepository<wineList, String> {
    wineList findByWid(int wid);
}