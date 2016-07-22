/*
 * Powered By [Transnal ES Framework]
 * Web Site: http://www.transnal.com
 * Copyright (c) 2010 - 2014
 */
package com.xdrt.manager.news.link.service;

import com.xdrt.manager.common.inject.annotation.BaseComponent;
import com.xdrt.manager.common.service.BaseService;
import com.xdrt.manager.news.link.entity.Link;
import com.xdrt.manager.news.link.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * User: Transnal Team
 * Date: 2014-11-25
 * Version: 1.0
 */
@Service
public class LinkService extends BaseService<Link, String> {

    @Autowired
    @BaseComponent
    private LinkRepository linkRepository;

}
