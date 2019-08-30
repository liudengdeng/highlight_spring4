package com.summer.chl.condition;

public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
