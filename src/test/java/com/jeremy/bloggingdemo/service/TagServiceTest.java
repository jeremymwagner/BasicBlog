package com.jeremy.bloggingdemo.service;

import com.jeremy.bloggingdemo.entity.Tag;
import com.jeremy.bloggingdemo.repository.TagRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by jeremy on 11/2/17.
 */
public class TagServiceTest {

    @Mock
    private TagRepo tagRepo;

    @InjectMocks
    @Autowired
    private TagService tagService;


    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createNewTag(){
        Tag t = new Tag();
        t.setName("Travel");
        Tag result = tagService.createTag(t);
        List<Tag> list = tagRepo.findAll();
        //System.out.println(result);
        //Assert.assertEquals(t.getName(),result.getName());


    }
}
