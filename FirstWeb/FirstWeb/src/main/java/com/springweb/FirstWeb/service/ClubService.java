package com.springweb.FirstWeb.service;

import com.springweb.FirstWeb.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
