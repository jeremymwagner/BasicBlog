package com.jeremy.bloggingdemo.service;

import com.jeremy.bloggingdemo.entity.Tag;
import com.jeremy.bloggingdemo.repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jeremy on 11/2/17.
 */
@Service
public class TagService {

    @Autowired
    TagRepo tagRepo;

    public Tag createTag(Tag t){
        Tag  r = null;
        r =  tagRepo.create(t);
        return r;
    }

    public Tag findTag(int id){
        return tagRepo.findOne(id);
    }

    public Tag updateTag(Tag t){
        Tag r = null;
        r = tagRepo.update(t);
        return r;
    }

    public Tag deleteTag(Tag t){
        Tag r = null;
        r = tagRepo.delete(t.getId());
        return r;
    }

    public List<Tag> findAllTags(){
        return tagRepo.findAll();
    }
}
