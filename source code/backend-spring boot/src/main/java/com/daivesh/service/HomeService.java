package com.daivesh.service;

import com.daivesh.model.Home;
import com.daivesh.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
