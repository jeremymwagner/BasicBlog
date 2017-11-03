package com.jeremy.bloggingdemo.controller;

import com.jeremy.bloggingdemo.entity.Tag;
import com.jeremy.bloggingdemo.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jeremy on 11/2/17.
 */
@RestController
@RequestMapping("/tags")
public class TagController {

    @Autowired
    TagService tagService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Tag retrieveTagById(@PathVariable(name = "id") Integer id){
        return tagService.findTag(id);
    }

    @RequestMapping( value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Tag> retrieveAllTags(){
        return tagService.findAllTags();
    }

    @RequestMapping(method= RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Tag createNewTag(@RequestBody Tag tag){
        return tagService.createTag(tag);
    }

    @RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Tag updateTag(@RequestBody Tag tag){
        return tagService.updateTag(tag);
    }

    @RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Tag deleteTag(@RequestBody Tag tag){
        return tagService.deleteTag(tag);
    }
}
