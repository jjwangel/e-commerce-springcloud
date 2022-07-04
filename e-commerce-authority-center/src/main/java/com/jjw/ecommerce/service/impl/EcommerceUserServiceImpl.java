package com.jjw.ecommerce.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jjw.ecommerce.domain.entity.EcommerceUser;
import com.jjw.ecommerce.mapper.EcommerceUserMapper;
import com.jjw.ecommerce.service.IEcommerceUserService;
import org.springframework.stereotype.Service;

/**
 * <h1>t_ecommerce_user service</h1>
 */
@Service
public class EcommerceUserServiceImpl extends ServiceImpl<EcommerceUserMapper, EcommerceUser> implements IEcommerceUserService {

}
