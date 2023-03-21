package com.practice.mapper;

import com.practice.domain.ComputerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComputerMapper {
    List<ComputerVO> get_all_computer();

    ComputerVO get_computer_by_serialName(String serialNumber);

    List<ComputerVO> get_computer_by_ram(String ram);
}
