package com.jeremy.bloggingdemo.repository;

import com.jeremy.bloggingdemo.entity.Tag;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jeremy on 11/2/17.
 */
@Repository
@Transactional
public class TagRepo extends GenericRepo<Tag> {
    public TagRepo() {
    }
}
