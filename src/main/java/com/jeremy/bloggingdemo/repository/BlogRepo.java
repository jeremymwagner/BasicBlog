package com.jeremy.bloggingdemo.repository;

import com.jeremy.bloggingdemo.entity.Blog;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jeremy on 11/2/17.
 */
@Repository
@Transactional
public class BlogRepo extends GenericRepo<Blog> {
    public BlogRepo() {
    }
}
