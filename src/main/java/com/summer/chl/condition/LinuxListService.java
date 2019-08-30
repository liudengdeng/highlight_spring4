package com.summer.chl.condition;

public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
